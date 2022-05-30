package com.Practice;
import java.util.Scanner;
public class BasicDataInput {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String a =" ";
		String b =" ";	
		
		System.out.print("enter the value of a:" + a);
		int a1 = sc.nextInt();
		System.out.print("enter the value of b:" + b);
		int b1 = sc.nextInt();
		
		int c=a1+b1;
		
		System.out.println("result: " +c);
	}
}
