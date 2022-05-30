package com.Practice;
import java.util.Scanner;

public class Check_Prime_Number {

	   static Scanner sC = new Scanner(System.in);
	   public static void main(String[] args) {  
	         
	       System.out.print("Enter a number : ");  
	       int number = sC.nextInt();  
	       
	       boolean isPrime = true;
	       for (int i = 2; i<=number/2; i++) 
	       {
	    	   if (number % i == 0) 
	    	   {
	    	      isPrime=false;
	    	      break;
	    	   }
	       }
	       if (isPrime) 
	       {
			   System.out.println("Prime Number");
		   }
	       else {
			System.out.println("not prime");
		}
	       
	   }    
}






