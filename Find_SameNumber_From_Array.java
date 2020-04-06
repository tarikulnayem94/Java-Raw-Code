package practice_1;
public class Find_SameNumber_From_Array {

	public static void main(String[] args)
	{ 
		int values [] = {10, 15, 20, 10, 5, 5, 10, 5, 10, 15, 20, 10, 
				 10, 15, 20, 10, 5, 5, 10, 5, 5, 5, 10, 5, 10};	
		int dulicateCount = 0 ;

		for (int i = 0; i < values.length; i++) 
		{
			if ( values [i] == 5) 
			{
				dulicateCount ++;
			} 
		}
		System.out.println("total no. of 5 : " + dulicateCount);
	}
}
