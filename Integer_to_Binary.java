package com.Practice;

import java.util.Scanner;

public class Integer_to_Binary {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
        String binary = " ";
		
		System.out.print("enter your integer NO : ");
		int integer = sc.nextInt();
		
		while (integer>0)
		{
			int output = integer % 2;     //     7/2=1, 3/2=1
			binary = output + binary;       //   111
			integer = integer / 2 ;           // 7/2 = 3
		}
		System.out.println("binarry number : " + binary);
		System.out.println("binary length : " +binary.length());

	}

}
