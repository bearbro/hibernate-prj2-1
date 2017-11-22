<%--
  Created by IntelliJ IDEA.
  User: bear
  Date: 2017/11/8
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>itemList</title>
</head>
<body>
<div style="text-align: center;">商品列表
    <table border=1>
        <tr>
            <th>编号</th>
            <th>书名</th>
            <th>说明</th>
            <th>单价</th>
        </tr>
        <s:iterator value="items">
            <tr>
                <td><s:property value="itemID"/></td>
                <td><s:property value="title"/></td>
                <td><s:property value="description"/></td>
                <td><s:property value="cost"/></td>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>
