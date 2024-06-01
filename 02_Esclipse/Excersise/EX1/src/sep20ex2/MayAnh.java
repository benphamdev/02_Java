package sep20ex2;

public abstract class MayAnh {
	private double canNang;
	private String hangSx, mauSac, ngaySX, tenMay;

	public MayAnh(double canNang, String hangSx, String mauSac, String ngaySX, String tenMay) {
		this.canNang = canNang;
		this.hangSx = hangSx;
		this.mauSac = mauSac;
		this.ngaySX = ngaySX;
		this.tenMay = tenMay;
	}

	public void dacTinhKyThuatMay() {
		System.out.println("dac tinh ky thuat may anh");
	}

	public void inThongTin() {
		System.out
				.println(this.canNang + " " + this.hangSx + " " + this.mauSac + " " + this.ngaySX + " " + this.tenMay);
	}
}
