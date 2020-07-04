<%--
  Created by IntelliJ IDEA.
  User: dgx
  Date: 2020/6/30
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style type="text/css">
        table.gridtable {
            font-family: verdana,arial,sans-serif;
            font-size:11px;
            color:#333333;
            border-width: 1px;
            border-color: #666666;
            border-collapse: collapse;
        }
        table.gridtable th {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #dedede;
        }
        table.gridtable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<table border="1" class="gridtable">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>性别</td>
        <td>生日</td>
        <td>电话</td>
        <td>部门号</td>
        <td>邮箱</td>





    </tr>
    <c:forEach items="${lists}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.gender}</td>
            <td>${user.birthday}</td>
            <td>${user.tel}</td>
            <td>${user.depTel}</td>
            <td>${user.email}</td>

        </tr>

    </c:forEach>
</table>
</body>
</html>
