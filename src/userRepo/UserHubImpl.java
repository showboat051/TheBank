package userRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.User;

public class UserHubImpl implements UserHub {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet set = null;

	@Override
	public List<User> findAll() {
		ArrayList<User> Users = new ArrayList();
		try {
			Class.forName("org.postgresql.Driver");
		conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres",
					"postgres",
					"password");
			String sql = "select * from bank_users";
			stmt =  conn.prepareStatement(sql);
			set = stmt.executeQuery();
			while(set.next() ) {
				
				Users.add(new User(
						set.getInt("userId"),
						set.getString("username"),
						set.getString("pw"),
						set.getString("firstname"),
						set.getString("lastname"),
						set.getString("email"),
						set.getString("bank_role")
						));
			} // end of while loop
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Users;
	} // end of findAll()

	
	
	
	
	


	
	@Override
	public List<User> findById(int userId) {
		ArrayList<User> User = new ArrayList();
		try {
			Class.forName("org.postgresql.Driver");
		conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres",
					"postgres",
					"password");
		String sql = "select * from bank_users where userId = ?";
		stmt = conn.prepareStatement(sql);
		
		stmt.setInt(1, userId); 
		
		set = stmt.executeQuery();
			while(set.next() ) {
				
				User.add(new User(
						set.getInt("userId"),
						set.getString("username"),
						set.getString("pw"),
						set.getString("firstname"),
						set.getString("lastname"),
						set.getString("email"),
						set.getString("bank_role")
						));
			} // end of while loop
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data received");
		return User;
		
	} // end of findById()
	
	@Override
	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}



}
