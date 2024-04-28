package JavaExercise;

public class recursion {

	public static void main(String[] args) {
		int a = add(10);
		System.out.println(a);
		int b = add(5,10);
		System.out.println(b);
		
	}
		
		//add 1 to 10 numbers using recursion
		
		 public static int add(int k) {
			 if(k>0) {
				 return k + add(k-1); }
				 else {
					 return 0; 
			 }
		 }
			// add numbers between 5 to 10 using recursion
			 
		public static int add(int i , int j) {
			if(j>i) {
				return j + add(i , j-1);
				}
				return j;
			}
		
		}

	


