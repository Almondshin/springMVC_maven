<%@ page import="java.util.List" %>
<%@ page import="com.springmvc_maven.vo.user.UserInfoVO" %><%--
  Created by IntelliJ IDEA.
  User: almondshin
  Date: 2023-01-18
  Time: 오후 2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
${unique[1]}<br>
ID : ${unique[1].userId}<br>
이름 : ${unique[1].userName}<br>
전화번호 : ${unique[1].userPhone}<br>
가입일시 : ${unique[1].userInitTime}<br>

</body>
</html>
