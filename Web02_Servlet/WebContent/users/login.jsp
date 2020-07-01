<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/send.jsp</title>
<link rel="stylesheet" href="/Web02_Servlet/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<% if(id.equals("gura")&& pwd.equals("1234")){%>
	<p class="alert alert-success"><%=id %>님이 로그인되었습니다.</p>
	<% }else{ %>
		<p class="alert alert-danger">아이디 혹은 비밀번호가 틀렸습니다.</p>
	<%} %>
</div>

</body>
</html>