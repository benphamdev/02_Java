package mypack;

import java.util.ArrayList;
import java.util.List;

public class NhomNhanVien {
	private String maNhomNV;// PK
	private String tenNhomNhanVien;
	private String thongTinNhom;
	private int soNhanVien;

	private String maTruongNhom;
	private List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();

	public NhomNhanVien(String maNhomNV, String tenNhomNhanVien, String thongTinNhom) {
		this.maNhomNV = maNhomNV;
		this.tenNhomNhanVien = tenNhomNhanVien;
		this.thongTinNhom = thongTinNhom;
	}

	public String getMaNhomNV() {
		return maNhomNV;
	}

	public void setMaNhomNV(String maNhomNV) {
		this.maNhomNV = maNhomNV;
	}

	public String getTenNhomNhanVien() {
		return tenNhomNhanVien;
	}

	public void setTenNhomNhanVien(String tenNhomNhanVien) {
		this.tenNhomNhanVien = tenNhomNhanVien;
	}

	public String getThongTinNhom() {
		return thongTinNhom;
	}

	public void setThongTinNhom(String thongTinNhom) {
		this.thongTinNhom = thongTinNhom;
	}

	public int getSoNhanVien() {
		return soNhanVien;
	}

	public void setSoNhanVien(int soNhanVien) {
		this.soNhanVien = soNhanVien;
	}

	public String getMaTruongNhom() {
		return maTruongNhom;
	}

	public void setMaTruongNhom(String maTruongNhom) {
		this.maTruongNhom = maTruongNhom;
	}

	public List<NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}

	public void setDsNhanVien(List<NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
		this.soNhanVien = dsNhanVien.size();
	}
}
