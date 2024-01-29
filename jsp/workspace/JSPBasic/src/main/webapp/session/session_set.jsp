<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 세션 - 서버와 클라이언트에서 정보를 유지하기 위한 수단
	//서버에서 생성하고, 서버에서 관리함
	
	session.setAttribute("user_id", "xxxx1234");
	session.setAttribute("user_name", 1);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="session_get.jsp" >세션확인하기</a>
</body>
</html>