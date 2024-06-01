package bai_53;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
//		primitive
		int[] a = { 1, 2, 3 };

		// copy mang
//		giu nguyen mang ban dau 
//		int a1[] = a;
//		a1[0] = 2;
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(a1));

//		int a2[] = a.clone();
//		a2[0] = 20;
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(a2));
//
		int a3[] = new int[a.length];
		System.arraycopy(a, 0, a3, 0, a.length);
		a3[0] = 200;
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a));
	}
}
