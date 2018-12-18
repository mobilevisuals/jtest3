

public class Debug {

	public static void main(String[] args) {

		Debug d = new Debug();
		int numberOffR = d.countR("sfsdfsdfrfffrddr");
		double calc=d.calculate(numberOffR);
		System.out.println(calc);
		

	}

	private int countR(String word)

	{

		int rcounter = 0;

		char[] chars = word.toCharArray();

		for (char c : chars) {

			if (c == 'r')
				rcounter++;
		}

		return rcounter;

	}
	
	private double calculate(int number)
	{
		double calc=Math.log10(number)-Math.pow(2, number);
		return calc;
	}

}