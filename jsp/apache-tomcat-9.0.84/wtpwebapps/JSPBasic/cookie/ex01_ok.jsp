<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	//쿠키사용
 	Cookie[] arr = request.getCookies();
 	
 	String user_id = "";
 	if(arr != null){
 		for(Cookie c : arr){
 			if(c.getName().equals("user_id")){
 				user_id = c.getValue();
 			}
 		}
 	}
 
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 성공!</h3>
	<%= user_id %> 님 어서오세요!
	</body>
	<a href="ex01.jsp">돌아가기</a>
</html>