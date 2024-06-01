package mypack;

public class LoaiPhong {
	private String maLP;// PK
	private String tenLP;
	private int giaLP;

	public LoaiPhong(String maLP, String tenLP, int giaLP) {
		this.maLP = maLP;
		this.tenLP = tenLP;
		this.giaLP = giaLP;
	}

	public String getMaLP() {
		return maLP;
	}

	public void setMaLP(String maLP) {
		this.maLP = maLP;
	}

	public String getTenLP() {
		return tenLP;
	}

	public void setTenLP(String tenLP) {
		this.tenLP = tenLP;
	}

	public int getGiaLP() {
		return giaLP;
	}

	public void setGiaLP(int giaLP) {
		this.giaLP = giaLP;
	}
}
