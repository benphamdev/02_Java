package sep16bt1;

import java.util.Scanner;

public class HinhVuong extends DaGiac {
	public static Scanner sc = new Scanner(System.in);

	public HinhVuong(int n) {
		super(1);
		cdCanh[0] = sc.nextDouble();
	}

	@Override
	public double tinhChuVi() {
		return cdCanh[0] * 4;
	}

	@Override
	public double tinhDienTich() {
		return this.cdCanh[0] * this.cdCanh[0];
	}

	public void infor() {
		super.infor();
		System.out.println("chieu dai hinh vuong " + cdCanh[0]);
	}

}
