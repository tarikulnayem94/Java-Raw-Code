package com.Practice;

public class Use_Own_Method {

	public static void main(String[] args) 
	{
		double x = 12;
		double y = 13;
		System.out.println("result : "+ addition(x, y));
	}

	static public double addition (double first_Number, double second_Number)
	{
		double result = first_Number+second_Number;
		return result;
	}
}
