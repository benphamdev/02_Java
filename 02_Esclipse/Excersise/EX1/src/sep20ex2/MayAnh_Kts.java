package sep20ex2;

public class MayAnh_Kts extends MayAnh implements IWIFI {
	private String doPhanGiai, kichThuocSensor, sensor;

	public MayAnh_Kts(double canNang, String hangSx, String mauSac, String ngaySX, String tenMay, String doPhanGiai,
			String kichThuocSensor, String sensor) {
		super(canNang, hangSx, mauSac, ngaySX, tenMay);
		this.doPhanGiai = doPhanGiai;
		this.kichThuocSensor = kichThuocSensor;
		this.sensor = sensor;
	}

	public void cachSuDungWifi() {
		System.out.println("cach su dung wifi may anh kts");
	}

	public void dacTinhKyThuatMay() {
		System.out.println("dac tinh ky thuat may kts");
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println(this.doPhanGiai + " " + this.kichThuocSensor + " " + this.sensor);
	}
}
