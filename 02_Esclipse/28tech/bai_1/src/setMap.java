import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class setMap {
	static Scanner sc = new Scanner(System.in);

	public static boolean binerySearch(int[] a, int n, int x) {
		int l = 0, r = n - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (a[mid] == x) {
				return true;
			} else if (a[mid] < x) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}

	private static void ex() {
		int n = sc.nextInt(), x = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
//		System.out.println(binerySearch(a, n, x));
		if (Arrays.binarySearch(a, x) >= 0)
			System.out.println("YES");
		else
			System.out.println("NO");
//		Collections.binarySearch(null, null)
	}

	public static void ex1() {
		HashSet<Integer> set = new HashSet<>();
		set.add(400);
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		for (int x : set) {
			System.out.println(x);
		}
		if (set.contains(500))// (O(1))
			set.remove(500);// aborted called, segmentation fault, runtime error
	}

	public static void ex2() {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(400);
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		for (int x : set) {
			System.out.println(x);
		}
		if (set.contains(500))// (O(1))
			set.remove(500);// aborted called, segmentation fault, runtime error
	}

	public static void ex3() {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(400);
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		for (int x : set) {
			System.out.println(x);
		}
		if (set.contains(500))// (O(1))
			set.remove(500);// aborted called, segmentation fault, runtime error
	}

	public static void ex4() {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(4, 6);
		map.put(2, 3);
		System.out.println(map.size());
		System.out.println(map.get(2));
		if (map.containsKey(3)) {
			System.out.println("FOUND");
		} else
			System.out.println("NOT FOUND");
		map.replace(2, 5);
	}

	public static void ex5() {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(4, 6);
		map.put(2, 3);
		// Entry
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void ex6() {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(2, 3);
		map.put(4, 6);
		map.put(2, 3);
		map.put(1, 5);
		// Entry
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			arr.add(entry);
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
		}
	}

	public static void main(str[] args) {
//		ex();
//		ex1();
//		ex2();
//		ex3();
//		ex4();
//		ex5();
		ex6();
	}
}
