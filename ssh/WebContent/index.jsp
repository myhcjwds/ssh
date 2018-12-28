<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>首页用户登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user_login" method="post">
<input name="user_num" type="text"/>
<input name="user_psw" type="password"/>
<input type="submit" value="登陆" />
</form>
</body>
</html>