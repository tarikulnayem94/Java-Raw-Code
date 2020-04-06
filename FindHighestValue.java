package practice_1;

public class FindHighestValue {

	public static void main(String[] args) 
	{
		int values [] = {5, 10, 15, 50, 95};
		
		int max = values [0];
		
		for (int i=0; i<values.length; i++) 
		{
			if (values[i] > max) 
			{
				max = values[i];
			}
		}
		System.out.println("max value : " +max);
	}

}
