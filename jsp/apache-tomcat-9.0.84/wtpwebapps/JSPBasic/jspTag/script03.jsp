<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String now = sdf.format(date);
		
		out.println(now);
		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		
	%>
	
	오늘날짜 : <%= now %><br>
	리스트안에요소 : <%= list.toString() %><br>
</body>
</html>