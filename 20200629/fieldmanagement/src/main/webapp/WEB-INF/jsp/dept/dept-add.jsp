<%--
  Created by IntelliJ IDEA.
  User: dgx
  Date: 2020/6/30
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>添加部门</title>
</head>
<body>

<%--

    private String depId;

    private String name;

    private Boolean status;

    private String depTel;
--%>
<form action="/dept/insert" method="post">
    <table>
        <tr>

            <td>部门名称&nbsp<input class="easyui-textbox" data-options="iconCls:'icon-search'" style="width:300px"   name="name" type="text"></td>
        </tr>

        <tr>

            <td>联系电话 <input class="easyui-textbox" data-options="iconCls:'icon-search'" style="width:300px" name="depTel" type="text"></td>
        </tr>

        <tr>
            <td>部门状态: 激活 <input name="status" type="radio" value="1"> 注销<input name="status" type="radio" value="0" ></td>
            <td></td>
        </tr>


    </table>

    <input type="submit" value="提交">


</form>

</body>
</html>
