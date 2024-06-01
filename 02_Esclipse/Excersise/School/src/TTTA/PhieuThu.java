package TTTA;

public class PhieuThu {
	private String sophieu;
	private String sotienthu;
	private String sohd;
	private HopDongDHP hopdongdhp;
	public PhieuThu(String sophieu, String sotienthu, String sohd) {
		super();
		this.sophieu = sophieu;
		this.sotienthu = sotienthu;
		this.sohd = sohd;
	}
	public String getSophieu() {
		return sophieu;
	}
	public void setSophieu(String sophieu) {
		this.sophieu = sophieu;
	}
	public String getSotienthu() {
		return sotienthu;
	}
	public void setSotienthu(String sotienthu) {
		this.sotienthu = sotienthu;
	}
	public String getSohd() {
		return sohd;
	}
	public void setSohd(String sohd) {
		this.sohd = sohd;
	}
	public HopDongDHP getHopdongdhp() {
		return hopdongdhp;
	}
	public void setHopdongdhp(HopDongDHP hopdongdhp) {
		this.hopdongdhp = hopdongdhp;
	}
	
}
