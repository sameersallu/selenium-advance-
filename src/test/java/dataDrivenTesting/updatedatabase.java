package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatedatabase {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Seleniuma5","root","root");
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate("insert into employees(empno,ename,salary,phone) values('503','kgf','50000','6430255453')");
		System.out.println(result);
		connection.close();
		
	}
}
