package com.sg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/getDate")
public class MyServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
	PrintWriter out = resp.getWriter();

	resp.setStatus(405);

	out.println("<html><body>");

	out.println("<h2>Current Date/Time : " + new Date() + "</h2>");

	out.println("</body></html>");
    }
}
