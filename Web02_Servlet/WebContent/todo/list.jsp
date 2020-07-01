<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/todo/list.jsp</title>
</head>
<body>
	<%
		List<String> list = new ArrayList<>();
		list.add("html 공부하기");
		list.add("css 공부하기");
		list.add("javascript 공부하기");
	%>
	<h1>오늘의 할 일</h1>
	<ul>
		<%for(String tmp : list){ %>
			<li><%=tmp %></li>
		<%} %>
	</ul>
</body>
</html>