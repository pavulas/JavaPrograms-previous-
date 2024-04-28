package JavaExercise;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//print 1 to 10 numbers using while loop
		
		int i = 1;
		while(i<=10)
		{
			System.out.print(i+ " ");
			i++;  // i=i+1
		}
		// print even numbers using while loop
		int a = 2;
		
		while(a<=10)
		{
			
			System.out.print(a+ " ");
			a+=2;
		}
			// print odd numbers using while loop
		int b = 1;
		while(b<=10)
		{
			System.out.print(b+ " ");
			b+=2;
		}
		// print numbers 1 to 10 using do while loop
		int y=1;
		 do {
			 System.out.println(y);
			 y++;
		 }while(y<=10);
	}

}
