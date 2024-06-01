package sep16bt1;

import java.util.Scanner;

public class TamGiac extends DaGiac {
	public static Scanner sc = new Scanner(System.in);

	public TamGiac(int n) {
		super(3);
		for (int i = 0; i <= 2; i++) {
			this.cdCanh[i] = sc.nextDouble();
		}
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
