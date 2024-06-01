package sep16bt1;

import java.util.Scanner;

public class HinhChuNhat extends DaGiac {
	public static Scanner sc = new Scanner(System.in);

	public HinhChuNhat(int n) {
		super(2);
		for (int i = 0; i <= 1; i++) {
			System.out.println("nhap chieu dai canh : ");
			cdCanh[i] = sc.nextDouble();
		}
	}

	public double tinhChuVi() {
		return (cdCanh[0] + cdCanh[1]) * 2.0;
	}

	public double tinhDienTich() {
		return this.cdCanh[0] * this.cdCanh[1];
	}

	public void infor() {
		super.infor();
		System.out.println("chieu dai hinh cn " + cdCanh[0] + " " + cdCanh[1]);

	}
}
