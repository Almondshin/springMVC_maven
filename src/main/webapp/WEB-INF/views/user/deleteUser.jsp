<%--
  Created by IntelliJ IDEA.
  User: almondshin
  Date: 2023-01-19
  Time: 오후 1:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Delete Employee</title>
</head>
<body>
<h1>Delete Employee</h1>
<p>Are you sure you want to delete the employee with ID: ${userId.userId}?</p>
<form action="<c:url value='/user/delete/${userId.userId}'/>" method="get">
  <input type="submit" value="Delete"/>
  <a href="<c:url value='/main'/>">Cancel</a>
</form>
</body>
</html>
