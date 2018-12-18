import java.util.Scanner;

public class Uppgif4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Guess a new town!");
		int attempt=0;
		String input;
		String answer="Varberg";
		
		do
		{
			input=scanner.next();
			
			if(!input.equals(answer))
			{
				System.out.println("Keep guessing!");
				attempt+=1;
			}
			
		}
		while(!input.equals(answer));
		System.out.println("That's right, the answer was "+answer+" all along! It only took "+attempt+" attempt(s) to figure out!");
		
}
	}


