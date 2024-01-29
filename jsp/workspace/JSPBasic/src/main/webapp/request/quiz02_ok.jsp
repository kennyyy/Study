<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	double cm = Double.parseDouble(request.getParameter("cm"));
	double kg = Double.parseDouble(request.getParameter("kg"));
	double bmi = (double)Math.round(kg / (cm/100 * cm/100) * 1000) / 1000;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	이름 : <%= name %> <br>
	키 : <%= cm %> <br>
	몸무게 : <%= kg %> <br>
	BMI 지수 : <%= bmi %> <br>
	<%if(bmi >= 25){ %>
		<%= "과체중" %> <br>
	<%}else if(bmi > 18){  %>
		<%= "정상" %> <br>
	<%}else{ %>
		<%= "저체중" %> <br>
	<% } %>

</body>
</html>