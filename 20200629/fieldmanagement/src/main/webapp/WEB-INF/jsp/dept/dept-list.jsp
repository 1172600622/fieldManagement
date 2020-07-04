<%--
  Created by IntelliJ IDEA.
  User: dgx
  Date: 2020/6/30
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>部门展示</title>
</head>
<body>

<table border="1">
    <tr>
        <td>部门名称</td>
        <td>联系电话</td>
        <td>部门状态</td>
    </tr>
    <c:forEach items="${lists}" var="dept">
        <tr>
            <td>${dept.name}</td>
            <td>${dept.depTel}</td>
            <td>${dept.status}</td>


        </tr>
    </c:forEach>
</table>

</body>
</html>
