package Main;

public class ProjectManager extends PermanentEmployee implements OneHundredMediclaim
{

    public ProjectManager()
    {
    }

    public ProjectManager(int employeeID, String firstName, String lastName, double salary, char grade,
	    String joiningDate)
    {
	super(employeeID, firstName, lastName, salary, grade, joiningDate);
    }

    public ProjectManager(int employeeID, String firstName, String lastName)
    {
	super(employeeID, firstName, lastName);
    }
    
    @Override
    public double get100Mediclaim()
    {
	return (getSalary()*12) * 1;
    }
}
