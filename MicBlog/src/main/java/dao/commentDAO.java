package dao;

import entity.comt;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class commentDAO {
    //发布文章
    public void ReleaseMicroBlog(comt c) {
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "INSERT INTO comment_emp "
                    + "(name,content) "//comments,fabulous,transmit
                    + "VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getContent());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            DBUtil.closeConnection(conn);
        }
    }

    //评论
    public void comment(comt c){
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "INSERT INTO comment_emp "
                    + "(comment) "//comments,fabulous,transmit
                    + "VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getComment());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            DBUtil.closeConnection(conn);
        }
    }

    //点赞,评论数,转发数
    public void cft(comt c){
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "INSERT INTO comment_emp "
                    + "(comments,fabulous,transmits) "//comments,fabulous,transmit
                    + "VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, c.getComments());
            ps.setInt(2, c.getFabulous());
            ps.setInt(3, c.getTransmits());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            DBUtil.closeConnection(conn);
        }
    }

    public List<comt> findAll(){
        List<comt> comts =
                new ArrayList<comt>();
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            System.out.println("conn:"+conn);
            String sql = "SELECT * FROM temp ";
            PreparedStatement ps =
                    conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                comt c = new comt();
               // c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setContent(rs.getString("content"));
//                c.setComment(rs.getString("comment"));
//                c.setTime(rs.getInt("time"));
//                c.setComments(rs.getInt("comments"));
//                c.setFabulous(rs.getInt("fabulous"));
//                c.setTransmits(rs.getInt("transmits"));
                comts.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            DBUtil.closeConnection(conn);
        }
        return comts;
    }
}