package Main;

public class ContractEmployee extends Employee
{
    private String contractor;
    private static int numberOfContrEmployee = 0;

    {
	incrementContEmpCount();
    }

    public ContractEmployee(int employeeID, String firstName, String lastName, float salary, char grade,
	    String joiningDate, String contractor)
    {
	super(employeeID, firstName, lastName, salary, grade, joiningDate);
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
