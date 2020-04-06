package com.Practice;
import java.util.Scanner;
public class ifElseStatement {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String myName = sc.nextLine();
		
		if (myName.length()>10) {
			prln("your name is too long");
		}	
		else if(myName.length()<=7){
			prln("your name is short");
		}
		else {
			prln("your name is ok");
		}
	}
	static void prln(Object myObject){
		System.out.println(myObject);
	}
}
