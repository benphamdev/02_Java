

public class CongViec {
	private String macongviec; // PK
	private String tencongviec;
	// FK
	private String maloaiCV;
	private LoaiCongViec loaicv;

	public CongViec(String macongviec, String tencongviec, String maloaiCV) {
		this.macongviec = macongviec;
		this.tencongviec = tencongviec;
		this.maloaiCV = maloaiCV;
	}

	public String getMacongviec() {
		return macongviec;
	}

	public void setMacongviec(String macongviec) {
		this.macongviec = macongviec;
	}

	public String getTencongviec() {
		return tencongviec;
	}

	public void setTencongviec(String tencongviec) {
		this.tencongviec = tencongviec;
	}

	public String getMaloaiCV() {
		return maloaiCV;
	}

	public void setMaloaiCV(String maloaiCV) {
		this.maloaiCV = maloaiCV;
	}

	public LoaiCongViec getLoaicv() {
		return loaicv;
	}

	public void setLoaicv(LoaiCongViec loaicv) {
		this.loaicv = loaicv;
	}
}
