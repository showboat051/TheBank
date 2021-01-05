package userRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.User;

public class UserHubImpl implements UserHub {

	@Override
	public List<User> findAll() {
		ArrayList<User> Users = new ArrayList();
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		try {
			
		conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/postgres",
					"postgres",
					"password");
		System.out.println("connected");
			stmt = conn.createStatement();
			set = stmt.executeQuery("select * from user");
			while(set.next()) {
				Users.add(new User(
						set.getInt(1),
						set.getString(2),
						set.getString(3),
						set.getString(4),
						set.getString(5),
						set.getString(6),
						set.getString(7)
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Users;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

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
