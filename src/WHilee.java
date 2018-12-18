import java.util.Scanner;

public class WHilee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		boolean run=true;
		while(run)
		{
			int number=scanner.nextInt();
			sum+=number;
			System.out.println(sum);
			
		}
		scanner.close();

	}

}
