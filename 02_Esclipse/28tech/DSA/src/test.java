
public class test {
	static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int l = 0, r = i - 1, val = a[i];
			while (l < r) {
				int m = (l + r) / 2;
				if (a[m] < val) {
					l = m + 1;
				} else {
					r = m - 1;
				}
			}
			for (int j = i - 1; j >= l; j--) {
				a[j + 1] = a[j];
			}
			a[l] = val;
		}
	}

	public static void main(String[] args) {

	}
}
