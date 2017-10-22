package web;

import dao.commentDAO;
import entity.comt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class someServlet extends HttpServlet {
    public void service(
            HttpServletRequest request,
            HttpServletResponse response)
    throws ServletException,IOException{
        System.out.println("service()");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        //获取请求资源路径
        String uri=request.getRequestURI();
        System.out.println("uri:"+uri);
        //分析请求资源路径
        String action=uri.substring(
                uri.lastIndexOf("/"),
                uri.lastIndexOf(".")
        );
        System.out.println("action:"+action);
        //依据获取的action做不同的处理
        if("/list".equals(action)){
            System.out.println("显示所有微博");
            //查询微博内容
            commentDAO dao=new commentDAO();
            System.out.println("dao");
            try {
                List<comt> comts=dao.findAll();
                System.out.println(comts);
                //转发给weibo.jsp来输出
                request.setAttribute("comts",comts);
                request.getRequestDispatcher
                        ("weibo.jsp").forward(request,response);
                System.out.println("转发...");
            }catch (Exception e){
                e.printStackTrace();
                out.println("系统繁忙,稍后再试!");
            }
        }
    }
}
