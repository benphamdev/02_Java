import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class str {
	static Scanner sc = new Scanner(System.in);

	public static String convert(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			res += Character.toLowerCase(s.charAt(i));
		}
		return res;
	}

	public static void ex() {
//		int n = sc.nextInt();
//		sc.nextLine();
		String s = sc.nextLine();
//		for(char x : s.toCharArray()) {
//			System.out.println(x);
//		}
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));
//		}
//		s = s.toUpperCase();
//		System.out.println(s);
		if (s.compareTo("Java") == 0) {
			System.out.println("YES");
		}
		if (s.equals("Java")) {
			System.out.println("YES");
		}
//		if (s == "Java") {// so sanh 2 doi tuong
//			System.out.println("YES");
//		}
	}

	public static void ex1() {
		String s = "java   28tech.spkt";
		s = s.replace('.', ' ');
		s = s.replace('j', '@');
		String[] a = s.split("\\s++");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void ex2() {
		String s = "java 28tech java 28tech";
		StringTokenizer st = new StringTokenizer(s);
		ArrayList<String> arr = new ArrayList<>();
		while (st.hasMoreElements()) {
			arr.add(st.nextToken());
		}
		HashSet<String> set = new HashSet<>();
		for (String x : arr) {
			set.add(x);
		}
		System.out.println(set.size());
	}

	public static void ex3() {
		String s = "pham duy chien";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
	}

	public static void ex4() {
		int n = 121313;
		String s = "" + n;
		System.out.println(s);
		String t = "4232";
		System.out.println(Integer.parseInt(s));
		BigInteger b = new BigInteger("232323");
		System.out.println(b);
	}

	public static void main(String[] args) {
//		ex();
//		ex1();
//		ex2();
//		ex3();
		ex4();
	}
}
