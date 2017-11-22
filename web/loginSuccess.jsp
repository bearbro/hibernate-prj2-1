<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Bro、小熊
  Date: 2017/10/2
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<s:property value="#request.tip"/>
<p>修改个人信息</p>
<s:form action="update" method="post">
    <s:hidden name="loginUser.customerId"
              value="%{#request.loginUser.customerId}"/>
    <s:textfield name="loginUser.account" label="用户名不能修改"
                 value="%{#request.loginUser.account}" readonly="true"/>
    <s:textfield type="password" name="loginUser.password"
                 label="修改密码" value="%{#request.loginUser.password}"/>
    <!-- 省略其它表单域 -->
    <s:submit value="修改"/>
</s:form>
<s:property value="loginUser.password"/>
<s:form action="delete" method="post">
    <s:hidden name="loginUser.customerId"
              value="%{#request.loginUser.customerId}"/>
    <s:submit value="删除"/>
</s:form>
<a href="./allitems">查看所有商品信息</a>
</body>
</html>
