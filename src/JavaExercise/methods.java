package JavaExercise;

public class methods {

	public static void main(String[] args) {      // main method
		method1();
		method2("Pranitha");
		int d = add(2,3);
		System.out.println("Addition of numbers is:" +d);

		
	}
		
	//Example 1 : creating a method without passing any parameters & no return value
		
		public static void method1() {
			System.out.println("Hello");
		}
		
		//Example 2 : creating a method with parameters & no return value
		public static void method2(String name) {
			System.out.println("Hi" + " " +name);
		}
		
		//Example 3 : creating a method with parameters & return type
		
		public static int add(int a, int b) {
			
			int c = a + b;
			return c;
			
		}
	}


