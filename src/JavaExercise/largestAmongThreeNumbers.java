package JavaExercise;

public class largestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=12 , b=13 , c=14;
    if(a>b && a>c)
    {
    	System.out.println("Largest Number is:"+a);
    }
    else if (b>a && b>c)
    {
    	System.out.println("Largest Number is:"+b);
    }
    else 
    {
    	System.out.println("Largest Number is:"+c);
    }
	}

}
