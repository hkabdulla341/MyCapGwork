package Main;

import java.util.ArrayList;

public class Contractor
{
    // final int MAX_COUNT = 3;
    private static int numberOfContrEmployee = 0;
    private static int currInsert = 0;
    private double ratePerHr;
    // ContractEmployee[] listOfContractor = new ContractEmployee[MAX_COUNT];

    ArrayList<ContractEmployee> listOfContractor;

    public Contractor(double ratePerHr)
    {
	super();
	this.ratePerHr = ratePerHr;
	listOfContractor = new ArrayList<>();
    }

    public void incrementContEmpCount()
    {
	++numberOfContrEmployee;
    }

    public void addContractEmployee(ContractEmployee aConEmp)
    {
	// if (currInsert < MAX_COUNT)
	// {
	// listOfContractor[numberOfContrEmployee - 1] = aConEmp;
	// ++currInsert;
	// }

	listOfContractor.add(aConEmp);
    }
    
    public boolean ifContractEmployeeExists(ContractEmployee anotherConEmployee)
    {
	return listOfContractor.contains(anotherConEmployee);
    }

    @Override
    public String toString()
    {
	String temp = "";

	// for(int i = 0; i < MAX_COUNT; i++)
	// {
	// temp += listOfContractor[i].toString() + "\n";
	// }

	for (ContractEmployee aConEmp : listOfContractor)
	{
	    temp += aConEmp.toString() + "\n";
	}

	return temp;
    }

    public static int getNumberOfContrEmployee()
    {
	return numberOfContrEmployee;
    }

    public static void printTotalConEmpoyee()
    {
	System.out.println("Total Contract employee created : " + getNumberOfContrEmployee());
    }

    public double getRatePerHr()
    {
	return ratePerHr;
    }

    public abstract class ContractEmployee extends Employee // abstract
    {
	{
	    incrementContEmpCount();
	}

	@Override
	public boolean equals(Object obj)
	{
	    if(this.getFullName().compareTo( ((ContractEmployee)obj).getFullName()) == 0)
		return true;
	    else
		return false;
	}
	
	
	public ContractEmployee(int employeeID, String firstName, String lastName, char grade, int noOfHrWorked,
		String joiningDate)
	{
	    super(employeeID, firstName, lastName, grade, joiningDate);

	    if (noOfHrWorked <= 40)
	    {
		super.setSalary(ratePerHr * noOfHrWorked);
	    }
	    else if (noOfHrWorked > 40)
	    {
		super.setSalary((40 * ratePerHr) + ((noOfHrWorked - 40) * ratePerHr * 2));
	    }
	}
    }

    public class TechAssoicateContract extends ContractEmployee
    {
	public TechAssoicateContract(int employeeID, String firstName, String lastName, char grade, int noOfHrWorked,
		String joiningDate)
	{
	    super(employeeID, firstName, lastName, grade, noOfHrWorked, joiningDate);
	}

	public String getDesignation()
	{
	    return "TA-C";
	}

	public String toString()
	{
	    return "Emp Id : " + super.getEmployeeID() + ") Full Name : " + super.getFullName() + "- Designation : "
		    + this.getDesignation();
	}
    }
}
