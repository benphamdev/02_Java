package sep20ex2;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println();
		MayAnh_Kts ma1 = new MayAnh_Kts(3.4, "Sony", "Red", "1/1/2023", "may anh 1", "1.px", "2", "sensor1");
		ma1.inThongTin();
		ma1.cachSuDungWifi();
		System.out.println();
		MayAnh_Co ma2 = new MayAnh_Co(3.3, "oppo", "blue", "1/2/2022", "oppo1");
		ma2.inThongTin();
		System.out.println();
		MayAnh_BanChuyen ma3 = new MayAnh_BanChuyen(3.3, "samsung", "black", "2/2/2021", "sumsung1", "2.px", "3",
				"sensor2", loaiOngKinh.ONGKINH18_105);
		ma3.inThongTin();
		System.out.println();
		MayAnh_ChuyenNghiep ma4 = new MayAnh_ChuyenNghiep(4.3, "lenovo", "green", "1/2/2020", "lenovo2", "5.px", "4.2",
				"senson5", loaiOngKinh.ONGKINH18_55, TocDoChupLienTuc._3KhungHinh1Giay);
		ma4.inThongTin();
		ma4.cachSuDungGps();
		ma4.dacTinhKyThuatMay();
	}
}
