package TTTA;

import java.util.List;

public class NhomGV {
	private String manhomgv;
	private String tennhomgv;
	private String thongtinnhom;
	private int sogv;
	private String matruongnhom;
	private List<GiangVien> dsgv;
	public NhomGV(String manhomgv, String tennhomgv, String thongtinnhom, int sogv, String matruongnhom) {
		super();
		this.manhomgv = manhomgv;
		this.tennhomgv = tennhomgv;
		this.thongtinnhom = thongtinnhom;
		this.sogv = sogv;
		this.matruongnhom = matruongnhom;
	}
	public String getManhomgv() {
		return manhomgv;
	}
	public void setManhomgv(String manhomgv) {
		this.manhomgv = manhomgv;
	}
	public String getTennhomgv() {
		return tennhomgv;
	}
	public void setTennhomgv(String tennhomgv) {
		this.tennhomgv = tennhomgv;
	}
	public String getThongtinnhom() {
		return thongtinnhom;
	}
	public void setThongtinnhom(String thongtinnhom) {
		this.thongtinnhom = thongtinnhom;
	}
	public int getSogv() {
		return sogv;
	}
	public void setSogv(int sogv) {
		this.sogv = sogv;
	}
	public String getMatruongnhom() {
		return matruongnhom;
	}
	public void setMatruongnhom(String matruongnhom) {
		this.matruongnhom = matruongnhom;
	}
	public List<GiangVien> getDsgv() {
		return dsgv;
	}
	public void setDsgv(List<GiangVien> dsgv) {
		this.dsgv = dsgv;
	}
	
	
	
	
}
