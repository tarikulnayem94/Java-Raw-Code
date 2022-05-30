package com.Practice;
import java.util.Scanner;

public class Math_power_Use {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter your value : ");
		int x = scanner.nextInt();

		System.out.print("enter your power : ");
		int y = scanner.nextInt();

		double result = Math.pow(x, y);
		System.out.println(result);
		
	}
}



