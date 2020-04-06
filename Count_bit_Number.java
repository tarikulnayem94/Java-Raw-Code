package practice_1;
import java.util.Scanner;
public class Count_bit_Number {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("plesae enter your int number : " );
		int integer = sc.nextInt();
		
	//	System.out.println("Result : " + Integer.toBinaryString(integer));
		
		int count = 0;
		while (integer>0 ) 
		{
			count ++;
	    	integer = integer >> 1;
		}
		System.out.println("bits no : " + count);

	}
}
