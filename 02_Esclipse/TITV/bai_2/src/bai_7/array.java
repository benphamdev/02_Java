package bai_7;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[];
		int[] a1;
		a1 = new int[]{1, 2, 3, 4, 5};
		a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		for (int j = 0; j < a1.length; j++) {
			System.out.println(a1[j]);
		}
	}
}
