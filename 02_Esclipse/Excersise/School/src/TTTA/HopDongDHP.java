package TTTA;

public class HopDongDHP {
	private String sohd;
	private double hocphi;
	private String mshs;
	private HocSinh hs;
	public HopDongDHP(String sohd, double hocphi, String mshs) {
		super();
		this.sohd = sohd;
		this.hocphi = hocphi;
		this.mshs = mshs;
	}
	public String getSohd() {
		return sohd;
	}
	public void setSohd(String sohd) {
		this.sohd = sohd;
	}
	public double getHocphi() {
		return hocphi;
	}
	public void setHocphi(double hocphi) {
		this.hocphi = hocphi;
	}
	public String getMshs() {
		return mshs;
	}
	public void setMshs(String mshs) {
		this.mshs = mshs;
	}
	public HocSinh getHs() {
		return hs;
	}
	public void setHs(HocSinh hs) {
		this.hs = hs;
	}
	
}
