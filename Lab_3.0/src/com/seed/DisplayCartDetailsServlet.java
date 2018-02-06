package com.seed;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.cg.beans.Person;
import com.seed.beans.Product;
import com.seed.beans.ShoppingCart;
import com.seed.util.ProductsRepository;
import com.seed.util.ProductsRepositoryInMemoryImpl;

//TODO:0	Modification required
public class DisplayCartDetailsServlet extends HttpServlet
{
    private Map<Integer, Product> productEntries;

    // TODO:1 Don't make any changes in this method
    @Override
    public void init() throws ServletException
    {
	ProductsRepository repositoryRef;

	// The member variable "productEntries" refers to Map object,
	// which is pointing to object with product details.
	// These details will be read from in-memory collection.
	// Please, note ProductsRepositoryInMemoryImpl is provided
	// as third-party code in /WEB-INF/lib

	repositoryRef = new ProductsRepositoryInMemoryImpl();
	productEntries = repositoryRef.getProductEntries();
	System.out.println("productEntries " + productEntries);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

	PrintWriter out = response.getWriter();
	ShoppingCart cartRef = null;

	// Don't create a new session, if it is already expired
	HttpSession session = request.getSession(false);

	if (session == null)
	{
	    out.println("<h1>Session expired!</h1>");
	    out.println("<h2><a href='categories.html'>See Categories, again</a></h2>");
	    return;
	}

	// TODO:1 Retrieve attribute named as "shoppingCart" from session scope,
	// and assign it to "cartRef" local variable

	cartRef = (ShoppingCart) session.getAttribute("shoppingCart");

	// TODO:2 If the attribute(shoppingCart) exists, retrieve product ids
	// from it.

	Set shoppingCartValues;

	if (cartRef != null)
	{
	    shoppingCartValues = cartRef.getProductSet();
	}

	// TODO:3 If the attribute(shoppingCart) not exists, retrieve product
	// ids
	// from it.

	else
	{
	    cartRef = new ShoppingCart();
	}

	// TODO:4 Scan all productids retrieved from Cart and maintain a list of
	// corresponding products
	// Note: You can get details of product(value) based on productid(key)
	// using member variable "productEntries"
	Set<Integer> productIDSet = cartRef.getProductSet();
	Set<Product> productInfoSet = new HashSet<Product>();

	for (Integer itemID : productIDSet)
	{
	    productInfoSet.add(productEntries.get(itemID));
	}

	// TODO:5 display product details in tabular format as HTTP
	// response(text/html) to the web-client

	out.println("<html>");
	out.println("<body>");

	if (!productInfoSet.isEmpty())
	{
	    out.println("<table border='2' width=\"319\">");
	    out.println("<tbody>");
	    out.println("<tr>");
	    out.println("<th>Product ID</th>");
	    out.println("<th>Product Name</th>");
	    out.println("<th>Product Price</th>");
	    out.println("</tr>");

	    for (Product aProduct : productInfoSet)
	    {
		out.println("<tr>");
		out.println("<td>" + aProduct.getId() + "</td>");
		out.println("<td>" + aProduct.getName() + "</td>");
		out.println("<td> $ " + aProduct.getPrice() + "</td>");
		out.println("</tr>");
	    }
	}
	else
	{
	    out.println("No Products to display (Cart is empty)");
	}

	out.println("</tbody>");
	out.println("</table>");
	out.println("<body>");
	out.println("<html>");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
	this.doPost(request, response);
    }

}
