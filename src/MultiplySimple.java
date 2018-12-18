
import java.util.Scanner;


public class MultiplySimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number that you want to see multiplied.");
		int number = scan.nextInt();
		
	
			for(int i = 0; i <= 10; i++){
				System.out.println(number * i);
			}
		
		
		scan.close();

	}

}

