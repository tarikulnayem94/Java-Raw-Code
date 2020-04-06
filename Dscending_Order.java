package practice_1;

public class Dscending_Order {

	public static void main(String[] args) 
	{
		int i, j, temp;
		int values [] = {5, 10, 15, 20, 30};
		
		for (i = 0; i < values.length; i++) 
		{
			for (j = i+1; j < values.length; j++) 
			{
				if (values[i] < values[j]) 
				{
					temp = values[j];
					values[j] = values [i];
					temp = values[i];				
				}
			}
			
		}
		for (i = 0; i < values.length; i++) 
		{
		
			System.out.println("des_order : " + values[i]);
		}
	}

}
