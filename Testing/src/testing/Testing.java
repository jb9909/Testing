package testing;

import java.util.Scanner;

public class Testing {
	static Scanner input = new Scanner(System.in);
	static String input2;

	public static void main(String[] args) {
		
		System.out.print("please enter your name: ");
		getInput();
		System.out.println("your name is: " + input2);
		if(input2.equalsIgnoreCase("josh")) {
			user1();
		}
		else if(input2.equalsIgnoreCase("joe")) {
			user2();
		}
		else {
			System.out.println("no valid users in system detected!");
		}

	}
	
	public static void getInput() {
		input2 = input.nextLine();
		
	}
	
	private static void user1() {
		System.out.println("Welcome " + input2);
		System.out.print("are you sure you want to launch this program? \n"
				+ "y / n:");
		getInput();
		//creates a loop until user input is either y or n
		while(input2.toLowerCase().equals("y") == false && input2.toLowerCase().equals("n") == false) {
			System.out.println("INPUT NOT VALID! PLEASE TRY AGAIN!");
			getInput();
		}
		//if input is y, starts method on josh_testing class
		if(input2.toLowerCase().equals("y")) {
			Josh_testing.main1();
		}
		//if input is n, ends program
		else if(input2.toLowerCase().equals("n")) {
			System.out.println("CLOSING PROGRAM!");
		}
		
	}
	
	private static void user2() {
		User2_testing.main1();
		//new comment
	}

}
