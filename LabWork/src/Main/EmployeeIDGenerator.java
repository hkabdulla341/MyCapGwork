package Main;

public class EmployeeIDGenerator
{
    private static int generatornum;

    public EmployeeIDGenerator()
    {
	generatornum = 0;
    }
    
    public static int getTotalEmployee()
    {
	return generatornum;
    }

    private static void incrementNum()
    {
	++generatornum;
    }
    
    public static int getEmpolyeeNum()
    {
	int returnNum = generatornum++;
	incrementNum();
	
	return returnNum;
    }
    
    public static void printTotalEmpoyee()
    {
	System.out.println("Total employee created :" + getTotalEmployee());
    }
}
