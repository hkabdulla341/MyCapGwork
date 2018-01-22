package Main;

import java.util.Date;

public class AllCert
{
    private boolean passed;
    private Date passedDate;

    public AllCert(boolean passed, String date)
    {
	super();
	this.passed = passed;	
	this.passedDate = DateModder.getDate(date);
    }

    public Date getPassedDate()
    {
	return passedDate;
    }

    public boolean isPassed()
    {
	return passed;
    }

    public void setPassed(boolean passed)
    {
	this.passed = passed;
    }
}
