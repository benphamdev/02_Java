package mayTinh;

public class ManHinh extends SanPham {

	private int co3D, kichThuoc;
	private String loaiMH;

	public ManHinh(double giaSanPham, String maSanPham, String tenSanPham, int co3d, int kichThuoc, String loaiMH) {
		super(giaSanPham, maSanPham, tenSanPham);
		co3D = co3d;
		this.kichThuoc = kichThuoc;
		this.loaiMH = loaiMH;
	}

	public void inThongTin() {
		System.out.println("loai man hinh : ");
		super.inThongTin();
	}

	public void luongBuiCongNghiep() {
		System.out.println("bui man hinh");
	}

	@Override
	public void tinhNang() {
		// TODO Auto-generated method stub
		System.out.println("dung de xem code !");
	}

}
