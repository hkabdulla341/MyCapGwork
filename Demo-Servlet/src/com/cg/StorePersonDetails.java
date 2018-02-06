package com.cg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.beans.Person;

@WebServlet("/storePersonDetails")
public class StorePersonDetails extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
	// TODO Auto-generated method stub
	// super.doPost(req, resp);

	String name = request.getParameter("name");
	String age = request.getParameter("age");

	Person person;

	person = (Person) request.getAttribute("pDetails");

	if (person == null)
	{
	    System.out.println("Attribute in Request_SCOPE is created");
	    person = new Person();
	    request.setAttribute("pDetails", person);
	}

	 PrintWriter out = response.getWriter();
	
	try
	{
	    person.setAge(Integer.valueOf(age));
	    person.setName(name);

	    out.println("<html><body>");

	    out.println("<h1>" + "Your details " + "</h1>");
	    out.println("<h2>" + person.getName() + "</h2>");
	    out.println("<h2>" + person.getAge() + "</h2>");

	    out.println("</body></html>");
	}
	catch (NumberFormatException e)
	{
	    out.println("<html><body>");

	    out.println("<h1>" + "Age is not a number!! " + "</h1>");

	    out.println("</body></html>");
	}

    }

}
