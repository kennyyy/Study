<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@ include file="../include/header.jsp" %>
	
	<div align="center" class="div_center">
		<h3>현재 비밀번호를 입력하세요.</h3>
		<hr>

		<form action="deleteMem.member" method="post"> 
			비밀번호: <input type="password" name="pw">&nbsp;
			<input type="submit" value="확인" class="btn btn-default"> 
		</form>
		${msg }<br>

	</div>	
	
	<%@ include file="../include/footer.jsp" %>