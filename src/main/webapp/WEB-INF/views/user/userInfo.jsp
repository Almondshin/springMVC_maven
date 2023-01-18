<%--
  Created by IntelliJ IDEA.
  User: almondshin
  Date: 2023-01-16
  Time: 오전 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

ID : ${userInfo.userId}<br>
이름 : ${userInfo.userName}<br>
전화번호 : ${userInfo.userPhone}<br>
가입일시 : ${userInfo.userInitTime}<br>


${confirmMsg}

</body>
</html>
