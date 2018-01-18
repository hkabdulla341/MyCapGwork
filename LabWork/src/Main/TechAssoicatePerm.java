package Main;

public class TechAssoicatePerm extends PermanentEmployee implements TwoHundredMediclaim
{

    public TechAssoicatePerm()
    {
    }

    public TechAssoicatePerm(int employeeID, String firstName, String lastName, double salary, char grade,
	    String joiningDate)
    {
	super(employeeID, firstName, lastName, salary, grade, joiningDate);
    }

    public TechAssoicatePerm(int employeeID, String firstName, String lastName)
    {
	super(employeeID, firstName, lastName);
    }

    @Override
    public double get200Mediclaim()
    {
	return (getSalary()*12) * 2;
    }
}
