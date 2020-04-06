package practice_1;
public class FindSameNumberFromArray {

	public static void main(String[] args) {

		int[] values = {10, 15, 20, 10, 5, 5, 10, 5,10, 15, 20, 10, 
		 10, 15, 20, 10, 5, 5, 10, 5,5, 5, 10, 5, 10, 15, 20,
		 10, 5, 5, 10, 5};
		
		int dupCount = 0;
		
		for (int i =0; i<values.length; i++ )
		{
			if (values[i] == 10) 
			{			
				dupCount++;
			}
		}
		System.out.println("total number of --> 10 : [ "+ dupCount +" ]  ta");

		
	}

}
