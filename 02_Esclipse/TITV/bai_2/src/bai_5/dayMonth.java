package bai_5;

import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class dayMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt(), year = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 7:
		case 8:
		case 12:
			System.out.println("co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 10:
		case 11:
			System.out.println("co 30 ngay");
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("co 29 ngay");
			} else {
				System.out.println("co 28 ngay");
			}
			break;
		default:
			System.out.println("nhap du lieu sai");
		}
		sc.close();
	}
}
