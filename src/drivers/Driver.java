package drivers;

import models.User;
import userRepo.UserHubImpl;

public class Driver {

	public static void main (String[] args) throws ClassNotFoundException {
		UserHubImpl uhi = new UserHubImpl();
//		System.out.println(uhi.findAll());
//		System.out.println(uhi.findById(34));
//		System.out.println(uhi.findByUserName("BOAT"));
//		User noob = new User(34, "Shaq", "Diesel", "Shaquille", "Oneal", "biggone@.com", "customer");
		System.out.println(uhi.insert());
//		
	}

}
