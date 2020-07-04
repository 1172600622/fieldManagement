<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title></title>

</head>
<body>
<form action="/admin/login_check" method="post" >
    <input name="name" type="text"
           placeholder="请输入登录账号" autofocus>
    <br>
    <input name="pwd" type="password"
           placeholder="请输入登录密码" >
    <br>
    <button type="submit" >登录</button>

</form>
</body>

