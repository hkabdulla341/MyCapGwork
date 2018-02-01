package com.flp.ems.domain;

public class Project
{
    private int prjId;
    private String prjName;
    private String prjDescription;
    private Department prjDepartment;

    public int getPrjId()
    {
	return prjId;
    }

    public void setPrjId(int prjId)
    {
	this.prjId = prjId;
    }

    public String getPrjName()
    {
	return prjName;
    }

    public void setPrjName(String prjName)
    {
	this.prjName = prjName;
    }

    public String getPrjDescription()
    {
	return prjDescription;
    }

    public void setPrjDescription(String prjDescription)
    {
	this.prjDescription = prjDescription;
    }

    public Department getPrjDepartment()
    {
	return prjDepartment;
    }

    public void setPrjDepartment(Department prjDepartment)
    {
	this.prjDepartment = prjDepartment;
    }
}
