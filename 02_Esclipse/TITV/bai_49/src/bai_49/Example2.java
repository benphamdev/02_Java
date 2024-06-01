package bai_49;

public class Example2 {
	public static void main(String[] args) {
//	2. phuong thuc so sanh 

		String s1 = "pham duy chien";
		String s2 = "pham Duy chien";

//		equals
		System.out.println(s1.equals(s2));

//		equalsIgnoreCase	
		System.out.println(s1.equalsIgnoreCase(s2));

//		compareTo 
		System.out.println(s1.compareTo(s2));

//		compareToIgnoreCase
		System.out.println(s1.compareToIgnoreCase(s2));

//		ít dùng 
//		regionMatches
		boolean check = s1.regionMatches(7, s2, 7, 4);
		System.out.println(check);

//		startWith

		String phone = "0582122";
		System.out.println(phone.startsWith("058"));
		System.out.println(phone.startsWith("052"));

//		endWith

		String file = "input.txt";
		if (file.endsWith("txt")) {
			System.out.println("van ban");
		}
	}
}
