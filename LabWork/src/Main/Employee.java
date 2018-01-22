package Main;

import java.util.*;

public class Employee
{
    private int employeeID; // auto-generated
    private String firstName;
    private String lastName;
    private double salary;
    private char grade; // assumption A,B,C,..,Z
    private Date joiningDate;
    public static int employeeCount = 0;

    {
	incrementNum();
    }

    public Employee()
    {
	// Default constructor
    }

    public Employee(int employeeID, String firstName, String lastName, double salary, char grade, String joiningDate)
    {
	this.employeeID = employeeID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
	this.grade = grade;

	setJoiningDate(joiningDate);
	this.joiningDate = getJoiningDate();
    }

    public Employee(int employeeID, String firstName, String lastName, char grade, String joiningDate)
    {
	this.employeeID = employeeID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.grade = grade;
	
	setJoiningDate(joiningDate);
	this.joiningDate = getJoiningDate();
    }

    private static void incrementNum()
    {
	employeeCount++;
    }

    public static int getEmployeeCount()
    {
	return employeeCount;
    }

    public static void printTotalEmpoyee()
    {
	System.out.println("Total employee created : " + getEmployeeCount());
    }

    public int getEmployeeID()
    {
	return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
	this.employeeID = employeeID;
    }

    public String getFirstName()
    {
	return firstName;
    }

    public void setFirstName(String firstName)
    {
	this.firstName = firstName;
    }

    public String getLastName()
    {
	return lastName;
    }

    public void setLastName(String lastName)
    {
	this.lastName = lastName;
    }

    public double getSalary()
    {
	return salary;
    }

    public void setSalary(double salary)
    {
	this.salary = salary;
    }

    public char getGrade()
    {
	return grade;
    }

    public void setGrade(char grade)
    {
	this.grade = grade;
    }

    public Date getJoiningDate()
    {
	return joiningDate;
    }

    public void setJoiningDate(String joiningDate)
    {
	Date setD = DateModder.getDate(joiningDate);
	this.joiningDate = setD;
    }

    @Override
    public String toString()
    {
	return employeeID + ") " + firstName + " " + lastName + " - $" + salary + " - " + grade + " - " + joiningDate;
    }
    
    public String getFullName()
    {
	return getFirstName() + " " + getLastName();
    }
}
