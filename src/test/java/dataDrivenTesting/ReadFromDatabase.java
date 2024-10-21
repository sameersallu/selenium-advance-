package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadFromDatabase {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Seleniuma5","root","root");
		Statement statement = connection.createStatement();
	}
}
