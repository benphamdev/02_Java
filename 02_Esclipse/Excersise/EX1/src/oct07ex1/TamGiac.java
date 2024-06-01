package oct07ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TamGiac extends DaGiac {
	public static Scanner sc = new Scanner(System.in);

	static boolean valid(double a, double b, double c) {
		if (a + b <= c || b + c <= a || c + a <= b) {
			return false;
		}
		return true;
	}

	public TamGiac(int n) {
		super(3);
		boolean f = false;
		do {
			do {
				f = false;
				try {
					for (int i = 0; i <= 2; i++) {
						System.out.println("nhap canh thu " + (i + 1));
						this.cdCanh[i] = sc.nextDouble();
						if (cdCanh[i] <= 0) {
							throw new NhapSoCanhDuong("nhap canh >= 0");
						}
					}
				} catch (InputMismatchException ex) {
					System.out.println("Loi : " + ex.getMessage());
					sc.nextLine();
					f = true;
				} catch (NhapSoCanhDuong ex) {
					System.out.println("Loi : " + ex.getMessage());
					f = true;
				}
			} while (f);
			try {
				if (!valid(this.cdCanh[0], this.cdCanh[1], this.cdCanh[2])) {
					throw new invalid("nhap sai cd canh tam giac");
				}
			} catch (invalid ex) {
				System.out.println("Loi : " + ex.getMessage());
				sc.nextLine();
				f = true;
			}
		} while (f);
	}

	@Override
	public double tinhChuVi() {
		double sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += this.cdCanh[i];
		}
		return sum;
	}

	@Override
	public double tinhDienTich() {
		double a = this.cdCanh[0], b = this.cdCanh[1], c = this.cdCanh[2];
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

	public void infor() {
		super.infor();
		System.out.println("chieu dai tam giac " + cdCanh[0] + " " + cdCanh[1] + " " + cdCanh[2]);

	}
}
