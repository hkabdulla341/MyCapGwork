package Main;

public abstract class PermanentEmployee extends Employee
{
    private static int numberOfPermEmployee = 0;

    {
	incrementPermEmpCount();
    }

    public PermanentEmployee()
    {
	// TODO Auto-generated constructor stub
    }

    public void incrementPermEmpCount()
    {
	numberOfPermEmployee++;
    }

    public PermanentEmployee(int employeeID, String firstName, String lastName, double salary, char grade,
	    String joiningDate)
    {
	super(employeeID, firstName, lastName, salary, grade, joiningDate);
    }

    public PermanentEmployee (int employeeID, String firstName, String lastName, char grade, String joiningDate)
    {
	super(employeeID, firstName, lastName, grade, joiningDate);
    }
    
    public static int getNumberOfPermEmployee()
    {
	return numberOfPermEmployee;
    }

    public static void printTotalPermEmpoyee()
    {
	System.out.println("Total Permanent employee created : " + getNumberOfPermEmployee());
    }
}
