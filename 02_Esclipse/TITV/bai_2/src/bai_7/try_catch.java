package bai_7;

import java.util.Scanner;

public class try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		try {
			System.out.println("nhap n = ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("error!");
		} finally {
			System.out.println("finnaly");
		}
		System.out.println("n = " + n);
		System.out.println("ket thuc chuong trinh");
	}
}
