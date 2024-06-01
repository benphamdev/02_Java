package bai_49;

public class Example4 {
	public static void main(String[] args) {
		String s1 = "pham duy chien";
		String s2 = "thai binh";

//		concat

		String s3 = s1 + s2, s4 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);

//		replace
		String s5 = "viet nam";
		String s6 = s5.replaceAll("viet", "Viet");
		System.out.println(s6);

//		toLowerCase, toUpperCase
		String s7 = s1.toLowerCase(), s8 = s1.toUpperCase();
		System.out.println(s7);
		System.out.println(s8);

//		trim
		String s9 = "   xin chao cac ban   ";
		System.out.println(s9.trim());

		// substring

		String s10 = s1.substring(0, 2);

		System.out.println(s10);
	}
}
