package Main;

public class TechAssoicatePerm extends PermanentEmployee
{
    private MediclaimCoverage mediPerk;
    private int noOfTechCerts;
    private int noOfYears;
    
    public TechAssoicatePerm(int employeeID, String firstName, String lastName, int noOfTechCerts, 
	    int noOfYears , char grade, String joiningDate)
    {
	super(employeeID, firstName, lastName, grade, joiningDate);
	
	this.noOfTechCerts = noOfTechCerts;
	this.noOfYears = noOfYears;
	super.setSalary((5000*this.noOfTechCerts) + (1000*this.noOfYears));
	
	this.mediPerk = new MediclaimCoverage(super.getSalary(), 200);
    }
    
    public double getMediPerk()
    {
	return mediPerk.getMediCoverage();
    }
    
    public String getDesignation()
    {
	return "TA-P";
    }
    
    public int getNoOfYears()
    {
	return noOfYears;
    }
    
    public String toString()
    {
        return "Emp Id : " + super.getEmployeeID() + ") " + "Full Name : "  + super.getFullName() 
        + "Designation : " + this.getDesignation();
    }
}
