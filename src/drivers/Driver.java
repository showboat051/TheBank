package drivers;

import userRepo.UserHubImpl;

public class Driver {

	public static void main (String[] args) throws ClassNotFoundException {
		UserHubImpl uhi = new UserHubImpl();
//		System.out.println(uhi.findAll());
//		System.out.println(uhi.findById(2));
		System.out.println(uhi.findByUserName("BOAT"));
	}

}
