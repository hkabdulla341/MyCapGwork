package Main;

public class MediclaimCoverage
{
    private double mediCoverage;

    public MediclaimCoverage(double salary, double percent)
    {
	this.mediCoverage = (salary)*(percent/100);
    }
    
    public double getMediCoverage()
    {
	return mediCoverage;
    }
}
