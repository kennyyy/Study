<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//request는 자동으로 생성되는 내장객체. 그래서 request변수에 . 찍어서 사용합니다.
	StringBuffer url = request.getRequestURL(); //전체주소
	String uri = request.getRequestURI(); //서버 주소를 뺀 나머지
	
	String path = request.getContextPath(); //컨패스 - was가 프로젝트를 구분하는 최상위경로
	String addr = request.getRemoteAddr(); //요청한 사람의 아이피주소
	
	String query  = request.getQueryString();//url주소에 담긴 데이터를 문자열로 얻음
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>request 객체 확인하기</h3>
	
	URL : <%= url %><br>
	URI : <%= uri %><br>

	ContextPath : <%= path %><br>
	addr : <%= addr %><br>
	queryStr : <%= query %><br>
</body>
</html>