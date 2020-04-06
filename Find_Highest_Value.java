package practice_1;

public class Find_Highest_Value {
	public static void main(String[] args) {

		int values [] = { 5, 10, 92, 56, 1 };
		int MAX = values[0];
		for (int i = 0; i < values.length; i++) {

			if (values[i] > MAX) 
			{
				MAX = values[i];
			} 
		}
		System.out.println("max value : " + MAX);
	}
}
