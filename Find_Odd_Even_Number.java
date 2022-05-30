package com.Practice;

public class Find_Odd_Even_Number {

	public static void main(String[] args) 
	{
		int values[] = {1, 21, 58, 36, 8, 11, 20};
		
		int countEvenNumber = 0;
		int countOddNumber = 0;

		for (int i = 0; i < values.length; i++) {
			if (values [i] % 2 == 0) {
				countEvenNumber++;
				System.out.print(values[i] + ", ");
			}
			else{
				countOddNumber++;
			}
		}
		System.out.println( "\neven number : " + countEvenNumber);
		System.out.println( "odd number : " + countOddNumber);
	}

}
