package sep30ex1;

public abstract class Nguoi implements IBietHat {
	private String hoTen, phai;

	public Nguoi(String hoTen, String phai) {
		this.hoTen = hoTen;
		this.phai = phai;
	}

	public void inThongTin() {
		System.out.println(this.hoTen + " " + this.phai);
	}

	public void khaNangHat() {
		System.out.println("hat hay !!");
	}

	public abstract void taiNangBamSinh();
}
