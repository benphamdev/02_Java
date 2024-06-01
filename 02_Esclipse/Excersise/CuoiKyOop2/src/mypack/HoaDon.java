package mypack;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
	private String maHD;// PK
	private String maDP;// FK
	private String ngayLap;

	private List<DichVu> dsDV = new ArrayList<DichVu>();// FK
	private int thanhTien;

	public HoaDon(String maHD, String ngayLap, int thanhTien) {
		this.maHD = maHD;
		this.ngayLap = ngayLap;
		this.thanhTien = thanhTien;
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public String getMaDP() {
		return maDP;
	}

	public void setMaDP(String maDP) {
		this.maDP = maDP;
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}

	public int getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}

	public List<DichVu> getDsDV() {
		return dsDV;
	}

	public void setDsDV(List<DichVu> dsDV) {
		this.dsDV = dsDV;
	}
}
