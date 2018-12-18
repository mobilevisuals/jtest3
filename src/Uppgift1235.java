import java.util.Scanner;

public class Uppgift1235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Uppgift1235 uppgift1235 = new Uppgift1235();
String numString=uppgift1235.converNumberToText(2);
System.out.println(uppgift1235.total(3.32f, 4.78f, 2.11f));
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter the name of the country");
String Country=scanner.next();
System.out.println("please enter the name of the capital");
String Capital=scanner.next();
System.out.println(Capital+ "is in" +Country);
scanner.close();
	}

private String converNumberToText(int number) {
	String numberAsText="";
	switch (number) {
	case 1:
		numberAsText= "One";
		break;
	case 2:
		numberAsText= "Two";
		break;
	case 3:
		numberAsText= "Three";
		break;
	default:
		numberAsText= "999";
		break;
	}
	return numberAsText;
}
Scanner keyboard=new Scanner(System.in);
private float total(float f1, float f2, float f3) {
    float addition=f1+f2+f3;
    return addition;
}


}
