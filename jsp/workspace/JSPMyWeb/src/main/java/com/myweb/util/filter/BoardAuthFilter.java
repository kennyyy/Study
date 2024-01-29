package com.myweb.util.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//게시글 수정, 게시글 삭제는 당사자만 할 수있도록 함
@WebFilter({"/board/modify.board", "/board/update.board", "/board/delete.board" })
public class BoardAuthFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("utf-8");
		//세션에 있는 유저아이디와, 각 요청에서 넘어오는 작성자 정보를 비교
		
		//httprequest타입으로 다운캐스팅
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		//로그인 유무 확인
		HttpSession session = req.getSession();
		String user_id = (String)session.getAttribute("user_id");

		//화면에서 전달받은 writer
		String writer = req.getParameter("writer");
		System.out.println(writer);
		
		//null처리
		if(writer == null ) {
			res.sendRedirect(req.getContextPath() + "/user/login.user");
			return;
		}
		if(user_id == null) {
			res.sendRedirect(req.getContextPath() + "/user/login.user");
			return;
		}
		
		if(!user_id.equals(writer)) {
			res.setContentType("text/html; charset=UTF-8;");
			PrintWriter out = res.getWriter();
			out.println("<script>");
			out.println("alert('권한이 없습니다');");
			out.println("location.href='list.board'; ");
			out.println("</script>");
			return;
		}
		
		
		
		chain.doFilter(request, response);
		
	}

}
