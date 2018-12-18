
public class Static {
	
	final int surfaces=6;
	
	static int a=3;
	static int b;
	static {
		System.out.println("block");
		b=a*4;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print();

	}
	
	static void print()
	{System.out.println("a "+a);}

}
