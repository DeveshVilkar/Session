package com.jsp.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session3")
public class Session3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession=req.getSession();
		String pass=(String)httpSession.getAttribute("h_pass");
		System.out.println(pass);
		
		httpSession.removeAttribute("h_pass");
		httpSession.removeAttribute("h_name");
		httpSession.invalidate();
	
	}

}
