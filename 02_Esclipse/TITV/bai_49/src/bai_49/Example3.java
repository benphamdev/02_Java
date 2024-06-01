package bai_49;

public class Example3 {
	public static void main(String[] args) {
		String s1 = "hello vietnam";
		String s2 = "hello";

//		ít dùng 
//		indexOf
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.indexOf(s2, 2));

		char c = 'o';
		System.out.println(s1.indexOf(c));
		System.out.println(s1.indexOf(c, 2));

//		lastIndexOf

		System.out.println(s1.lastIndexOf(s2));
	}

}
