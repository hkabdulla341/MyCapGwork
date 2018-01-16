package Main;

public class Employee
{
    private int employeeID; // auto-generated
    private String firstName;
    private String lastName;
    private float salary;
    private char grade; // assumption A,B,C,..,Z
    private String joiningDate;
    public static int employeeCount = 0;

    {
	incrementNum();
    }
    
    
    public Employee(int employeeID, String firstName, String lastName, float salary, char grade, String joiningDate)
    {
	super();
	this.employeeID = employeeID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
	this.grade = grade;
	this.joiningDate = joiningDate;	
    }
    
    public Employee(int employeeID, String firstName, String lastName)
    {
	super();
	this.employeeID = employeeID;
	this.firstName = firstName;
	this.lastName = lastName;
    }
    
    private static void incrementNum()
    {
	++employeeCount;
    }
    
    public static int getEmployeeCount()
    {
	return employeeCount;
    }
    
    public static void printTotalEmpoyee()
    {
	System.out.println("Total employee created : " + getEmployeeCount());
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public float getSalary()
    {
        return salary;
    }

    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    public char getGrade()
    {
        return grade;
    }

    public void setGrade(char grade)
    {
        this.grade = grade;
    }

    public String getJoiningDate()
    {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate)
    {
        this.joiningDate = joiningDate;
    }
    
    @Override
    public String toString()
    {
        return employeeID + ") " + firstName + " " + lastName + " - $" + salary + " - " + grade + " - " + joiningDate;
    }
    
    
}
