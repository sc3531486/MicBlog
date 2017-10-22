<%@ page import="entity.comt" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/19 0019
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="photo.css"/>
    <%
        comt c=new comt();
    %>
    <title><%=c.getName()%>的微博</title>
</head>
<body>
    <div class="Wb_miniblog">
        <!-- 导航栏 -->
        <div class="WB_global_nav">
            <div class="gn_header">
                <div class="gn_logo">
                    <a href="#">
                        <img src="images/logo.PNG">
                    </a>
                </div>
                <div class="gn_search_v2">
                    <input type="text"/>
                    <a href="#">
                        <img src="images/search.png">
                    </a>
                </div>
                <div class="gn_position">
                    <div class="gn_position_nav">
                        <ul>
                            <li>
                                <a href="#">首页</a>
                            </li>
                            <li>
                                <a href="#">视频</a>
                            </li>
                            <li>
                                <a href="#">發现</a>
                            </li>
                            <li>
                                <a href="#">游戏</a>
                            </li>
                            <li class="gn_position_nav_l1">
                                <a href="#">小叮当</a>
                            </li>
                        </ul>
                    </div>
                    <div class="gn_position_set">
                        <div><a href="#">我的</a></div>
                        <div><a href="#">设置</a></div>
                        <div><a href="#">写</a></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="head">
        <div>
           <p>
               <img src="images/logo.png"/>
           </p>

        </div>
        <div></div>
    </div>
    <div></div>
</body>
</html>
