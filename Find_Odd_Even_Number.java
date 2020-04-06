package practice_1;
public class Find_Odd_Even_Number {

	public static void main(String[] args) 
	{
		int values [] = {10, 15, 1, 2, 2, 3, 5, 9, };
		
		int CountOddNumber = 0 ;
		int CountEvenNumber = 0 ;

		for (int i = 0; i < values.length; i++) 
		{
			if (values [i] % 2 ==0) 
			{
				CountEvenNumber ++ ;
			}
			else 
			{
				CountOddNumber ++;
			}
		}
		System.out.println( "even number : " + CountEvenNumber);
		System.out.println( "odd number : " + CountOddNumber);

	}

}
