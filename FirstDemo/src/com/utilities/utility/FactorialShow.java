package com.utilities.utility;

import java.util.Scanner;

import com.bridgeit.programs.FactorialDemo;

public class FactorialShow {

	
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		n=scanner.nextInt();
		FactorialDemo factorialDemo=new FactorialDemo();
		System.out.println("Your factorial of a number is"+factorialDemo.factorial(n));
		

	}

}
