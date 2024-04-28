
package JavaExercise;

public class helloWorld {
	static int y =10;      //defining static variable outside class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;      //local variable
		double b = 23.5;
		boolean isCustomer = false;
		String d = "welcome";
		char c = 'P';
		float x = 12.5f;
		int i=0;
		i=i+1;
		i++;
		System.out.println(i++);
		
		System.out.println("The length of the string is:" +d.length());
		System.out.println(isCustomer);
	   System.out.println("Value of a="+a);
       System.out.println("Hello World");
       System.out.println("Value of b="+b);
       System.out.println("Value of c="+c);
       System.out.println(d);
       System.out.println(x);
       System.out.println("Minimum value:" +Float.MIN_VALUE);
       System.out.println("Maximum value:" +Integer.MAX_VALUE);
	}

	 public void add() {         //another method
		 System.out.println(y);
		 return ;
	 }
}
