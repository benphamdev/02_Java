package mayTinh;

public abstract class SanPham implements IThanThienMoiTruong {

	private double giaSanPham;
	private String maSanPham, tenSanPham;

	public SanPham(double giaSanPham, String maSanPham, String tenSanPham) {
		this.giaSanPham = giaSanPham;
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
	}

	public void inThongTin() {
		System.out.println(this.giaSanPham + " " + this.maSanPham + " " + this.tenSanPham);
	}

	public void luongBuiCongNghiep() {
		System.out.println("hello");
	}

	public abstract void tinhNang();

}
