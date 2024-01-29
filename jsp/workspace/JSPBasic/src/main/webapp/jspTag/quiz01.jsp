<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*
	1. 정수를 저장하는 HashSet을 생성합니다.
	2. 1~45까지 랜덤하게 생성되는 로또번호를 set에 저장
	3. 화면에 출력
	4. header, footer는 include해주세요.
	*/
	
	HashSet<Integer> hs = new HashSet<>();

	while(hs.size() != 6){
		hs.add((int)(Math.random() * 45) + 1);
	}
	
%>	

<%@ include file = "include_header.jsp" %>

<% 	for(Integer i : hs){ %>		

		<p>이번 번호는 <%= i %> 입니다</p>
		
<% } %>
	오늘의 로또 번호는 <%= hs %> 입니다.
<%@ include file = "include_footer.jsp" %>
    