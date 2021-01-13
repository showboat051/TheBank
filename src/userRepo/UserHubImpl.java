package userRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.User;
import utils.DBconnections;
import utils.TestingInput;

public class UserHubImpl implements UserHub {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet set = null;

	@Override
	public List<User> findAll() {
		ArrayList<User> Users = new ArrayList();
		
			String sql = "select * from bank_users";
			try {
				conn = DBconnections.getConnection();
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return Users;
	} // end of findAll()

	
	
	
	
	


	
	@Override
	public List<User> findById(int userId) {
		ArrayList<User> User = new ArrayList();
		String sql = "select * from bank_users where userId = ?";
		try {
			conn = DBconnections.getConnection();
			stmt =  conn.prepareStatement(sql);
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
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Data received");
		return User;
		
	} // end of findById()
	
	@Override
	public List<User> findByUserName(String username) {
		ArrayList<User> UserList = new ArrayList();
		String sql = "select * from bank_users where username = ?";
		try {
			conn = DBconnections.getConnection();
			stmt =  conn.prepareStatement(sql);
			
			stmt.setString(1, username); 
			
		set = stmt.executeQuery();
		
		
		
			while(set.next() ) {
				
				UserList.add(new User(
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
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Data received");
		return UserList;
		
	}
 // end of findByUserName()
	
//
	
	@Override
	public boolean insert(User user) {
	
		
		String sql = "INSERT into bank_users(userId, username, pw, firstname, email, bank_role )"
				+ "VALUES (?,?,?,?,?,?,?) ";
		try {
			conn = DBconnections.getConnection();
			stmt =  conn.prepareStatement(sql);
		set = stmt.executeQuery();
		
		User newOne = new User(
				set.getInt("userId"),
				set.getString("username"),
				set.getString("pw"),
				set.getString("firstname"),
				set.getString("lastname"),
				set.getString("email"),
				set.getString("bank_role"));
			
		if (set != null) {
			return true;
		} else {
			return false;
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return false;
		
		
		
	} // end of insert()

	

	@Override
	public boolean delete(User user) {

		
		String sql = "update bank_users SET userId=?, username=?, pw=?, firstname=?, lastname=?, email=?, bank_role=?";
		try {
			conn = DBconnections.getConnection();
			stmt =  conn.prepareStatement(sql);
		set = stmt.executeQuery();
		
		
		
		
		if (set == null) {
			return true;
		} else
			return false;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
	
		
	} // end of delete()

	@Override
	public boolean update(User user) {
		
		String sql = "update bank_users SET userId=?, username=?, pw=?, firstname=?, lastname=?, email=?, bank_role=?";
		try {
			conn = DBconnections.getConnection();
			stmt =  conn.prepareStatement(sql);
		set = stmt.executeQuery();
		
		
		stmt.setInt(1, user.getUserId());
		stmt.setString(2, user.getUsername());
		stmt.setString(3, user.getPassword());
		stmt.setString(4, user.getFirstName());
		stmt.setString(5, user.getLastName());
		stmt.setString(6, user.getEmail());
		stmt.setString(7, user.getRole());		
		
		if (set == null) {
			return true;
		} else
			return false;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
	} // end of update()









	@Override
	public User insert() {
		// TODO Auto-generated method stub
		return null;
	}









	









	








	


}
