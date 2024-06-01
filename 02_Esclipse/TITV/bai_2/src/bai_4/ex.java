package bai_4;

import java.util.Scanner;
import static java.lang.Math.*;
public class ex {
	public static void main(String[] args) {
		double r, s, p;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ban kinh r = ");
		r = sc.nextDouble();
		s = r * r * PI;
		p = 2 * PI * r;
		System.out.println("s = " + round(s * 100.0 ) / 100.0);
		System.out.println("p = " + round(p * 100.0 ) / 100.0);
		sc.close();
	}
}
