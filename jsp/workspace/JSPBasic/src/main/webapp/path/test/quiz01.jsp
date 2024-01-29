<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- a태그로 jspTag폴더의 quiz01로 상대경로, 절대경로 -->
	
	<a href="../../jspTag/quiz01.jsp">jspTag폴더의 quiz01.jsp (상대경로)</a>
	<a href="/JSPBasic/jspTag/quiz01.jsp">jspTag폴더의 quiz01.jsp (절대 경로)</a>
	
	<!-- img태그로 HTML폴더안에 있는 테스트1.jpg 상대경로, 절대경로 -->
	
	<img src="../../html/img/pullrequest.PNG" style= " width:200px; height: 200px; "/>
	<img src="/JSPBasic/html/img/pullrequest.PNG" style= " width:200px; height: 200px; "/>
	<!-- a태그로 TestServlet로 상대경로, 절대경로 -->
	<br>
	<a href="../../apple">TestServlet.jsp (상대경로)</a>
	<a href="/JSPBasic/apple">TestServlet.jsp (절대경로)</a>
</body>
</html>