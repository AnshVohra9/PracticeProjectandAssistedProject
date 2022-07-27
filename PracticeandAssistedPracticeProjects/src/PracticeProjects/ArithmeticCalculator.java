package PracticeProjects;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("sum is" + " " +(num1 +num2));
		System.out.println("difference is" + " " +(num1 -num2));
		System.out.println("product is" + " " + (num1 *num2));
		System.out.println("the quotient is" + " " + (num1 /num2));
		// TODO Auto-generated method stub

	}

}
