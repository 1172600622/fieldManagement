<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/29
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员界面</title>
</head>

<body>
<h1>管理员界面</h1>

<table  border="1">
 <tr>
    <td>用户管理</td>
    <td></td>
</tr>
 <tr>

        <td>用户管理</td>
        <td><a href="/admin/useradd"> 用户信息录入</a></td>
        <td></td>
 </tr>
 <tr>

        <td>用户管理</td>
        <td>修改用户信息</td>
        <td><a href="/user/listall">用户信息查询</a></td>
        <td></td>
  </tr>
    <tr>

        <td>部门管理</td>
        <td><a href="/dept/add">添加部门</a> </td>
        <td><a href="/dept/insert">展示部门</a> </td>
    </tr>
    <tr>

        <td>系统角色管理</td>
        <td></td>
        <td></td>
    </tr>
</table>
</body>
</html>
