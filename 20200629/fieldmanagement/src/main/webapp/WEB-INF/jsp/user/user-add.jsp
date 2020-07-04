<!-- <%--
  Created by IntelliJ IDEA.
  User: dgx
  Date: 2020/6/30
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %> -->

<html>
<head>
        <title>添加用户</title>
        <style type="text/css">
                form{
                        position: absolute;
                        left: 50%;
                        top: 50%;
                        transform: translate(-50%,-50%);
                        border: 3px solid #000000;
                        padding-top:5px;
                        padding-left: 20px;
                        box-shadow:10px 5px 20px 2px rgba(0,0,0,.3);;
                }
                input{
                        margin-right: 30px;
                        margin-bottom: 15px;
                        width: 300px;
                        height: 30px;
                }
                form p{
                        text-align: center;
                        font-size: 30px;
                }
                #sub{
                        background:lightgreen;
                        font-size: 17px;
                }
                #sub:hover{
                        background: greenyellow;
                }
        </style>
</head>
<body>
<form action="/user/insert" method="post">
        <p>注册表</p>
        姓名:<input name="name" type="text" style="margin-left:48px;"><br />
        性别:<input name="gender" type="text" style="margin-left:48px;"><br />
        出生日期:<input name&nbsp;&nbsp;&nbsp;="birthday" type="date" style="margin-left:16px;"><br />
        部门号:<input name="depId" type="text" style="margin-left:32px;"><br />
        办公室电话:<input name="depTel" type="text"><br />
        手机:<input name="tel" type="text" style="margin-left:48px;"><br />
        邮件:<input name="email" type="text" style="margin-left:48px;"><br />
        登录名:<input name="userName" type="text" style="margin-left:32px;"><br />
        密码:<input name="password" type="text" style="margin-left:48px;"><br />
        <input type="submit" id="sub" value="提交" style="margin-left: 65px; margin-top: 5px;"><br />
</form>
</body>
</html>
