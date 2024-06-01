package TTTA;

public class CongViec {
	private String macv;
	private String tencv;
	private String maloaicv;
	private LoaiCV loaicv;
	public CongViec(String macv, String tencv) {
		super();
		this.macv = macv;
		this.tencv = tencv;
		}
	public String getMacv() {
		return macv;
	}
	public void setMacv(String macv) {
		this.macv = macv;
	}
	public String getTencv() {
		return tencv;
	}
	public void setTencv(String tencv) {
		this.tencv = tencv;
	}
	public String getMaloaicv() {
		return maloaicv;
	}
	public void setMaloaicv(String maloaicv) {
		this.maloaicv = maloaicv;
	}
	public LoaiCV getLoaicv() {
		return loaicv;
	}
	public void setLoaicv(LoaiCV loaicv) {
		this.loaicv = loaicv;
	}
	
}
