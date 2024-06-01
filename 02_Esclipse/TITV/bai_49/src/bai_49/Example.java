package bai_49;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s;
		System.out.println("nhap vao chuoi : ");
		s = sc.nextLine();

//		1. phuong thuc kiem tra

//		System.out.println(s);
		// length
		System.out.println(s.length());

		// charAt
		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));
		}

		// ít dùng
//		getChars
		char c[] = new char[15];
		s.getChars(0, 1, c, 2);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

//		getBytes : co 3 cach lay gia tri cua cac ky tu
		byte b[] = s.getBytes();
		for (byte d : b) {
			System.out.println(d);
		}
	}
}
