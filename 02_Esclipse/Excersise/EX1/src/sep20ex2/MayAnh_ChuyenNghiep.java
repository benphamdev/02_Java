package sep20ex2;

public class MayAnh_ChuyenNghiep extends MayAnh_Kts implements IGPS {
	private loaiOngKinh loaiOngKinhTheoMay;
	private TocDoChupLienTuc tocDoChup;

	public MayAnh_ChuyenNghiep(double canNang, String hangSx, String mauSac, String ngaySX, String tenMay,
			String doPhanGiai, String kichThuocSensor, String sensor, loaiOngKinh loaiOngKinhTheoMay,
			TocDoChupLienTuc tocDoChup) {
		super(canNang, hangSx, mauSac, ngaySX, tenMay, doPhanGiai, kichThuocSensor, sensor);
		this.loaiOngKinhTheoMay = loaiOngKinhTheoMay;
		this.tocDoChup = tocDoChup;
	}

	public void cachSuDungWifi() {
		super.cachSuDungWifi();
	}

	public void dacTinhKyThuatMay() {
		System.out.println("dac tinh ky thuat may anh chuyen nghiep");
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println(this.loaiOngKinhTheoMay + "  " + this.tocDoChup);
	}

	public void cachSuDungGps() {
		System.out.println("su dung gps");
	}
}
