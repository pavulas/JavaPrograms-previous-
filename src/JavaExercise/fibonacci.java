package JavaExercise;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int count = 10;
      int num1 = 0;
      int num2 = 1;
      System.out.print(num1+" "+num2);
      for(int i=2;i<=count;i++)
      {
    	 int c = num1 + num2;
    	 System.out.print(" "+c);
    	 num1 = num2;
    	 num2 = c;
    	 
      }
	}

}
