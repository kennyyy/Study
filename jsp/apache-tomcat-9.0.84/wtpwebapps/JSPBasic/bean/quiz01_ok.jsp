<%@page import="com.example.bean.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	/*
1. 폼태그를 처리할 수 있는 bean을 선언합니다.
2. 폼값을 받아서 평균과 총점을 구합니다.
3. quiz01_result페이지로 이동해서 
	학생정보와 평균, 총점을 모두 출력하세요.

조건: session (x)
*/ 
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int math = Integer.parseInt(request.getParameter("math"));
	
	StudentVO svo = new StudentVO(id, pw, name, address, kor, math);
	int totalAdd = kor+math;
	double avg = totalAdd/2.0;
	
	request.setAttribute("svo", svo);
	request.setAttribute("totalAdd", totalAdd);
	request.setAttribute("avg", avg);
	request.getRequestDispatcher("quiz01_result.jsp").forward(request, response);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>