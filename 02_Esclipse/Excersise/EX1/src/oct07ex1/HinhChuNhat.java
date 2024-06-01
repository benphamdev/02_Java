package oct07ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HinhChuNhat extends DaGiac {
	public static Scanner sc = new Scanner(System.in);

	public HinhChuNhat(int n) {
		super(2);
		boolean f = true;
		do {
			try {
				System.out.println("nhap chieu dai canh : ");
				cdCanh[0] = sc.nextDouble();
				if (cdCanh[0] <= 0) {
					throw new NhapSoCanhDuong("nhap chieu dai > 0 !!");
				}

			} catch (InputMismatchException ex) {
				System.out.println("Loi : " + ex.getMessage());
				f = false;
			} catch (NhapSoCanhDuong ex) {
				System.out.println("Loi : " + ex.getMessage());
				f = false;
			}
		} while (!f);
		f = true;
		do {
			try {
				System.out.println("nhap chieu dai canh : ");
				cdCanh[1] = sc.nextDouble();
				if (cdCanh[1] <= 0) {
					throw new NhapSoCanhDuong("nhap chieu dai > 0 !!");
				}

			} catch (InputMismatchException ex) {
				System.out.println("Loi : " + ex.getMessage());
				f = false;
			} catch (NhapSoCanhDuong ex) {
				System.out.println("Loi : " + ex.getMessage());
				f = false;
			}
		} while (!f);
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
