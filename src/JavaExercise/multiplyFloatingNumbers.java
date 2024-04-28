package JavaExercise;

import java.util.Scanner;

public class multiplyFloatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //double a = 12.5;
        //double b = 13.5;
        //double c = a*b;
        //System.out.println("Multiplication of numbers ="+c);
		float num1 , num2 , mul;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number:");
	    num1 = sc.nextFloat();
	    System.out.println("Enter second number:");
	    num2 = sc.nextFloat();
	    sc.close();
	    mul = num1 * num2;
	    System.out.println("Final result ="+mul);
        
	}

}
