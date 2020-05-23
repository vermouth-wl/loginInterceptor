<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-05-17
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
    <h3>登录成功</h3>
    <p>
        <span>欢迎: ${sessionScope.CURRENT_USER.loginName}  | <a href="${pageContext.request.contextPath}/logout">注销</a> </span>
    </p>
</body>
</html>
