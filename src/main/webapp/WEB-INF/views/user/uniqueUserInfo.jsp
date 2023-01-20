<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<%--${unique[1]}<br>
ID : ${unique[1].userId}<br>
이름 : ${unique[1].userName}<br>
전화번호 : ${unique[1].userPhone}<br>
가입일시 : ${unique[1].userInitTime}<br>--%>
<%--begin=0 end=5 step=1--%>
<%--<form id="form" action="" method="post">--%>
<%--    <input type="hidden" name="_method" value="DELETE">--%>
<%--    <input type="text" name="userId" id="userId">--%>
<%--    <input type="button" id="goSubmit" value="삭제">--%>
<%--    <script>--%>
<%--        document.querySelector("#goSubmit").addEventListener("click", function () {--%>
<%--            var userId = document.querySelector("#userId").value;--%>
<%--            document.querySelector("#form").action = "/user/delete/" + userId;--%>
<%--            document.querySelector("#form").submit();--%>
<%--        })--%>
<%--    </script>--%>
<%--</form>--%>

<%--<input type="text" id="id">
<button id="remove">삭제</button>
<script>
    document.querySelector("#remove").addEventListener("click", function () {
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "/user/delete/" + document.querySelector("#id").value)
        xhr.send();
    })
</script>--%>
<ul>
    <c:forEach var="i" items="${unique}" varStatus="vs">
        <li>아이디 : <c:out value="${i.userId}"/></li>
        <li>비밀번호 : <c:out value="${i.userPw}"/></li>
        <li>이름 : <c:out value="${i.userName}"/></li>
        <li>휴대폰번호 : <c:out value="${i.userPhone}"/></li>
        <li>가입시간 : <c:out value="${i.userInitTime}"/></li>
        <li>인덱스 번호 <c:out value="${vs.index}"/></li>
        <hr>
    </c:forEach>
</ul>

</body>
</html>

