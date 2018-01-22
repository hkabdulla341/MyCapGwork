package Main;

public class MediclaimCoverage
{
    private double mediCoverageValue;

    public MediclaimCoverage(double salary, double percent)
    {
	this.mediCoverageValue = (salary)*(percent/100);
    }
    
    public double getMediCoverage()
    {
	return mediCoverageValue;
    }
}
