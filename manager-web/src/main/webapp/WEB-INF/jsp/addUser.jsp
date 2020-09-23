<%--
  Created by IntelliJ IDEA.
  User: humm
  Date: 2020-09-22
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/user/addUser" method="post">
    id: <input type="text" name="id"><br>
    姓名: <input type="text" name="username"/> <br>
    年龄: <input type="text" name="userage"/> <br>
    <input type="submit" value="确认提交">
</form>
</body>
</html>

