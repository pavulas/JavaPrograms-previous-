package JavaExercise;

public class typeCasting {

	public static void main(String[] args) {
		
		//widening casting (converting int to double)
		int a = 10;
		double b = a;
		System.out.println(a);
		System.out.println(b);
		
		//narrowing casting (converting double to int)
		double i = 9.78d;
		int y = (int) i;
		System.out.println(i);
		System.out.println(y);
		

		String name1 = "How are you";
		String name2 = "Pranitha?";
		System.out.println(name2.toUpperCase());   //convert to uppercase
		System.out.println(name1 + " " + name2);    //concatenate two strings
		System.out.println(name1.indexOf("you"));
	}

}
