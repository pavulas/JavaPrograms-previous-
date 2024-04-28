package JavaExercise;

import java.util.Scanner;


public class asciiCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character:");
    char ch = sc.next().charAt(0);
    sc.close();
    int ascii = ch;
    System.out.println("Print ascii value:"+ascii);
    
	}

}
