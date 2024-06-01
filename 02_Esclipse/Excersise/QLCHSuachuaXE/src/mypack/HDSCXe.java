package mypack;

public class HDSCXe {
	private String sohd; // PK
	private double trigiahd;
	// FK
	private String soxe;
	private Xe xe;

	public HDSCXe(String sohd, double trigiahd, String soxe) {
		this.sohd = sohd;
		this.trigiahd = trigiahd;
		this.soxe = soxe;
	}

	public String getSohd() {
		return sohd;
	}

	public void setSohd(String sohd) {
		this.sohd = sohd;
	}

	public String getSoxe() {
		return soxe;
	}

	public void setSoxe(String soxe) {
		this.soxe = soxe;
	}

	public double getTrigiahd() {
		return trigiahd;
	}

	public void setTrigiahd(double trigiahd) {
		this.trigiahd = trigiahd;
	}

	public Xe getXe() {
		return xe;
	}

	public void setXe(Xe xe) {
		this.xe = xe;
	}
}
