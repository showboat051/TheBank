package utils;

import java.util.Scanner;

public class TestingInput {
	
	public static Scanner getInput() {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id #: ");
	sc.nextLine();
	System.out.println("Enter username: ");
	sc.nextLine();
	System.out.println("Enter password: ");
	sc.nextLine();
	System.out.println("Enter First Name: ");
	sc.nextLine();
	System.out.println("Enter Last Name: ");
	sc.nextLine();
	System.out.println("Enter Email: ");
	sc.nextLine();
	System.out.println("Enter Role: ");
	return sc;
	}
}
