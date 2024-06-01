package overloading;

public class MyMath {
	public int min(int a, int b) {
		return a < b ? a : b;
	}

	public double min(double a, double b) {
		return a < b ? a : b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public double sum(double[] arr) {
		double ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i];
		}
		return ans;
	}
}
