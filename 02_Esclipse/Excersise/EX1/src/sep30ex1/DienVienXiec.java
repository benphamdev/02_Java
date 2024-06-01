package sep30ex1;

public class DienVienXiec extends Nguoi implements IBietLamXiec {
	private String namBatDauDien;
	private double thuNhapTrungBinhMotNam;
	private TroXiec[] troXiec;

	public DienVienXiec(String hoTen, String phai, String namBatDauDien, double thuNhapTrungBinhMotNam,
			TroXiec[] troXiec) {
		super(hoTen, phai);
		this.namBatDauDien = namBatDauDien;
		this.thuNhapTrungBinhMotNam = thuNhapTrungBinhMotNam;
		this.troXiec = troXiec;
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println("toi la dien vien xiec biet dien cac loai xiec :");
		for (TroXiec troXiec2 : troXiec) {
			System.out.print(troXiec2 + " ");
		}
		System.out.println();
	}

	public void khaNangLamXiec() {
		System.out.println("biet mua");
	}

	public void khaNangHat() {
		System.out.println("dien vien hat nghe duoc");
	}

	public void taiNangBamSinh() {
		System.out.println("dien vien xiec biet nhay + mua");
	}
}
