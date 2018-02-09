import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Entry
{

    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

	// TODO LOAD JDBC DRIVER into MAIN Memory

	// String className =
	// "com.mysql.jdbc.Driver";oracle.jdbc.driver.OracleDriver
	String className = "oracle.jdbc.driver.OracleDriver";

	Class.forName(className);

	// TODO GET DB connection using JDBC URL

	String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";

	Connection dbConnection = DriverManager.getConnection(jdbcURL, "hr", "hr");
	System.out.println("Connection obtained? " + (dbConnection != null));

	System.out.println(dbConnection);

	// TODO CREATE STATEMENT TO EXECUTE A QUERY (?????)

	Statement stmt = dbConnection.createStatement();

	// TODO Getting the result
	ResultSet rs = stmt.executeQuery("select * from employees");

	while (rs.next())  
	{
	    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)
		    + " " + rs.getString(5) + " " + rs.getDate(6) + "  " + rs.getString(7) + " " + rs.getDouble(8) + " "
		    + rs.getDouble(9) + " " + rs.getInt(10) + " " + rs.getInt(11) + System.lineSeparator());
	}

    }

}
