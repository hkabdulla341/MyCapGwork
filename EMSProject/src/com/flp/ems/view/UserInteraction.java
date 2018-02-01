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
	
	String kinId = Keyboard.readString("Enter Employee Name : ");
	
	while(!serivceEmployeeList.serviceKinIdCheckExists(kinId))
	{
	    if(!serivceEmployeeList.serviceKinIdCheckExists(kinId))
	    {
		System.out.println("KinID Already Exists...");
		kinId = Keyboard.readString("Enter Employee Name : ");
	    }
	}
	
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
