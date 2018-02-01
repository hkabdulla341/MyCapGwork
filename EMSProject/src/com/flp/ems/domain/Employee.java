/* 
SEARCH EMPLOYEE
User should be able to search an employee by kin id, email id and name. User may use any one, two or
all the three parameters to search an employee

MODIFY EMPLOYEE
Search (by kin id, user id or name) or select (from employee summary) an employee and modify the info
of employee. System should show existing data/info of employee and should support modify of one,
more or all info.

REMOVE EMPLOYEE
Search (by kin id, user id or name) or select (from employee summary) an employee and remove the
employee. System should ask for confirmation and on confirmation the data will be removed.
*/

package com.flp.ems.domain;

import java.util.Date;

public class Employee
{
    private String empName;
    private String kinId;
    private String emailID;
    private int phoneNo; 
    private String address;
    private Date dateOfBirth;
    private Date joiningDate;
    private Department empDepartment;
    private Project empProject;
    private Role empRoles;
    
    public Employee()
    {
	//Default Constructor
    }
    
    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String name)
    {
        this.empName = name;
    }

    public String getKinId()
    {
        return kinId;
    }

    public void setKinId(String kinId)
    {
        this.kinId = kinId;
    }

    public String getEmailID()
    {
        return emailID;
    }

    public void setEmailID(String emailID)
    {
        this.emailID = emailID;
    }

    public int getPhoneNo()
    {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getJoiningDate()
    {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate)
    {
        this.joiningDate = joiningDate;
    }

    public Department getEmpDepartment()
    {
        return empDepartment;
    }

    public void setEmpDepartment(Department empDepartment)
    {
        this.empDepartment = empDepartment;
    }

    public Project getEmpProject()
    {
        return empProject;
    }

    public void setEmpProject(Project empProject)
    {
        this.empProject = empProject;
    }

    public Role getEmpRoles()
    {
        return empRoles;
    }

    public void setEmpRoles(Role empRoles)
    {
        this.empRoles = empRoles;
    }

    @Override
    public boolean equals(Object obj)
    {	
	if(super.equals(obj))
	{
	    return true;
	}
	
	if(obj instanceof Employee)
	{
	    return this.kinId == ((Employee) obj).kinId;
	}
	else
	{
	    return false;
	}
    }

    @Override
    public int hashCode()
    {
	return  getEmpName().hashCode();
    }
}
