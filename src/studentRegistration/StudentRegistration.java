//Paul Childs CIS406 Student Registration Lab//
package studentRegistration;

import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Application Welcome
	    System.out.println("Student Registration Form");
	    System.out.println();
	  
	    
	    //Prompt for user input
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();
		System.out.print("Enter last name: ");
		String lastName = input.nextLine();
		System.out.print("Enter year of birth: ");
		int yearOfBirth = input.nextInt();
		
		//Variables
		String fullName = firstName + " " + lastName;
		var password = firstName + "*" + yearOfBirth;
		
		//Display the output
		System.out.println();
		System.out.println("Welcome " + fullName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + password);
		
		//Close scanner.
				input.close();
				
	}

}
