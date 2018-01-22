package Main;

public class ProjectManager extends PermanentEmployee
{
    private MediclaimCoverage mediPerk;
    private int noOfExp;
    
    public ProjectManager(int employeeID, String firstName, String lastName, double salary, int noOfExp, char grade,
	    String joiningDate)
    {
	super(employeeID, firstName, lastName, grade, joiningDate);
	
	this.noOfExp = noOfExp;
	super.setSalary(10000 * this.noOfExp);
	
	this.mediPerk = new MediclaimCoverage(salary, 100);
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
