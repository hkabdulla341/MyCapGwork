package Main;

public class ProjectManager extends PermanentEmployee
{
    private int noOfExp;
    private static int PM_EXP_SALARY_MULTIPLIER = 10000;
    
    public ProjectManager(int employeeID, String firstName, String lastName, int noOfExp, char grade,
	    String joiningDate)
    {
	super(employeeID, firstName, lastName, grade, joiningDate);
	
	this.noOfExp = noOfExp;
	super.setSalary(PM_EXP_SALARY_MULTIPLIER * this.noOfExp);
	
	super.setMediPerk(new MediclaimCoverage(super.getSalary(), 100));
    }
    
    public int getNoOfExp()
    {
	return noOfExp;
    }
    
    public String getDesignation()
    {
	return "PM";
    }
    
    @Override
    public String toString()
    {
        return "Emp Id : " + super.getEmployeeID() + ") " + "Full Name : "  + super.getFullName() 
        + "Designation : " + this.getDesignation() + "No Of Exp : " + this.getNoOfExp();
    }
}
