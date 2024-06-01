package bai_6;

import java.util.Iterator;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		vong for
//		for (int i = 0; i < 200; i++) {
//			System.out.println("em hua chep phat !");
//		}

		int n;
//		vong while
//		while(n != 0) {
//			System.out.println("nhap x = 0 de thoat");
//			n = sc.nextInt();
//		}

//		vong do while
		do {
			System.out.println("nhap n > 0");
			n = sc.nextInt();
		} while (n <= 0);
	}
}
