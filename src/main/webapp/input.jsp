<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 21.06.2020
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Intellij gen</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/myservlet" method="post">
    <input type="submit" name="button1" value="Button 1" />
<%--    <input type="submit" name="button2" value="Button 2" />--%>
<%--    <input type="submit" name="button3" value="Button 3" />--%>
</form>
<form action="${pageContext.request.contextPath}/myservlet" method="post">
    Fname:
    <input type="text" name="fname" placeholder="type first name" />
    <input type="submit" value="ok" />
</form>


</body>
</html>
