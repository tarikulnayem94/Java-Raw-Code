package com.Practice;

public class Highest_Value {

	public static void main(String[] args) 
	{
		int values [] = {1, 21, 58, 36, 8};
		int max_value = values [0];
		
		for (int i = 0; i < values.length; i++) 
		{
			if (values[i] > max_value) 
			{
				max_value = values[i];	
			}
		}
		System.out.println("max value : " + max_value);
	}
}
