package com.example.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet("*.test")//1. 확장자패턴을 씁니다.
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestController() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //2. get/post 요청도 하나로 모은다
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);

	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. URi주소를 분기(각 요청별로 코드를 만듬)
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String path = uri.substring(request.getContextPath().length());
		System.out.println(path);
		
		
		if(path.equals("/controller/join.test")) {
			//회원가입~~ 처리로직
		}else if(path.equals("/controller/modify.test")) {
			//정보수정~~ 처리로직
		}else if(path.equals("/controller/delete.test")){
			System.out.println("//회원탈퇴 ~~ 처리로직");
		}else if(path.equals("/controller/logout.test")){
			//로그아웃 ~~ 처리로직
		}

	}

}
