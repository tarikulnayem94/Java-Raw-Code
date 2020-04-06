package com.Practice;
import java.util.Scanner;
public class andOrFunction {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String myName = sc.nextLine();
		
		if (myName.length()>7 || myName.length()<12) {
			prln("your name is too ok");
		}	
//		else if(myName.length()>4 || myName.length()<7){
//			prln("your name is short");
//		}
		else {
			prln("your name is too long");
		}
	}
	static void prln(Object myObject){
		System.out.println(myObject);
	}
}

