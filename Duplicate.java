package practice_1;
public class Duplicate {

	public static void main(String[] args)
	{ 
		int values [] = {10, 5, 10, 5, 5, 10};
		int dulicateCount = 0 ;
		
		for (int i = 0; i < values.length; i++) 
		{
			for (int j = i+1; j < values.length; j++) 
			{
				if ( values[i] == values[j]) 
				{
					dulicateCount ++;
				} 
			}
		}
		System.out.println(dulicateCount);
	}

	
}
