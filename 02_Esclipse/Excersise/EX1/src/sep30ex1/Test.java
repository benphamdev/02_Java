package sep30ex1;

public class Test {

	public static void main(String[] args) {
		DongNhac[] dn = DongNhac.values();
		TroXiec[] tx = TroXiec.values();

		CaSi cs = new CaSi("chi pu", "nu", dn, "2022", 200);
		cs.inThongTin();
		cs.khaNangHat();
		cs.khaNangMua();

		System.out.println("---------------------------");

		DienVienXiec dv = new DienVienXiec("quoc co", "nam", "2012", 23232, tx);
		dv.inThongTin();
		dv.taiNangBamSinh();
		dv.khaNangLamXiec();
	}
}
