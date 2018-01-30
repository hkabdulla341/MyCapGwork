import java.util.HashMap;
import java.util.Map;

public class MainClass
{

    public static void main(String[] args)
    {
	Map <EmpKey, Employee> employeeMap = new HashMap<EmpKey, Employee>();
	
	
	
	Employee empA =  new Employee(1, "abc", "def", 'a',"01/01/2019");
	Employee empB =  new Employee(2, "abc", "def", 'a',"01/01/2019");
	Employee empC =  new Employee(3, "abc", "def", 'a',"01/01/2019");
	
	employeeMap.put(new EmpKey(empA.getEmployeeID()), empA);
	employeeMap.put(new EmpKey(empB.getEmployeeID()), empB);
	employeeMap.put(new EmpKey(empC.getEmployeeID()), empC);
	
	
	EmpKey searchEmpKey1 = new EmpKey(1);
	
	if(employeeMap.containsKey(searchEmpKey1))
	{
	    System.out.println("Emp with key 1 exist...");
	}
	else
	{
	    System.out.println("Emp with key 1 does not exist...");
	}
	
	EmpKey searchEmpKey0 = new EmpKey(0);
	
	if(employeeMap.containsKey(searchEmpKey0))
	{
	    System.out.println("Emp with key 0 exist...");
	}
	else
	{
	    System.out.println("Emp with key 0 does not exist...");
	}
    }

}
