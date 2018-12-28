<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:property value="list[0].car_name"/>
<s:property value="list[0].car_brand"/>

	${list[1].car_name}--${list[1].car_id}
</body>
</html>