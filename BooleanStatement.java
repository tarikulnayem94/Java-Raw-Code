package com.Practice;
public class BooleanStatement 
{
	public static void main(String[] args) 
	{
		int firstValue = 50;
		int secondValue = 40;
	
		boolean statement = (5) != 5;
		
		System.out.println(statement);
		System.out.println(Addition(firstValue, secondValue));
	}	
	static public int Addition(int firstValue, int secondValue) 
	{
		int answer = firstValue+secondValue;
		return answer;
	}
	
}


