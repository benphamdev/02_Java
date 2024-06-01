package example;

import java.util.Arrays;
import java.util.Collections;

public class Test {
	public static void reverse(int a[]) {
		int n = a.length - 1;
		for (int i = 0; i < a.length / 2; i++) {
			int tmp = a[n - i];
			a[n - i] = a[i];
			a[i] = tmp;
		}
	}

	public static void main(String[] args) {
		Integer a[] = new Integer[] { 1, 2, 3, 4, 5, 1 };
		int b[] = new int[15];

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 2));
		Arrays.fill(b, 1);
		System.out.println(Arrays.toString(b));
//https://www.geeksforgeeks.org/java-program-to-sort-the-array-elements-in-descending-order/
//		reverse(a);
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}
