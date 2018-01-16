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

	char userOpt = Utility.optionsDisplayer(options);
	ArrayList<Employee> allEmployee = new ArrayList<>();

	while (userOpt != 'z')
	{
	    switch (userOpt)
	    {
		case 'a':
		    allEmployee.add(createNewEmployee());
		    break;
		    
		case 'b':
		    
		    break;
		    
		case 'c':
		    break;
	    }
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
