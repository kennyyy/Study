<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//이전 화면에서 넘어온 값을 얻을때는 getParameter
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String[] check = request.getParameterValues("inter");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>여기는 ex02페이지</h3>
	넘어온 아이디 : <%= id %><br>
	넘어온 비밀번호 :  <%= pw %><br>
	<% for(String s : check) { %>
			<%= s %>
	<% } %>
</body>
</html>