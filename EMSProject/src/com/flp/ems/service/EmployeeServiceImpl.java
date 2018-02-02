package com.flp.ems.service;

import com.flp.ems.dao.EmployeeDaoImplForList;

public class EmployeeServiceImpl implements IEmployeeService
{
    EmployeeDaoImplForList daoEmploylist;
    
    public EmployeeServiceImpl()
    {
	daoEmploylist = new EmployeeDaoImplForList();
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

    public boolean serviceKinIdCheckExists(String currKinID)
    {
	return this.daoEmploylist.daoKinIdExists(currKinID);
    }
    
    public boolean serviceEmailIdCheckExists(String eMailID)
    {
	return this.daoEmploylist.daoEmailIdExists(eMailID);
    }
}
