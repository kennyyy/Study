<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	if(session.getAttribute("isAuth") == null){
		response.sendRedirect("auth.jsp");
	}

//app에 list가 있다면, 가져옵니다
	ArrayList<String> list = new ArrayList<>();
	if(application.getAttribute("list") != null){
		list = (ArrayList<String>)application.getAttribute("list");
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		checkbox, radio버튼 선택을 못하도록 하는 옵션 disabled
		checkbox, radio버튼 미리 선택하는 옵션 checked
		select박스의 미리 값을 선택하는 옵션 selected
		input태그를 읽기전용 readonly 
		input태그의 값을 반드시 지정 required
	 -->	


	<div style = "text-align: center;">
		<h3>영화 좌석 예약</h3>
		<h4>예약할 죄석을 체크한 후 예약 버튼을 클릭하세요.</h4>
	
	<hr>
	
	<b>좌석배치도</b>
	<br>
	<form action="reserve_ok.jsp" method="post">
	&nbsp;&nbsp;&nbsp;
	<%for(char c = 'A'; c <= 'Z'; c++) {%>
		<small><%= c%></small>
		&nbsp;
	<%}%> <br>
	<%for(int i = 1; i <= 6; i++) {%>
		<%= i %>
		<%for(char c = 'A'; c <= 'Z'; c++) {%>
			<input type="checkbox" name = "seat" value = "<%=i%>-<%=c%>" <%=list.contains(i + "-" + c) ? "disabled" : ""%>/>
		<%}%>
		<br>
		<% if( i == 3) {%>
			<br>
		<%} %>
	<%}%>
	<br>
	<input type = "submit" value="예약하기"/>
	<input type = "reset" value="다시 선택하기"/>
	</form>
	</div>
</body>
</html>