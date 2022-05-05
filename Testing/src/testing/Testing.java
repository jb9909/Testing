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
		Josh_testing.main1();
		//more testing comments
		//testing 2
	}
	
	private static void user2() {
		User2_testing.main1();
	}

}
