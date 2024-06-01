package deSo1Thu7;

public class XeLu extends XeXayDung implements ILu {

	private double sucNenMatDuong;

	public XeLu(double giaThanhXe, String mauXe, String maXe, String tinhTrang, int soXe,
			HangSanXuatXeXayDung[] tenHangSx, double sucNenMatDuong) {
		super(giaThanhXe, mauXe, maXe, tinhTrang, soXe, tenHangSx);
		this.sucNenMatDuong = sucNenMatDuong;
	}

	public double getSucNenMatDuong() {
		return sucNenMatDuong;
	}

	public void setSucNenMatDuong(double sucNenMatDuong) {
		this.sucNenMatDuong = sucNenMatDuong;
	}

	public static void cachThucKeoThungHang() {
		System.out.println("xe lu keo thung hang");
	}

	public static void cachThucLuMatDuong() {
		System.out.println("xe lu mat duong");
	}

	@Override
	public void dacTinhKyThuatXe() {
		// TODO Auto-generated method stub
		System.out.println("xe lu !!");
	}

	public String toString() {
		return super.toString() + " " + this.sucNenMatDuong;
	}
}
