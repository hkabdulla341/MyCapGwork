package com.cg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		HttpSession session = request.getSession();
		
		System.out.println(session.getId() + " is it new? "+ session.isNew());
		System.out.println("Cookies used? "+request.isRequestedSessionIdFromCookie());
		
		
	}
	
}
