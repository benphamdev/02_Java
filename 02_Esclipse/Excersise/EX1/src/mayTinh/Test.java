package mayTinh;

public class Test {
	public static void main(String[] args) {
		LoaiViTinh loaiViTinh = new LoaiViTinh(4.5, "22", "dell", 3.4, "ee", "22");
		loaiViTinh.inThongTin();

		ManHinh hinh = new ManHinh(4.5, "mh", "kk", 4, 3, "OLED");
		hinh.tinhNang();

		MayIn in = new MayIn(4.5, "may in", "may in ", "yes", "2D", 3);
		in.luongBuiCongNghiep();
	}
}
