package userRepo;

import java.util.List;

import models.User;

public interface UserHub {
	
	List<User> findAll() throws ClassNotFoundException;
	List<User> findById(int id);
	List<User> findByUserName(String username);
	void insert(User user);
	void delete(User user);
	void update(User user);
}
