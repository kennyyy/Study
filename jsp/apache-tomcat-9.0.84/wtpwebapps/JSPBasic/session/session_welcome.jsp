<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//여기에서 세션이 없다 -> 인증이 안된 사람
	if(session.getAttribute("user_id") == null){
		response.sendRedirect("session_login.jsp");
	}


	Object id = session.getAttribute("user_id");
	Object nick = session.getAttribute("user_nick");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%= id %>(<%= nick %>)님 환영합니다</p>
	<a href = "session_logout.jsp">로그아웃</a>
</body>
</html>