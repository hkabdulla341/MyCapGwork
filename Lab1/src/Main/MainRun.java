package Main;

import java.util.*;

public class MainRun
{

    public static void main(String[] args)
    {
	ArrayList<String> options = new ArrayList<>();
	options.add("Options");
	options.add("Add New Employee");
	options.add("Display all Employee Details");
	options.add("Display total employees created");
	options.add("Exit");

	char userOpt = 'a';
	ArrayList<Employee> allEmployee = new ArrayList<>();

	while (userOpt != 'z')
	{
	    userOpt = Utility.optionsDisplayer(options);
	    
	    switch (userOpt)
	    {
		case 'a':
		    allEmployee.add(createNewEmployee());
		    System.out.println("\nNew Employee Created.");
		    break;
		    
		case 'b':
		    
		    for (Employee employee : allEmployee)
		    {
			employee.toString();
			System.out.print(System.getProperty("line.separator"));
		    }
		    
		    break;
		    
		case 'c':
		    Employee.printTotalEmpoyee();
		    break;
	    }
	    
	    System.out.print(System.getProperty("line.separator"));
	}
    }

    private static Employee createNewEmployee()
    {
	 int employeeID = EmployeeIDGenerator.getEmpolyeeNum();
	 String firstName = Keyboard.readString("Enter First Name : ");
	 String lastName = Keyboard.readString("Enter Last Name : ");
	 float salary = Keyboard.readFloat("Enter Salary : ");
	 char grade = Keyboard.readChar("Enter Grade : "); 
	 String joiningDate = Keyboard.readString("Enter Joining Data (MM/YYYY) : ");
	 
	 Employee newEmp = new Employee(employeeID, firstName, lastName, salary, grade, joiningDate);
	 return newEmp;
    }
}
