package practice_1;
import java.util.Scanner;
public class Press_Lucky_Number {

	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your lucky Number : ");
		int number = myScanner.nextInt();
		
		switch (number) 
		{
		case 3:
			System.out.println("you are fermar !");
			break;
        case 5:
			System.out.println("you are a doctor !");
			break;
        case 7:
        	System.out.println("you are a programmer ! ");
	        break;
		default:
			System.out.println("you are a alien !");
			break;
		}
	}

}
