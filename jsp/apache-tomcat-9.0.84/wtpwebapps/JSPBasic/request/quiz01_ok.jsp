<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String birth = request.getParameter("birth");
	String age = request.getParameter("age");
	String major =  request.getParameter("b1");
	String region = request.getParameter("region");
	String myintro = request.getParameter("myintro");
	
	String[] hobby = request.getParameterValues("a1");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	아이디 : <%= id %> <br>
	비밀번호 : <%= pw %> <br>
	생년월일 : <%= birth %> <br>
	나이 : <%= age %> <br>
	<% for(String h : hobby) {%>
		취미 : <%= h %> <br>
	<% } %>
	

	전공 : <%= major %> <br>
	지역 : <%= region %> <br>
	소개글 : <%= myintro %> <br>

</body>
</html>