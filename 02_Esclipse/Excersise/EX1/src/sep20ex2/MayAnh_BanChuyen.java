package sep20ex2;

public class MayAnh_BanChuyen extends MayAnh_Kts {
	private loaiOngKinh loaiOngKinhTheoMay;

	public MayAnh_BanChuyen(double canNang, String hangSx, String mauSac, String ngaySX, String tenMay,
			String doPhanGiai, String kichThuocSensor, String sensor, loaiOngKinh loaiOngKinhTheoMay) {
		super(canNang, hangSx, mauSac, ngaySX, tenMay, doPhanGiai, kichThuocSensor, sensor);
		this.loaiOngKinhTheoMay = loaiOngKinhTheoMay;
	}

	public void cachSuDungWifi() {
		super.cachSuDungWifi();
	}

	public void dacTinhKyThuatMay() {
		super.dacTinhKyThuatMay();
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println(this.loaiOngKinhTheoMay);
	}
}
