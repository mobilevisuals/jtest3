
public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest m=new MethodTest();
		float result=m.calculate(3.4f,4.44f);
		System.out.println(result);
		String totalName=m.name("Sven","Ericsson",56);
		System.out.println(totalName);

	}

	float calculate(float number1, float number2)
	{
		float result=number1+5.3f*number2;
		return result;
	}
	
	String name(String fname,String lastname, int age)
	{
		String totalName=fname+" "+lastname +" "+age;
		return totalName;
	}
	
	
	
}
