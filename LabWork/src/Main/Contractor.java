package Main;

public class Contractor
{
    private ContractEmployee allContractsEmp[];
    private static int countConEmployee = 0;
    private int totalEmp = 4;
    private int ratePerHr;

    public Contractor(int ratePerHr)
    {
	this.ratePerHr = ratePerHr;
	allContractsEmp = new ContractEmployee[totalEmp];
    }

    public void addConEmployee(ContractEmployee aConEmp)
    {
	if (countConEmployee < totalEmp)
	{
	    allContractsEmp[countConEmployee] = aConEmp;
	    ++countConEmployee;
	}
    }
    
    public int getRatePerHr()
    {
	return ratePerHr;
    }

}
