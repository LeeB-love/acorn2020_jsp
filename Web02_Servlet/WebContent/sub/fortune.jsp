<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/sub/fortune.jsp</title>
</head>
<body>
	<% 
		String[] fortune = {
				"좋을 때도 있는 것처럼 나쁠 때도 있습니다.",
				"불확실한 일은 추진하지 마세요!",
				"어려운 사람을 도우면 좋은 일이 일어날 것입니다.",
				"욕심을 부리다가 오히려 손해를 볼 수 있으니 조심하세요!",
				"노력한 만큼 좋은 성적을 거둘거에요~"
		};
		
		Random ran = new Random();
		int ranF = ran.nextInt(5);
		String f = fortune[ranF];
	%>
	<p>오늘의 운세 : <%=f %></p>
</body>
</html>