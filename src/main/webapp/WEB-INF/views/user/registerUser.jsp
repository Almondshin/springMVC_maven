<%--
  Created by IntelliJ IDEA.
  User: almondshin
  Date: 2023-01-16
  Time: 오전 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/registerAsk" method="POST">
    아이디 : <input type="text" name="userId"><br>
    비밀번호 : <input type="password"name="userPw"><br>
    이름 : <input type="text"name="userName"><br>
    휴대폰 : <input type="text"name="userPhone"><br>
    <input type ="submit"value="로그인">
</form>

${registerUserMsg}

</body>
</html>
