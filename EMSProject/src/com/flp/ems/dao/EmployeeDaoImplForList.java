package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao
{
    ArrayList<Employee> allEmployee;
    Map<String, Employee> searchEmployeeByKINid;
    Map<String, Employee> searchEmployeeByEMailId;

    public EmployeeDaoImplForList()
    {
	allEmployee = new ArrayList<Employee>();
	searchEmployeeByKINid = new HashMap<String, Employee>();
	searchEmployeeByEMailId = new HashMap<String, Employee>();
    }

    @Override
    public boolean addEmployee()
    {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean modifyEmployee()
    {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean removeEmployee()
    {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean searchEmployee()
    {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public boolean getAllEmployee()
    {
	// TODO Auto-generated method stub
	return false;
    }
   
    public boolean daoKinIdExists(String currKinID)
    {
	return true;
    }
}
