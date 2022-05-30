package com.Practice;

public class Fibonacci_number {

	public static void main(String[] args) 
	{
		int A=0, B=1, C=0;
		System.out.print(A+", "+B);

		for( int i=2; i<6; i++ )
		{
		C=A+B;
		System.out.print( ", "+C);
		A=B;  B=C;
		}
	}
	
}






