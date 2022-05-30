package com.Practice;
public class Dscending_Order {
	public static void main(String[] args) 
	{
		int i, j, temp;
		int values [] = {5, 10, 9, 15, 20, 30};
		
		for (i = 0; i < values.length; i++) 
		{
			for (j = i+1; j < values.length; j++) 
			{
				if (values[i] < values[j]) 
				{
					temp = values[i];                //  temp = 5
					values[i] = values [j];          //  values[i] = 10
					values[j] = temp;		         // values[j] = 5
				}
			}		
		}
		System.out.print("des_order : ");
		
		for (i = 0; i < values.length; i++) 
		{	
			System.out.print(+ values[i] + ", ");
		}
	}
}
