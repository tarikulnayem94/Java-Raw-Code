package com.Practice;
import java.util.Scanner;
public class HelloWord {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter your name ........  " );
		
		String firstName = sc.nextLine();
		String secondName = sc.nextLine();
		
		System.out.println("your name is :  " + firstName + " " + secondName);
	}

}
