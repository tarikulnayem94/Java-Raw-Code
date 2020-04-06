package practice_1;
import java.util.Scanner;

public class Integer_to_Binary {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		String binary = "";
		
		System.out.print("enter your integer NO : ");
		int integer = sc.nextInt();
		
		while (integer>0)
		{
			int output = integer % 2;
			binary = output + binary;
			integer = integer / 2 ;
		}
		System.out.println("binarry number : " + binary);
		System.out.println("binary length : " +binary.length());
	}
}
