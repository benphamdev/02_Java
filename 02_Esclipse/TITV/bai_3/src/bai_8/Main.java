package bai_8;

public class Main {
	public static void main(String[] args) {
		myDate md = new myDate(2, 9, 2023);
		myDate md1 = new myDate(2, 9, 2023);

//		md.printDate();
//		md.setDay(21);
//		System.out.println("day = " + md.getDay());
//		System.out.println(md);

		if (md.equals(md1)) {
			System.out.println("md == md1");
		} else {
			System.out.println("md != md1");
		}

//		System.out.println("hashCode : " + md.hashCode());
	}
}
