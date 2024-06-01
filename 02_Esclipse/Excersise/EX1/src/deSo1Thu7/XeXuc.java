package deSo1Thu7;

public class XeXuc extends XeXayDung implements IDao, INang {
	private double khoiLuongXucToiDa;

	public XeXuc(double giaThanhXe, String mauXe, String maXe, String tinhTrang, int soXe,
			HangSanXuatXeXayDung[] tenHangSx, double khoiLuongXucToiDa) {
		super(giaThanhXe, mauXe, maXe, tinhTrang, soXe, tenHangSx);
		this.khoiLuongXucToiDa = khoiLuongXucToiDa;
	}

	public double getKhoiLuongXucToiDa() {
		return khoiLuongXucToiDa;
	}

	public void setKhoiLuongXucToiDa(double khoiLuongXucToiDa) {
		this.khoiLuongXucToiDa = khoiLuongXucToiDa;
	}

	public static void cachThucKeoThungHang() {
		System.out.println("keo thung hang");
	}

	public static void cachThucDaoDat() {
		System.out.println("xe xuc dao");
	}

	public static void cachThucNangHang() {
		System.out.println("xe xuc nang thung hang");
	}

	@Override
	public void dacTinhKyThuatXe() {
		System.out.println("xe xuc !!!");
	}

	public String toString() {
		return super.toString() + " " + this.khoiLuongXucToiDa;
	}
}
