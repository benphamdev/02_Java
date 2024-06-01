package bai_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// dem chu so, tinh tong chu so, dem chu so chan, ...
		int cnt = 0;
		while (n != 0) {
			n /= 10;
			cnt++;
		}
		System.out.println(cnt);
	}
}
