package mypack;

public class DatPhong {
	private String maDP;// PK
	private String maKH;// FK
	private String maP;// FK

	public DatPhong(String maDP, String maKH, String maP) {
		this.maDP = maDP;
		this.maKH = maKH;
		this.maP = maP;
	}

	public String getMaDP() {
		return maDP;
	}

	public void setMaDP(String maDP) {
		this.maDP = maDP;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getMaP() {
		return maP;
	}

	public void setMaP(String maP) {
		this.maP = maP;
	}
}
