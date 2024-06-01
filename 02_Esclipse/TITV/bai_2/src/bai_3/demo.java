package bai_3;

import java.util.Scanner;

// giong c++

public class demo {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a = ");
		a = sc.nextInt();
		System.out.println("nhap b = ");
		b = sc.nextInt();
		int sum = a + b;
		System.out.println(a + "+" + b + "=" + sum);
		
		int dif = a - b;
		System.out.println(a + "-" + b + "=" + dif);
		
		int q = a / b;
		System.out.println(a + "/" + b + "=" + q);
		
		int r = a % b;
//		System.out.println("gia tri : " + (-r));
//		System.out.println("gia tri : " + (+r));
//		(-r); Error
		r--;
		System.out.println(a + "%" + b + "=" + r);
		
		int mul = a * b;
		mul++;
		System.out.println(a + "*" + b + "=" + mul);
		
		sc.close();
	}
}
