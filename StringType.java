package com.Practice;
public class StringType {

	public static void main(String[] args) 
	{
		String myName;	
		myName = "Tarikul   Nayem";

		Object myObject = null;
		prln("my name is ::: " + myName);
		prln("my name length is ::: " +myName.length());
	}
	static void pl(Object myObject){
		System.out.print(myObject);
	}
	static void prln(Object myObject){
		System.out.println(myObject);
	}
}
