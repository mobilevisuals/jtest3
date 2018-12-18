import java.util.Scanner;

public class Vars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		num=100;
		num=num*2;
		System.out.println("sfsdfsdf");
		System.out.println("sdfsdfdsf");
	/*	Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		scanner.close();*/
		for (int i = 0; i < 10; i++) {
			System.out.println("this is i"+i);
			//System.out.println("end");
		}
		
		int x=10,y=20;
		if(x<y)
			System.out.println("x smallest");
		else if(x==y)
			System.out.println("equal");
		else
			System.out.println("x biggest");
		
		
		String test="test";
		if(test.equals("t"))
			System.out.println("same word");
		else
			System.out.println("not same word");
		
		char c='f';
		if(c=='g')
			System.out.println("same char");
		else
			System.out.println("not same char");
		
		
	}

}
