<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="resources/css/css.css"/> 
<script type="text/javascript" src="resources/jquery/jquery-1.8.2.js"></script>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td>姓名</td>
				<td>性别</td>
				<td>爱人</td>
			</tr>
			<c:forEach items="${list}" var="a">
				<tr>
				<td>${a.sname}</td>
				<td>${a.sex}</td>
				<td>${a.love}</td>
				</tr>
			</c:forEach>
		</table>
	
	
	</form>
</body>
</html>