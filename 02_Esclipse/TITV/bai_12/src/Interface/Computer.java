package Interface;

public class Computer implements CacultorInterface, SortInterface {

	@Override
	public void sortAscending(int[] arr) {
		int n = arr.length;
		int i, j, key;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public void sortDecending(int[] arr) {
		int n = arr.length;
		int i, j, key;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public double addition(double a, double b) {
		return a + b;
	}

	@Override
	public double subtraction(double a, double b) {
		return a - b;
	}

	@Override
	public double mutiplication(double a, double b) {
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero!");
		}
		return a / b;
	}
}
