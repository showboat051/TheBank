package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String startAtHome () {
		return "homepage.jsp";
		
	} // end of /home endpoint
	
	@RequestMapping("/register")
	public class RegisterController {
		public String registerNewUser () {
			return "NewUser.jsp";
		}
	
}
} // end of HomeController