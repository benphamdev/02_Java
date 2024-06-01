package sep16bt1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			if (n == 1) {
				HinhVuong hv = new HinhVuong(1);
				System.out.println(hv.tinhChuVi());
				System.out.println(hv.tinhDienTich());
				hv.infor();
			} else if (n == 2) {
				HinhChuNhat hcv = new HinhChuNhat(2);
				System.out.println(hcv.tinhChuVi());
				System.out.println(hcv.tinhDienTich());
				hcv.infor();
			} else {
				TamGiac tg = new TamGiac(3);
				System.out.println(tg.tinhChuVi());
				System.out.println(tg.tinhDienTich());
				tg.infor();
			}
		}
	}
}
