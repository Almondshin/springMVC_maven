<%--
  Created by IntelliJ IDEA.
  User: almondshin
  Date: 2023-01-16
  Time: 오전 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<a href="/registerUserView">회원가입</a> </br>
<a href="/user/userInfoAsk">회원조회</a> </br>
<%--<a  href="javascript: userListLAll();">전체조회</a>--%>
<button onclick="return false;" id="userListLAll">전체조회</button>

${loginMsg}

<script>
    document.querySelector("#userListLAll").addEventListener("click", function(){
        var xhr = new XMLHttpRequest();
        xhr.open("GET", "/user/userListLAll", false);
        xhr.onreadystatechange = function(e){
            if(xhr.readyState === 4 && xhr.status === 200){
                console.log("success");
            }
        }
        xhr.send();
    })
</script>
</body>
</html>

