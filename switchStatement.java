package com.Practice;
import java.util.Scanner;
public class switchStatement {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String myName = sc.nextLine();

		switch (myName.length()) {
		case 7:
			prln("you are so lucky");
			break;
		case 10:
			prln("you are legend");
			break;
		case 13:
			prln("you are so unlucky");
			break;
		case 9:
			prln("you are so xmp");
			break;
		default:
			prln("you are so poor");
			break;
		}
	}
	static void prln(Object myObject) {
		System.out.println(myObject);
	}
}
