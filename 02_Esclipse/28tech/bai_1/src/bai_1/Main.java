package bai_1;

import java.util.Scanner;

public class Main {
	static void ex() {
		int a = 100;
		long b = 12121212121212L;
		float c = 3.14F;
		double d = 23.23231312321D;
		boolean check = true;
		System.out.println(a);
		System.out.print(b + "\n");
		System.out.printf("gia tri cua c va d la : %.1f %.3f\n", c, d);
	}

	static void ex1() {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch);
		int x = sc.nextInt(), y = sc.nextInt();
		System.out.println(x + " " + y);
	}

	static void ex2() {
		int a = 5;
		int b = 2;
		float c = (float) a / b;
		System.out.printf("%.2f", c);
	}

	static void ex3() {
//		abs
//		sqrt : return double
//		pow : return doulble
//		min, max
//		ceil, floor, round

		System.out.println(Math.sqrt(25));
		System.out.println(Math.PI);
		float a = 2.67F;
		System.out.println((int) Math.ceil(a));
		System.out.println((int) Math.floor(a));
		System.out.println((int) Math.round(a));
	}

	public static void main(String[] args) {
//		ex();
//		ex1();
//		ex2();
		ex3();
	}
}
