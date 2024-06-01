package bai_6;

import java.util.Scanner;

public class convertBin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String ans = "";
		while(n > 0) {
			ans += n % 2;
			n /= 2;
		}
		System.out.println(ans);
	}
}
