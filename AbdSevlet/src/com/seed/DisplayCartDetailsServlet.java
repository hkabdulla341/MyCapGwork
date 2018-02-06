package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	TODO:1 Make DisplayCartDetailsServlet as a HttpServlet

@SuppressWarnings("serial")
@WebServlet(value ="/displayDetails")
public class DisplayCartDetailsServlet extends HttpServlet{

//	TODO:2 	Provide call-back method (called by web container) for HTTP request made using HTTP GET method
//	TODO:3	This method should read products selected by web-client from bookCatelogue.html and 
//	display them in tabular format as html response to the web client.    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
	String [] booknames = req.getParameterValues("bookName");
	
	PrintWriter out = resp.getWriter();
	
	String output = "<html><body> <table>";
	
	output += "<tr> <th>Book Title </th> <th> Selected? </th> </tr>";
	
	for(String aBookName : booknames)
	{
	    output += "<tr> <td>" + aBookName + "</td> <td>" + "yes" + "</td></tr>";
	}
    
	output += "</table></body></html>";
	
	out.write(output);
	
    }    	
    
    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
        {
        }
}









