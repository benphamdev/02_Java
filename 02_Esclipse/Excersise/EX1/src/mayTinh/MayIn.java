package mayTinh;

public class MayIn extends SanPham {

	private String in2Mat, loaiMay;
	private int toDoIn;

	public MayIn(double giaSanPham, String maSanPham, String tenSanPham, String in2Mat, String loaiMay, int toDoIn) {
		super(giaSanPham, maSanPham, tenSanPham);
		this.in2Mat = in2Mat;
		this.loaiMay = loaiMay;
		this.toDoIn = toDoIn;
	}

	public void inThongTin() {
		System.out.println("loai may in : ");
		super.inThongTin();
	}

	public void luongBuiCongNghiep() {
		System.out.println("bui may in");
	}

	@Override
	public void tinhNang() {
		// TODO Auto-generated method stub
		System.out.println("dung de tai lieu !");
	}

}
