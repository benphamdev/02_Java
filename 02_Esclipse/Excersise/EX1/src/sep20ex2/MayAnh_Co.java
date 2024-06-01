package sep20ex2;

public class MayAnh_Co extends MayAnh {

	public MayAnh_Co(double canNang, String hangSx, String mauSac, String ngaySX, String tenMay) {
		super(canNang, hangSx, mauSac, ngaySX, tenMay);
	}

	public void dacTinhKyThuatMay() {
		System.out.println("dac tinh ky thuat may co");
	}

	public void inThongTin() {
		System.out.println("may co");
		super.inThongTin();
	}
}
