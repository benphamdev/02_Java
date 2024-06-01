package mayTinh;

public class LoaiViTinh extends SanPham {
	private double congSuat;
	private String kieuLoa, trepCoi;

	public LoaiViTinh(double giaSanPham, String maSanPham, String tenSanPham, double congSuat, String kieuLoa,
			String trepCoi) {
		super(giaSanPham, maSanPham, tenSanPham);
		this.congSuat = congSuat;
		this.kieuLoa = kieuLoa;
		this.trepCoi = trepCoi;
	}

	public void inThongTin() {
		System.out.println("loai vi tinh : ");
		super.inThongTin();
	}

	public void luongBuiCongNghiep() {
		System.out.println("vi tinh");
	}

	@Override
	public void tinhNang() {
		// TODO Auto-generated method stub
		System.out.println("dung de code !");
	}

}
