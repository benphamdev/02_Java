package mypack;

public class PhieuThu {
	private String sophieu; // PK
	private double sotienthu;
	// FK
	private String sodh;
	private HDSCXe hopdongxe;

	//
	public PhieuThu(String sophieu, double sotienthu, String sodh) {
		this.sophieu = sophieu;
		this.sotienthu = sotienthu;
		this.sodh = sodh;
	}

	//
	public String getSophieu() {
		return sophieu;
	}

	public void setSophieu(String sophieu) {
		this.sophieu = sophieu;
	}

	public double getSotienthu() {
		return sotienthu;
	}

	public void setSotienthu(double sotienthu) {
		this.sotienthu = sotienthu;
	}

	public String getSodh() {
		return sodh;
	}

	public void setSodh(String sodh) {
		this.sodh = sodh;
	}

	public HDSCXe getHopdongxe() {
		return hopdongxe;
	}

	public void setHopdongxe(HDSCXe hopdongxe) {
		this.hopdongxe = hopdongxe;
	}

}
