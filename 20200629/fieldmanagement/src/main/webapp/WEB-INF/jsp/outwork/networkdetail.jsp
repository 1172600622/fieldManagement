<%--
  Created by IntelliJ IDEA.
  User: dgx
  Date: 2020/6/30
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>县分公司走访计划编排</title>
</head>
<style type="text/css">
    h2{
        margin:0 auto;
        text-align: center;
    }
    table{
        border-collapse:collapse;
        text-align: center;
        margin: 0 auto;
    }
    table span{
        display: inline-block;
        width: 100px;
        text-align: right;
    }
    #time span{
        width: 30px;
    }
</style>
<body>
<h2>县分公司走访计划编排</h2>
    <form action="/outwork/add">
        <table border="1">
            <tr>
                <td width="140" height="70;" align="center">计划名称</td>
                <td width="470" colspan="6"> <input  type="text"  name="lijp.LJIP_name"></td>
            </tr>
            <tr>
                <td height="65" >走访时间</td>
                <td  colspan="6"><input type="text"  name="lijp.LJIP_time"> </td>
            </tr>

            <tr  id="time">
                <td height="45">日期范围</td>
                <td colspan="3" width="240"><span>年</span><span>月</span><span>日</span></td>
                <td colspan="3" width="220"><span>年</span><span>月</span><span>日</span></td>
            </tr>
            <tr>
                <td height="60">走访地点</td>
                <td  colspan="6" style="text-align:left;">
                    <input type="text" name="address[0]"><span>市</span>
                    <input type="text" name="address[1]"><span>县</span>
                    <input type="text" name="address[2]"><span style="width:130px;">区（乡）</span>
                    <input type="text" name="address[3]"><span>村</span>
                </td>
            </tr>
            <tr>
                <td height="70">网点<br>类型</td>
                <td colspan="2"  width="180"> <input align type="text" name="lijp.LJIP_type"></td>
                <td colspan="2" width="125">季节</td>
                <td colspan="2" width="175"> <input align type="text" name="lijp.LJIP_season"></td>
            </tr>

            <tr><td height="70">员工<br>姓名</td>
                <td  colspan="6"> <input align type="text" name="lijp.LJIP_maker"></td>
            </tr>

            <tr>
            <tr>
                <td height="60">每人每月次数</td>
                <td colspan="2" > <input align type="text" name="lijp.LJIP_mtimes"></td>
                <td colspan="2" >支局合计次数</td>
                <td colspan="2" ><input align type="text" name="lijp.LJIP_sub"> </td>
            </tr>
            </tr>
            <tr>
                <td height="65" >每人每月收集信息条数</td>
                <td  colspan="6"> <input align type="text" name="LJIP_each"></td>
            </tr>
            </tr>
            <tr>
                <td height="65" >备注</td>
                <td  colspan="6"><input align type="text" name="LJIP_memo"> </td>
            </tr>

                     <input type="submit" value="提交"/>

        </table>
    </form>
        <div style="width:610px;margin:0 auto;">
            <p>注：1、以上内容要求申请人填写完整</p>
            <p style="text-indent:2em;">2、本表解释权归XXXXXXXX。咨询电话：XXXXXXXX</p>
        </div>
</body>
</html>
