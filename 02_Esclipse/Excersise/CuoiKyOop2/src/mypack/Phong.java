package mypack;

public class Phong {
	private String maP;// PK
	private String maLP;// FK
	private String hienTrang;

	public Phong(String maP, String hienTrang, String maLP) {
		this.maP = maP;
		this.hienTrang = hienTrang;
		this.maLP = maLP;
	}

	public String getMaP() {
		return maP;
	}

	public void setMaP(String maP) {
		this.maP = maP;
	}

	public String getHienTrang() {
		return hienTrang;
	}

	public void setHienTrang(String hienTrang) {
		this.hienTrang = hienTrang;
	}

	public String getMaLP() {
		return maLP;
	}

	public void setMaLP(String maLP) {
		this.maLP = maLP;
	}
}
