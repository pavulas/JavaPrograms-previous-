package JavaExercise;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1 , num2 , output = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first number:");
     num1 = sc.nextInt();
     System.out.println("Enter second number:");
     num2 = sc.nextInt();
     System.out.println("Enter an operator:");
     char op = sc.next().charAt(0);
     sc.close();
     
     switch(op)
     {
     case '+':
    	 output = num1 + num2;
    	 break;
     case '-':
    	 output = num1 - num2;
    	 break;
     case '*':
    	 output = num1 * num2;
    	 break;
     case '/':
    	 output = num1 / num2;
    	 break;
     default :
    	 System.out.println("You have entered wrong input");
     }
    	
     System.out.println(num1 + " " + op + " " + num2 + " = " + output);
     
     
	}

}
