package Main;

public class ProjectManager extends PermanentEmployee
{
    private MediclaimCoverage mediPerk;
    private int noOfExp;
    private static int PM_EXP_SALARY_MULTIPLIER = 10000;
    
    public ProjectManager(int employeeID, String firstName, String lastName, int noOfExp, char grade,
	    String joiningDate)
    {
	super(employeeID, firstName, lastName, grade, joiningDate);
	
	this.noOfExp = noOfExp;
	super.setSalary(PM_EXP_SALARY_MULTIPLIER * this.noOfExp);
	
	this.mediPerk = new MediclaimCoverage(super.getSalary(), 100);
    }
    
    public double getMediPerk()
    {
	return mediPerk.getMediCoverage();
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
