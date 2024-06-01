package bai_5;

import java.util.Scanner;
import static java.lang.Math.*;

public class quadratic_equations {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int delta = b * b - 4 * a * c;

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("phuong trinh vo so nghiem");
				} else {
					System.out.println("phuong trinh vo nghiem");
				}
			} else {
				System.out.println("nghiem duy nhat = " + (-1) * c / b);
			}
		} else {
			if (delta > 0) {
				System.out.println("phuong trinh co 2 nghiem phan biet : x1 = " + ((-1) * b + sqrt(delta)) / (2 * a)
						+ "x2 = " + ((-1) * b - sqrt(delta)) / (2 * a));
			} else if (delta == 0) {
				System.out.println("phuong trinh co nghiem kep x1 = x2 = " + (-1) * b / (2 * a));
			} else {
				System.out.println("phuong trinh vo nghiem");
			}
		}
		sc.close();
	}
}
