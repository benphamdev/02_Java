package mypack;

public class DichVu {
	private String maDV;// PK
	private String tenDV;
	private int giaDV;

	public DichVu(String maDV, String tenDV, int giaDV) {
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.giaDV = giaDV;
	}

	public String getMaDV() {
		return maDV;
	}

	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}

	public String getTenDV() {
		return tenDV;
	}

	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}

	public int getGiaDV() {
		return giaDV;
	}

	public void setGiaDV(int giaDV) {
		this.giaDV = giaDV;
	}
}
