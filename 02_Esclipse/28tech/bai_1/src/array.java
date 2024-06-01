import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class array {
	// không được truy cập chỉ số ngoài mảng
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int[] a = new int[n];// reference variable
	static Integer[] A = new Integer[n];
	static int[] cnt = new int[1000001];

//	int n; // primitive
//	Integer n; // Wrapper dùng đc sort comparator

	public static void ex() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void ex1() {
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			cnt[a[i]] = 1;
		}
		int ans = 0;
		for (int i = 0; i <= 1000000; i++) {
			if (cnt[i] == 1)
				ans++;
		}
		System.out.println(ans);
	}

	public static void ex2() {
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
//		Arrays.sort(a);// timSort : mergeSort : stable
		Arrays.sort(a, 2, 5);// [2 => 4]
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static int sumDigit(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void ex3() {
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
//		Arrays.sort(A, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
////				tra ve 1 hoac -1 (1 so am hoac 1 so duong)
//				// neu o1 xuat hien truoc o2 theo thu tu sap xep => tra ve -1
//				// neu o1 xuat hien sau o2 theo thu tu sap xep => tra ve 1
//				if (Math.abs(o1) > Math.abs(o2)) {
//					return -1;
//				} else {
//					return 1;
//				}
//			}
//		});
		Arrays.sort(A, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (sumDigit(o1) != sumDigit(o2)) {
					if (sumDigit(o1) > sumDigit(o2))
						return -1;
					return 1;
				} else {
					if (o1 < o2)
						return -1;
					return 1;
				}
			}

		});
		for (int x : A)
			System.out.print(x + " ");
	}

	public static void main(str[] args) {
//		ex();
//		ex1();
//		ex2();
		ex3();
	}
}
