import java.util.Scanner;


public class Names {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name.");
		String firstName = input.next();

		System.out.println("Please enter your last name.");
		String lastName = input.next();
		
		String fullName = firstName + " " + lastName;
		
		System.out.println("Hej " + fullName);
		
		input.close();

	}

}
