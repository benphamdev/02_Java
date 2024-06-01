package sep30ex1;

public class CaSi extends Nguoi implements IBietMua {
	private DongNhac[] dongNhac;
	private String namBatDauHat;
	private int thuNhapTrungBinhMotNam;

	public CaSi(String hoTen, String phai, DongNhac[] dongNhac, String namBatDauHat, int thuNhapTrungBinhMotNam) {
		super(hoTen, phai);
		this.dongNhac = dongNhac;
		this.namBatDauHat = namBatDauHat;
		this.thuNhapTrungBinhMotNam = thuNhapTrungBinhMotNam;
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println("toi la ca si biet hat cac dong nhac : ");
		for (DongNhac dongNhac2 : dongNhac) {
			System.out.print(dongNhac2 + " ");
		}
	}

	public void khaNangMua() {
		System.out.println("ca si biet mua");
	}

	public void khaNangHat() {
		System.out.println("ca si hat ra hay");
	}

	public void taiNangBamSinh() {
		System.out.println("ca si biet nhay");
	}
}
