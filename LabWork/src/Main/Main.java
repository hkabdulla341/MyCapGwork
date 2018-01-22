package Main;

import com.sun.security.auth.callback.TextCallbackHandler;

import Main.Contractor.ContractEmployee;

public class Main
{

    public static void main(String[] args)
    {
	Contractor aContractor = new Contractor(8.5);
	
	ContractEmployee a = aContractor.new TechAssoicateContract(Employee.getEmployeeCount() + 1, "abc", "abc", 'a', 40, "01/01/2017");
	aContractor.addContractEmployee(a);
	System.out.println("Total Contract employee created : " + Contractor.getNumberOfContrEmployee());
	
	ContractEmployee b = aContractor.new TechAssoicateContract(Employee.getEmployeeCount() + 1, "def", "def", 'a', 42, "01/01/2017");
	aContractor.addContractEmployee(b);
	System.out.println("Total Contract employee created : " + Contractor.getNumberOfContrEmployee());
	
	ContractEmployee c = aContractor.new TechAssoicateContract(Employee.getEmployeeCount() + 1, "ghi", "ghi", 'a', 45, "01/01/2017");
	aContractor.addContractEmployee(c);
	System.out.println("Total Contract employee created : " + Contractor.getNumberOfContrEmployee());
	
	PermanentEmployee perm = new ProjectManager(Employee.getEmployeeCount() + 1, "abc", "def", 3, 'v', "06/06/2016");
	PermanentEmployee perm2 = new TechAssoicatePerm(Employee.getEmployeeCount() + 1, "abc", "def", 3, 5, 'v', "06/06/2016");
	
	System.out.println();
	System.out.println(aContractor.toString());
	
	System.out.println("PM with 3yr exp : " + perm.getSalary());
	System.out.println("TechAssoPerm with 3 years & 5 certs : " + perm2.getSalary());
	System.out.println(aContractor.listOfContractor[0].getSalary());
		
	
//	Employee listOfEmployees[] = new Employee[8];
//
//	Employee a = new Employee(Employee.getEmployeeCount() + 1, "abc", "def", 2000, 'a', "01/01/2017");
//	Employee.printTotalEmpoyee();
//	listOfEmployees[a.getEmployeeID() - 1] = a;
//
//	Employee b = new Employee(Employee.getEmployeeCount() + 1, "abc", "def", 2000, 'a', "01/01/2017");
//	Employee.printTotalEmpoyee();
//	listOfEmployees[b.getEmployeeID() - 1] = b;
//
//	Employee c = new Employee(Employee.getEmployeeCount() + 1, "abc", "def");
//	Employee.printTotalEmpoyee();
//	listOfEmployees[c.getEmployeeID() - 1] = c;
//
//	Employee d = new Employee(Employee.getEmployeeCount() + 1, "123", "456");
//	Employee.printTotalEmpoyee();
//	listOfEmployees[d.getEmployeeID() - 1] = d;
//
//	Employee g = new ContractEmployee(Employee.getEmployeeCount() + 1, "abc", "def", 8.75, 8, 'a', "01/01/2017",
//		listOfContractor[0]);
//	ContractEmployee.printTotalConEmpoyee();
//	listOfEmployees[g.getEmployeeID() - 1] = g;
//
//	Employee e = new PermanentEmployee(Employee.getEmployeeCount() + 1, "abc", "def", 2000, 'a', "01/01/2017");
//	PermanentEmployee.printTotalPermEmpoyee();
//	listOfEmployees[e.getEmployeeID() - 1] = e;
//
//	Employee f = new PermanentEmployee(Employee.getEmployeeCount() + 1, "abc", "def", 2000, 'a', "01/01/2017");
//	PermanentEmployee.printTotalPermEmpoyee();
//	listOfEmployees[f.getEmployeeID() - 1] = f;
//
//	Employee h = new ContractEmployee(Employee.getEmployeeCount() + 1, "abc", "def", 8.75, 8, 'a', "01/01/2017",
//		listOfContractor[1]);
//	ContractEmployee.printTotalConEmpoyee();
//	listOfEmployees[h.getEmployeeID() - 1] = h;
//
//	System.out.println("Total employees " + listOfEmployees.length);
//
//	int searchEmp = 1;
//	boolean foundEmp = false;
//	
//	int getEmployeeDetails = 0;
//	
//	for(int i = 0 ; i < listOfEmployees.length && !foundEmp; i++)
//	{
//	    if(listOfEmployees[i].getEmployeeID() == searchEmp)
//	    {
//		foundEmp = true;
//		getEmployeeDetails = i;
//	    }
//	}
//
//	try
//	{
//	    if(foundEmp)
//	    {
//		System.out.println("\n" + listOfEmployees[getEmployeeDetails]);
//	    }
//	    else
//	    {
//		throw new EmployeeNotFoundException ("Employee " + searchEmp + " is not found!!!");
//	    }
//	}
//	catch(EmployeeNotFoundException ex)
//	{
//	    System.out.println("Exception Msg : " + ex.getMessage());
//	}
    }

}
