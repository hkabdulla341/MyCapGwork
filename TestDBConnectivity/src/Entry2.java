import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Entry2
{

    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

	// TODO LOAD JDBC DRIVER into MAIN Memory
	String mySQLClassName = "com.mysql.jdbc.Driver";

	Class.forName(mySQLClassName);

	// TODO GET DB connection using JDBC URL

	String mysqljdbcURL = "jdbc:mysql://localhost:3306/world";
	Connection dbConnection = DriverManager.getConnection(mysqljdbcURL, "root", "root");
	System.out.println("Connection obtained? " + (dbConnection != null));

	// TODO CREATE STATEMENT TO EXECUTE A QUERY (?????)

	Statement stmt = dbConnection.createStatement();

	// TODO Getting the result
	ResultSet rs = stmt.executeQuery("select * from city where id = 88"); //315432
	
	stmt.execute("Update city set id = 10000 where id = 88");

//	while (rs.next())
//	{
//	    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)
//		    + " " + rs.getInt(5) + System.lineSeparator());
//	}

    }

}
