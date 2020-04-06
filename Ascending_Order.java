package practice_1;
public class Ascending_Order {

	public static void main(String[] args)
	{
		int i, j, temp;
		int values [] = {5, 10, 15, 2, 95};
		
		for (i = 0; i < values.length ; i++) 
		{
		      for (j = i+1; j < values.length ; j++) 
		      {
		        if (values[i] > values[j]) 
		        {
		           temp = values[i];
		           values[i] = values[j];
		           values[j] = temp;
		        }
		      }      
		}
		      for (i = 0; i < values.length ; i++)   	  
		      {
			  System.out.println(values[i]);
		      }
    }
}
