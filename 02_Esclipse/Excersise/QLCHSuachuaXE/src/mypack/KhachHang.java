package mypack;

public class KhachHang {
	private String makh; // PK
	private String hotenkh;
	private String sodienthoai;

	public KhachHang(String makh, String hotenkh, String sodienthoai) {
		this.makh = makh;
		this.hotenkh = hotenkh;
		this.sodienthoai = sodienthoai;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public String getHotenkh() {
		return hotenkh;
	}

	public void setHotenkh(String hotenkh) {
		this.hotenkh = hotenkh;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
}
