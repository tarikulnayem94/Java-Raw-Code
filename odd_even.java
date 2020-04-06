package practice_1;
public class odd_even {

	public static void main(String[] args) {

		int[] values = {10, 15, 20, 30, 2, 5, 6};
		int CountOdd = 0;
		int countEven = 0;
		
		for(int i=0;i<values.length;i++)
		{ 
		if (values[i] % 2 == 0) {
			//System.out.println(values[i]+ ": it's even number");
			countEven++;
		}
		else {
			//System.out.println(values[i]+ ": it's odd number");
			CountOdd++;
		}
		
		}
		System.out.println("even number : " + countEven);
		System.out.println("odd number : " + CountOdd);
		
		
		/*
		System.out.println("Odd Numbers:");  
		for(int j=0;j<values.length;j++){  
		if(values[j]%2!=0){  
		System.out.println(values[j]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int j=0;j<values.length;j++){  
		if(values[j]%2==0){  
		System.out.println(values[j]);  
		}  
		}  
		*/
		
		
	}

}
