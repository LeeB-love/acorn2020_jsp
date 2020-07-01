<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>time.jsp</title>
</head>
<body>
	<%
		//며용... 자바 코드 작성 할 수 있는 영역
		Date date = new Date();
		String now = date.toString();
	%>
	<p>현재시간 : <%out.println(now); %></p>  <!-- jspWriter == print과 비슷 -->
	<p>현재시간 : <%=now %></p> 
</body>
</html>
<!-- 
	jsp <%%>에 ctrl+space 치면 기본 메소드가 servlet보다 더 많이 나옴 servlet은 request와 response 두가지...
	jsp에는 pageContext, out, application, request, response, session 등등... 
	(jsp는 servlet을 상속받아 만들어진 페이지이기 때문에 req, resp 은 기본적으로 사용할 수 있다.)
 -->