package com.flp.ems.domain;

import java.util.Date;

public class Department
{
    private int departmentID;
    private String deptName;
    private String deptDescription;
    
    public int getDepartmentID()
    {
        return departmentID;
    }
    public void setDepartmentID(int departmentID)
    {
        this.departmentID = departmentID;
    }
    public String getDeptName()
    {
        return deptName;
    }
    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }
    public String getDeptDescription()
    {
        return deptDescription;
    }
    public void setDeptDescription(String deptDescription)
    {
        this.deptDescription = deptDescription;
    }
}
