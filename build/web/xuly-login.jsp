<%-- 
    Document   : xuly-login
    Created on : Sep 19, 2024, 9:29:00 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="huy.dev.data.model.User" %>
<%@page import="huy.dev.data.dao.DatabaseDao" %>
<%@page import="huy.dev.data.dao.Database" %>
<%@page import="huy.dev.data.dao.UserDao" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% DatabaseDao.init(new Database());
       UserDao userDao = DatabaseDao.getInstance().getUserDao();
        User user = userDao.find(1); %>
        <% String email = request.getParameter("email"); %>
        <% String password = request.getParameter("password"); %>
        <h1> <%= email %> </h1>
        
        <% if(user != null){ %>
        <h1>Đăng nhập thành công!</h1> 
        <% } else {%>
        <h1>Đăng nhập thất bại!</h1> 
        <% } %>
    </body>
</html>
