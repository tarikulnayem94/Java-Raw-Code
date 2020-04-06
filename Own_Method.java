package practice_1;

public class Own_Method {

	public static void main(String[] args) {

		double a = 10;
		double b = 5;
		System.out.println("result : " + method(a, b));
	}

	static public double method(double firstValue, double secondValue) {
		double result = firstValue + secondValue;
		return result;
	}
}
