package practice_1;
import java.util.Scanner;
public class Boolean_Statement_Use {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("plesae enter your 1st value : ");
		int A = myScanner.nextInt();
		System.out.print("plesae enter your 2nd value : ");
		int B = myScanner.nextInt();
		
//		statement(A, B);
//		System.out.println(statement(A, B));

	}
	public static boolean statement(int firstIntNumber,int SecondIntNumber) 
	{
		boolean answare = firstIntNumber > SecondIntNumber;
		return answare;
	}

}
