package bai_7;

public class throwKeyWord {

	public static double divide(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Divider cannot be equal to zero!");
		}
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println(divide(3.5, 0.0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
