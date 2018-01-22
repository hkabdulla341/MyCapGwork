package Main;

public class TechAssoicatePerm extends PermanentEmployee
{
    private int noOfTechCerts;
    private int noOfYears;
    private static final int TECH_CERT_MULTIPLIER = 5000;
    private static final int TECH_EXP_MULTIPLIER = 1000;

    public TechAssoicatePerm(int employeeID, String firstName, String lastName, int noOfTechCerts, int noOfYears,
	    char grade, String joiningDate)
    {
	super(employeeID, firstName, lastName, grade, joiningDate);

	this.noOfTechCerts = noOfTechCerts;
	this.noOfYears = noOfYears;
	super.setSalary((TECH_CERT_MULTIPLIER * this.noOfTechCerts) + (TECH_EXP_MULTIPLIER * this.noOfYears));

	super.setMediPerk(new MediclaimCoverage(super.getSalary(), 200));
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
	return "Emp Id : " + super.getEmployeeID() + ") " + "Full Name : " + super.getFullName() + "Designation : "
		+ this.getDesignation();
    }
}
