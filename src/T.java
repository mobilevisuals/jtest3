import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0, absolutValueOfNumber;
		Scanner scanner = new Scanner(System.in);
		boolean b=true;
		while (b) {
		number=scanner.nextInt();
		absolutValueOfNumber=number<0?-number:number;
		System.out.println(absolutValueOfNumber);
		}
		scanner.close();
		

	}

}
