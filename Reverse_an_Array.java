package practice_1;
public class Reverse_an_Array {

	public static void main(String[] args) {
		
		int validData[] = {10, 5, 10, 5, 5};
		
		for(int i=validData.length-1; i>=0; i--)
		{
			 System.out.print( validData[i] + ", ");
        }
	}

}
