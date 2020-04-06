package practice_1;
import java.util.Scanner;

public class Reverse_integer_number {
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {

		int inputNumber, reverseNumber = 0 ;
		System.out.print("Enter your integer number : ");
		inputNumber = myScanner.nextInt();
		
		while(inputNumber != 0)
	      {
	          reverseNumber = reverseNumber * 10;
	          reverseNumber = reverseNumber + inputNumber % 10;
	          inputNumber = inputNumber/10;
	      }    
	      System.out.println("Reverse of the number is : " + reverseNumber);
	}
}
