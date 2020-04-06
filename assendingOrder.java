package practice_1;
public class assendingOrder {

	public static void main(String[] args) 	
	{
		int temp;
		int values [] = { 5, 6, 19, 2, 50};	
		for (int i = 0; i < values.length; i++) 
		{
			for (int j = i+1; j < values.length; j++) 
			{
				if ( values[i] < values[j] )
				{
					temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
		}
		for (int i = 0; i < values.length; i++) 
		{
			System.out.println(values[i]);
		}
	}
}
