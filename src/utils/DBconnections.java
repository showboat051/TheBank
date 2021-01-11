package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import userRepo.UserHubImpl;

public class DBconnections {

	private static Connection conn;
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String connUsername = "postgres";
	private static final String connPassword = "password";
	
	public static Connection getConnection() throws SQLException {
		if (conn == null) {
			try {
				System.out.println("Successful connection");
				Class.forName("org.postgresql.Driver");
			}  catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(
					URL,
					connUsername,
					connPassword
					);
		}
		return conn;
	} // end of getConnection()
	
	public static UserHubImpl startUserHubImpl() {
		return new UserHubImpl();
	}
	
} // end of DBconnections
