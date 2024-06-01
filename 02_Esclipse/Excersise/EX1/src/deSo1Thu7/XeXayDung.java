package deSo1Thu7;

import java.util.Arrays;

public abstract class XeXayDung implements IKeo {
	private double giaThanhXe;
	private String mauXe, maXe, tinhTrang;
	private int soXe;
	private HangSanXuatXeXayDung tenHangSx[];

	public XeXayDung(double giaThanhXe, String mauXe, String maXe, String tinhTrang, int soXe,
			HangSanXuatXeXayDung[] tenHangSx) {
		this.giaThanhXe = giaThanhXe;
		this.mauXe = mauXe;
		this.maXe = maXe;
		this.tinhTrang = tinhTrang;
		this.soXe = soXe;
		this.tenHangSx = tenHangSx;
	}

	public static void cachThucKeoThungHang() {
		System.out.println("keo thung hang");
	}

	public String toString() {
		return this.giaThanhXe + " " + this.mauXe + " " + this.mauXe + " " + this.soXe + " "
				+ Arrays.toString(this.tenHangSx) + " " + this.tinhTrang;
	}

	public abstract void dacTinhKyThuatXe();
}
