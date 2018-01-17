package Main;

public class ContractEmployee extends Employee
{
    private String contractor;
    private static int numberOfContrEmployee = 0;
    
    private double ratePerHr;
    private int noOfHrWorked;

    {
	incrementContEmpCount();
    }

    public ContractEmployee(int employeeID, String firstName, String lastName, double ratePerHr, int noOfHrWorked, 
	    char grade, String joiningDate, String contractor)
    {
	super(employeeID, firstName, lastName);
	
	this.ratePerHr = ratePerHr;
	this.noOfHrWorked = noOfHrWorked;
	
	super.setSalary(ratePerHr*noOfHrWorked);
	super.setGrade(grade);
	super.setJoiningDate(joiningDate);
	
	this.contractor = contractor;
    }

    public void incrementContEmpCount()
    {
	++numberOfContrEmployee;
    }
    
    public String getContractor()
    {
	return contractor;
    }
    
    public void setContractor(String contractor)
    {
	this.contractor = contractor;
    }
    
    public static int getNumberOfContrEmployee()
    {
	return numberOfContrEmployee;
    }
    
    public static void printTotalConEmpoyee()
    {
	System.out.println("Total Contract employee created : " + getNumberOfContrEmployee());
    }
}
