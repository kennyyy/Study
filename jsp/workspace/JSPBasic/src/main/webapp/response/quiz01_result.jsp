<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	
	
	double avg = (kor+eng+mat)/3.0;
	
	
	
	
	if(avg >= 60){
		response.sendRedirect("quiz01_ok.jsp");
	}else{
		response.sendRedirect("quiz01_no.jsp");
	}
%>
