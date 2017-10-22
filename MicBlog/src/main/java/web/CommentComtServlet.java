package web;

import dao.commentDAO;
import entity.comt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//评论
public class CommentComtServlet extends HttpServlet {
    public void service(
            HttpServletRequest request,
            HttpServletResponse response
    )throws ServletException,IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        String comment=request.getParameter("comment");
        System.out.println("name:"+comment);//打桩
        commentDAO dao=new commentDAO();
        comt c=new comt();
        c.getComment();
        try {
            dao.comment(c);
            response.sendRedirect("");// 重定向至主界面
        }catch (Exception e){
            e.printStackTrace();
            out.println("系统繁忙,请稍候再试!");
        }
    }
}
