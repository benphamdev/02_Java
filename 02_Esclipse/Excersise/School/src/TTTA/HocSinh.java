package TTTA;

public class HocSinh {
	private String mshs;
	private String hoten;
	private String sdt;
	private String malh;
	private LopHoc lophoc;
	public HocSinh(String mshs, String hoten, String sdt, String malh) {
		super();
		this.mshs = mshs;
		this.hoten = hoten;
		this.sdt = sdt;
		this.malh = malh;

	}
	public String getMshs() {
		return mshs;
	}
	public void setMshs(String mshs) {
		this.mshs = mshs;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getMalh() {
		return malh;
	}
	public void setMalh(String malh) {
		this.malh = malh;
	}
	public LopHoc getLophoc() {
		return lophoc;
	}
	public void setLophoc(LopHoc lophoc) {
		this.lophoc = lophoc;
	}
	
}
