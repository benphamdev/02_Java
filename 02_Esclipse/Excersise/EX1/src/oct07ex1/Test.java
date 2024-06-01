package oct07ex1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TamGiac tg = new TamGiac(3);
		System.out.println(tg.tinhChuVi());
		System.out.println(tg.tinhDienTich());
		tg.infor();
	}
}
