package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.User;
import userRepo.UserHubImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserHubImpl UserHubImpl;
	private int userId;
       

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
       this.UserHubImpl = new UserHubImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		
		switch (action) {
		case "/new" :
				break;
		case "/register" :
			registerNewUser(request,response);
			break;
		case "/insert" :
			insertUser(request,response);
			break;
		case "/delete" :
			
			break;
		case "/edit" :
			break;
		case "/update" :
			break;
			default:
				showUser(request, response);
				break;
		} // end of switch
		
	} // end of doGet()
	
	private void showUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> showUser = UserHubImpl.findAll();
		request.setAttribute("showUser", showUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewUser.jsp");
	}
	
	private void registerNewUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewUser.jsp");
	} // end of registerNewUser()
	
	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password= request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String  role = request.getParameter(" role");
		User newUser = new User(username, password,firstName,lastName,email, role);
		UserHubImpl.insert(newUser);
		response.sendRedirect("list");
	} // end of insertUser()

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		userId = Integer.parseInt(request.getParameter("userId"));
//
//		String userId = request.getParameter("userId");
//		String username = request.getParameter("username");
//		String password= request.getParameter("password");
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		String email = request.getParameter("email");
//		String  role = request.getParameter(" role");
//		User user = new User();
//		
//		
////		user.setUserId(userId);
//		user.setUsername(username);
//		user.setPassword(password);
//		user.setFirstName(firstName);
//		user.setLastName(lastName);
//		user.setEmail(email);
//		user.setRole(role);
////		doGet(request, response); 
		this.doGet(request, response);
		
	}

}
