package mypack;

public class Tho {
	// member variables
	private String matho; // PK
	private String hotentho;
	private String phai;

	// relationship
	private String manhomtho; // FK - not null
	private NhomTho nhomtho; // singular

	// constructor
	public Tho(String matho, String hotentho, String phai, String manhomtho) {
		this.matho = matho;
		this.hotentho = hotentho;
		this.phai = phai;
		this.manhomtho = manhomtho;
	}

	// getter & setter
	public String getMatho() {
		return matho;
	}

	public void setMatho(String matho) {
		this.matho = matho;
	}

	public String getHotentho() {
		return hotentho;
	}

	public void setHotentho(String hotentho) {
		this.hotentho = hotentho;
	}

	public String getPhai() {
		return phai;
	}

	public void setPhai(String phai) {
		this.phai = phai;
	}

	public String getManhomtho() {
		return manhomtho;
	}

	public void setManhomtho(String manhomtho) {
		this.manhomtho = manhomtho;
	}

	public NhomTho getNhomtho() {
		return nhomtho;
	}

	public void setNhomtho(NhomTho nhomtho) {
		this.nhomtho = nhomtho;
	}
}
