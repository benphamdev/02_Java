package deSo1Thu7;

public class XeCau extends XeXayDung implements INang {

	private double khoiLuongNangToiDa;

	public XeCau(double giaThanhXe, String mauXe, String maXe, String tinhTrang, int soXe,
			HangSanXuatXeXayDung[] tenHangSx, double khoiLuongNangToiDa) {
		super(giaThanhXe, mauXe, maXe, tinhTrang, soXe, tenHangSx);
		this.khoiLuongNangToiDa = khoiLuongNangToiDa;
	}

	public static void cachThucKeoThungHang() {
		System.out.println("xe cau keo thung hang");
	}

	public static void cachThucNangHang() {
		System.out.println("xe cau nang thung hang");
	}

	@Override
	public void dacTinhKyThuatXe() {
		// TODO Auto-generated method stub
		System.out.println("xe cau");
	}
}
