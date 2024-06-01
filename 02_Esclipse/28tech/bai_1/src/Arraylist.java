import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Arraylist {
	static Scanner sc = new Scanner(System.in);

	public static void ex() {
		ArrayList<Integer> arr = new ArrayList();
		arr.add(1);
		arr.add(3);
		System.out.println(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));// arr[i]
		}
		for (int x : arr) {
			System.out.println(x + " ");
		}
	}

	public static void ex1() {
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			arr.add(tmp);
		}
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		System.out.println(arr.contains(2));// O(n)
		arr.set(2, 100);
		for (int i = 0; i < n; i++) {
			System.out.println(arr.get(i));
		}
	}

	public static void ex2() {
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			arr.add(tmp);
		}
		arr.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		Collections.sort(arr, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
//				if (o1 < o2)
//					return -1;
//				return 1;
			}
		});
		arr.forEach((i) -> System.out.print(i + " "));
	}

	public static void main(str[] args) {
//		ex();
//		ex1();
		ex2();
	}
}
