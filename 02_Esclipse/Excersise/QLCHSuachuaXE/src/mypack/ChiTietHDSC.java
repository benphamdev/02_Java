package mypack;

public class ChiTietHDSC {
	private String sohd; // FK
	private String macongviec; // FK
	private String matho; // FK
	private double tiencongtho;

	public ChiTietHDSC(String sohd, String macongviec, String matho,
			double tiencongtho) {
		this.sohd = sohd;
		this.macongviec = macongviec;
		this.matho = matho;
		this.tiencongtho = tiencongtho;
	}

	public String getSohd() {
		return sohd;
	}

	public void setSohd(String sohd) {
		this.sohd = sohd;
	}

	public String getMacongviec() {
		return macongviec;
	}

	public void setMacongviec(String macongviec) {
		this.macongviec = macongviec;
	}

	public String getMatho() {
		return matho;
	}

	public void setMatho(String matho) {
		this.matho = matho;
	}

	public double getTiencongtho() {
		return tiencongtho;
	}

	public void setTiencongtho(double tiencongtho) {
		this.tiencongtho = tiencongtho;
	}
}
