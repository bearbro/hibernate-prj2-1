<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
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
    <s:radio name="loginUser.sex" list="#{ 1:'男', 0:'女'}"
             value="%{#request.loginUser.sex}" label="修改性别"/>
    <sx:datetimepicker name="loginUser.birthday"   displayFormat="yyyy-MM-dd"
                       language="utf-8" label="请输入生日" value="%{#request.loginUser.birthday}"/>
    <s:textfield name="loginUser.phone" value="%{#request.loginUser.phone}" label="修改电话"/>
    <s:textfield name="loginUser.email" value="%{#request.loginUser.email}"  label="修改邮箱"/>
    <s:textfield name="loginUser.address" value="%{#request.loginUser.address}"  label="修改地址"/>
    <s:textfield name="loginUser.zipcode" value="%{#request.loginUser.zipcode}"  label="修改邮政编码"/>
    <s:textfield name="loginUser.fax" value="%{#request.loginUser.fax}"  label="修改传真号"/>
    <s:submit value="修改"/>
</s:form>
<s:form action="delete" method="post">
    <s:hidden name="loginUser.customerId"
              value="%{#request.loginUser.customerId}"/>
    <s:submit value="删除"/>
</s:form>
</body>
</html>
