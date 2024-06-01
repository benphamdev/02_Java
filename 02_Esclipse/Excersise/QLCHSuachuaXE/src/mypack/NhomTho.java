package mypack;

import java.util.List;

public class NhomTho {
	// member variables
	private String manhomtho; // PK
	private String tennhomtho;
	private String thongtinnhom;
	private int sotho;// lay trong list dstho
//	cx dc nhung moi lan lay lai phai truy van

	// cho phep NULL
	private String matruongnhom; // FK
	private List<Tho> dstho; // plural
	// constructor

	public NhomTho(String manhomtho, String tennhomtho, String thongtinnhom) {
		this.manhomtho = manhomtho;
		this.tennhomtho = tennhomtho;
		this.thongtinnhom = thongtinnhom;
	}

	// getter & setter
	public String getManhomtho() {
		return manhomtho;
	}

	public void setManhomtho(String manhomtho) {
		this.manhomtho = manhomtho;
	}

	public String getTennhomtho() {
		return tennhomtho;
	}

	public void setTennhomtho(String tennhomtho) {
		this.tennhomtho = tennhomtho;
	}

	public String getThongtinnhom() {
		return thongtinnhom;
	}

	public void setThongtinnhom(String thongtinnhom) {
		this.thongtinnhom = thongtinnhom;
	}

	//
	public String getMatruongnhom() {
		return matruongnhom;
	}

	public void setMatruongnhom(String matruongnhom) {
		this.matruongnhom = matruongnhom;
	}

	public List<Tho> getDstho() {
		return dstho;
	}

	public void setDstho(List<Tho> dstho) {
		this.dstho = dstho;
	}

	public int getSotho() {
		return sotho;
	}

	public void setSotho(int sotho) {
		this.sotho = sotho;
	}
}
