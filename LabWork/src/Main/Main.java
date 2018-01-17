package Main;

public class Main
{

    public static void main(String[] args)
    {
	Employee a = new Employee(Employee.getEmployeeCount()+1, "abc", "def", 2000, 'a', "jan/2017");
	Employee.printTotalEmpoyee();
	Employee b = new Employee(Employee.getEmployeeCount()+1, "abc", "def", 2000, 'a', "jan/2017");
	Employee.printTotalEmpoyee();
	Employee c = new Employee(Employee.getEmployeeCount()+1, "abc", "def");
	Employee.printTotalEmpoyee();
	Employee d = new Employee(Employee.getEmployeeCount()+1, "123", "456");
	Employee.printTotalEmpoyee();
    }

}
