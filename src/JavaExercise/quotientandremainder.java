package JavaExercise;

import java.util.Scanner;
public class quotientandremainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double num1 , num2 , output1 , output2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    num1 = sc.nextFloat();
    System.out.println("Enter the second number:");
    num2 = sc.nextFloat();
    sc.close();
    
    output1 = num1 / num2;
    System.out.println("Quotient is:"+output1);
    
    output2 = num1 % num2;
    System.out.println("Reminder is:"+output2);
	}

}
