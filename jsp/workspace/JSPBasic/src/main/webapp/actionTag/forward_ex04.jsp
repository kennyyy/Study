<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	System.out.println("넘어온값을 소비 : " + name);
	
	//request에 강제로 값을 저장
	request.setAttribute("data", "홍길동 20세");
	
	//자바코드로 포워드를 사용하는방법
	//RequestDispatcher rd = request.getRequestDispatcher("forward_ex05.jsp");
	//rd.forward(request, response);
	request.getRequestDispatcher("forward_ex05.jsp").forward(request, response);
%>
