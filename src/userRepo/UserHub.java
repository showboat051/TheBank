package userRepo;

import java.util.List;

import models.User;

public interface UserHub {
	
	List<User> findAll() throws ClassNotFoundException;
	User findById(int id);
	User findByUserName(String username);
	void insert(User user);
	void delete(User user);
	void update(User user);
}
