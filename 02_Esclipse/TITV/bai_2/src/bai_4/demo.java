package bai_4;

import java.util.Scanner;
import static java.lang.Math.*;

public class demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a = ");
		int a = sc.nextInt();
		int b = sc.nextInt();

//		toan tu 3 ngoi
//		String res = (a % 2 == 0) ? "even" : "odd";
//		System.out.println(a + " la so " + res);

//import class math in java

		System.out.println("|a| = " + abs(a));
		System.out.println("max (a, b) = " + max(a, b));
		System.out.println("ceil a = " + ceil(a));
		System.out.println("floor a = " + floor(a));
		System.out.println("sqrt a = " + sqrt(a));
		System.out.println("pow (a, b)" + pow(a, b));
		sc.close();
	}
}
