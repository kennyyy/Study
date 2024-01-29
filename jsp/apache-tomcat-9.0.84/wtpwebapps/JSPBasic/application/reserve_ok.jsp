<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] arr = request.getParameterValues("seat"); //사용자가 선택한 값
	
	ArrayList<String> list = new ArrayList<>();
	
	//application를 사용해서 예약정보 지정
	//만약 app에 값이 있다면, 가져와서 변수에 저장
	
	
	if(application.getAttribute("list") != null){
		list = (ArrayList<String>)application.getAttribute("list");
	}
	
	//사용자가 예약한 값을 list에 저장. 중복값의 확인
	//list에 저장된 값과 사용자가 선택한 값을 비교해서 중복되는 값이 없다면, 저장
	//중복되는 값이 있으면 패스
	
	ArrayList<String> temp = new ArrayList<>();
	
	for(String s : arr){
		if(!list.contains(s)){
			temp.add(s);
		}
	}
	
	//중복이 없으면
	if(temp.size() == arr.length){
		list.addAll(temp);//temp에 저장된 모든 값을 list에 추가
	}
	
	//application객체에 list라는 이름으로 저장
	application.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style = "text-align: center;">
		<h3>예약 결과</h3>
		<h5>예약한 좌석</h5>
		<%for(String s : arr){ %>
			<%=s %>
		<%}%>
		
		<b style= "color: red;">결과 : <%=temp.size() == arr.length ? "성공" : "실패" %></b>
		
		<a href = "reserve.jsp">다시 예약하기</a>
	</div>
</body>
</html>
