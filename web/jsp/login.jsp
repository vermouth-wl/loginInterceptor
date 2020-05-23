<%--
  Created by IntelliJ IDEA.
  User: q1591
  Date: 2020-05-17
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form method="post" action="login">
        <div>
            <label for="loginName">用户:</label>
            <input type="text" name="loginName" id="loginName"/>
        </div>
        <div>
            <label for="password">密码:</label>
            <input type="text" name="password" id="password"/>
        </div>
        <div>
            <span style="color: red">${requestScope.message}</span>
        </div>
        <div>
            <input type="submit" value="登录"/>
        </div>
    </form>
</body>
</html>
