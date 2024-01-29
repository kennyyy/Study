<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//application는 seesion과 사용방법은 거의 유사합니다.
	//application객체는 프로젝트가 시작 될 때 1개 만들어지고,
	//프로젝트를 끌때까지 유지가 됩니다.
	int total = 0;	

	if(application.getAttribute("total") != null){
		total = (int)application.getAttribute("total");
	}

	application.setAttribute("total", ++total);
	
	///////////////////////////////////
	int count = 0 ;
	if(session.getAttribute("count") != null){
		count = (int)session.getAttribute("count");
	}
	session.setAttribute("count", ++count);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>application객체 확인하기</h3>
	
	application에 저장한 현재토탈 : <%=total %> <br>
	session에 저장한 현재토탈 : <%=count %> <br>
</body>
</html>