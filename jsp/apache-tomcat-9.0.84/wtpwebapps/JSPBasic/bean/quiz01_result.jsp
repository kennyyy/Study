<%@page import="com.example.bean.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	StudentVO svo = (StudentVO)request.getAttribute("svo");
	int totalAdd = (int)request.getAttribute("totalAdd");
	double avg = (double)request.getAttribute("avg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 id : <%=svo.getId()%> <br>
 pw : <%=svo.getPw()%> <br>
 name : <%=svo.getName()%> <br>
 address : <%=svo.getAddress()%> <br>
 kor : <%=svo.getKor()%> <br>
 math : <%=svo.getMath()%> <br>
 total : <%=totalAdd%> <br>
 avg : <%=avg%> <br>
</body>
</html>