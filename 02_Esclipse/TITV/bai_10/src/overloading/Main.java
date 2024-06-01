package overloading;

public class Main {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.min(2, 0));
		System.out.println(mm.min(6.5, 6.0));
		System.out.println(mm.sum(5.5, 6.0));
		double[] arr = new double[] { 1, 2, 3, 4, 5 };
		System.out.println(mm.sum(arr));
	}
}
