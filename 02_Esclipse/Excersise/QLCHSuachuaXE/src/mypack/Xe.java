package mypack;

public class Xe {
	private String soxe; // PK
	private String hieuxe;
	private String nhaxs;
	// FK
	private String makh;
	private KhachHang khachhang;

	public Xe(String soxe, String hieuxe, String nhaxs, String makh) {
		this.soxe = soxe;
		this.hieuxe = hieuxe;
		this.nhaxs = nhaxs;
		this.makh = makh;
	}

	public String getSoxe() {
		return soxe;
	}

	public void setSoxe(String soxe) {
		this.soxe = soxe;
	}

	public String getHieuxe() {
		return hieuxe;
	}

	public void setHieuxe(String hieuxe) {
		this.hieuxe = hieuxe;
	}

	public String getNhaxs() {
		return nhaxs;
	}

	public void setNhaxs(String nhaxs) {
		this.nhaxs = nhaxs;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public KhachHang getKhachhang() {
		return khachhang;
	}

	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}
}
