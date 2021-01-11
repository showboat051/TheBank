package userRepo;

import java.util.List;

import models.User;

public interface UserHub {
	
	List<User> findAll() throws ClassNotFoundException;
	List<User> findById(int id);
	List<User> findByUserName(String username);
	boolean insert(User user);
	void delete(User user);
	boolean update(User user);
	User insert();
}
