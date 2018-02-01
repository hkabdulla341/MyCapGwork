package com.flp.ems.view;

import java.io.Serializable;
import java.util.ArrayList;

import com.flp.ems.util.Utility;

@SuppressWarnings("serial")
public class BootClass implements Serializable
{
    public static void main(String[] args)
    {
	new BootClass().menuSelection();
    }

    public void menuSelection()
    {
	String title = "Welcome to Employment Management System";
	String quit = "Quit";

	ArrayList<String> options = new ArrayList<String>();
	options.add(title);
	options.add("Add Employee"); // a
	options.add("Modify Employee"); // b
	options.add("Remove Employee"); // c
	options.add("Search Employee"); // d
	options.add("Get All Employye");// e
	options.add(quit);

	// exit option is z
	char userOpt = 'a';
	UserInteraction userInteract = new UserInteraction();

	// UserInteraction userInteractobj = new UserInteraction();

	while (userOpt != 'z')
	{
	    userOpt = Utility.optionsDisplayer(options);

	    switch (userOpt)
	    {
		case 'a':
		    userInteract.addEmployee();
		    break;
		case 'b':
		    break;
		case 'c':
		    break;
		case 'd':
		    break;
		case 'e':
		    break;
		case 'z':
		    System.out.println("--- Program Terminated ---");
		    break;
		default:
		    System.out.println("Switch Default block reached!!");
		    break;
	    }
	}
    }
}
