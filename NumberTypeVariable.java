package com.Practice;
import java.util.Scanner;
public class NumberTypeVariable {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int firstIntNumber = 10;
		float accountBalance = 116;
		float secondFloatNumber = 20;	
		double thirdDoubleNumber = sc.nextDouble();
		double fourthDoubleNumber = thirdDoubleNumber/5;	
		
//		System.out.println("first Int Number : " + firstIntNumber + 
//			                   	"\n" + " second Float Number " +secondFloatNumber);
//		System.out.println("third double number : " + thirdDoubleNumber);
//		System.out.println("fourth Double Number : " + fourthDoubleNumber);
		
		secondFloatNumber = secondFloatNumber+2;
		float result = accountBalance % firstIntNumber;
		System.out.println(" second Float Number : " + secondFloatNumber);
		System.out.println(" result : " + result);
		
		secondFloatNumber/=5;
		System.out.println(" second Float Number : " + secondFloatNumber);
		
	}
}


