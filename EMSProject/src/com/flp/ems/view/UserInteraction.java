package com.flp.ems.view;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Keyboard;
import com.flp.ems.util.Validate;

public class UserInteraction
{
    EmployeeServiceImpl serivceEmployeeList;
    
    public UserInteraction()
    {
	this.serivceEmployeeList = new EmployeeServiceImpl();
    }
    
    public void addEmployee()
    {
	System.out.println("Adding new Employee...");
	
	Employee tempEmp = new Employee();
	
	String empName = Keyboard.readString("Enter Employee Name : ");;
	
	while(!Validate.validateName(empName))
	{	    
	    if(!Validate.validateName(empName))
	    {
		System.out.println("Employee name is not Valid...");
		empName = Keyboard.readString("Enter Employee Name : ");
	    }
	}
	
	String kinId = Keyboard.readString("Enter Employee KIN Id : ");
	
	while(serivceEmployeeList.serviceKinIdCheckExists(kinId))
	{
	    if(serivceEmployeeList.serviceKinIdCheckExists(kinId))
	    {
		System.out.print("KinID Already Exists...");
		kinId = Keyboard.readString("Enter Employee KIN Id : ");
	    }
	}
	
	String eMail = Keyboard.readString("Enter Employee email : ");
	
	while(!Validate.validateEmailID(eMail))
	{
	    if(!Validate.validateEmailID(eMail))
	    {
		System.out.print("Invalid Email format...");
		eMail = Keyboard.readString("Enter Employee email : ");
	    }
	    else if(serivceEmployeeList.serviceEmailIdCheckExists(eMail))
	    {
		System.out.print("Email Already Exists...");
		eMail = Keyboard.readString("Enter Employee email : ");
	    }
	}
	
	String phoneNo = Keyboard.readString("Enter Phone Number : ");
	
	while(!Validate.validatePhoneNo(phoneNo))
	{
	    if(!Validate.validatePhoneNo(phoneNo))
	    {
		System.out.print("Invalid phone number...");
		phoneNo = Keyboard.readString("Enter Phone Number : ");
	    }
	}
	
	String address = Keyboard.readString("Enter Address : ");
	
    }

    public void modifyEmployee()
    {
    }

    public void removeEmployee()
    {
    }

    public void searchEmployee()
    {
    }

    public void getAllEmployee()
    {
    }
}
