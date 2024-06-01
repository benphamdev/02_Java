package bai_5;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n % 2 == 1) {
			System.out.println("n la so le");
		} else {
			System.out.println("n la so chan");
		}
		sc.close();
	}
}
