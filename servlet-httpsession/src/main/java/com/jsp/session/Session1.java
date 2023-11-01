package com.jsp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/save")
public class Session1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		HttpSession httpSession=req.getSession();
		httpSession.setAttribute("h_name",username);
		httpSession.setAttribute("h_pass",pass);
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body><h1>welcome "+username+" </h1></body></html>");
		printWriter.write("<html><body><a href='session2'>click to go session2</a></body></html>");
	}

}
