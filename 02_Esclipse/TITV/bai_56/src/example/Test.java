package example;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String s = "pham duy, chien";
		String a[] = s.split(" ");
		System.out.println(Arrays.toString(a));
		String b[] = s.split(",");
		System.out.println(Arrays.toString(b));

		String s1 = "Xin chao, minh la ben. Minh la lap trinh vien";
		String c[] = s1.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
	}
}
