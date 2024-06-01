package mypack;

public class NhanVien {
	private String maNV;// PK
	private String maCV;// FK
	private String maNhomNV;// FK
	private String tenNV, gioiTinh, namSinh, diaChi, cmnd, soDienThoai, trinhDo;
	private NhomNhanVien nhomNhanVien;

	public NhanVien(String maNV, String maCV, String tenNV, String gioiTinh,
			String namSinh, String diaChi, String cmnd, String soDienThoai,
			String trinhDo, String maNhomNV) {
		this.maNV = maNV;
		this.maCV = maCV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
		this.cmnd = cmnd;
		this.soDienThoai = soDienThoai;
		this.trinhDo = trinhDo;
		this.maNhomNV = maNhomNV;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getMaCV() {
		return maCV;
	}

	public void setMaCV(String maCV) {
		this.maCV = maCV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public String getMaNhomNV() {
		return maNhomNV;
	}

	public void setMaNhomNV(String maNhomNV) {
		this.maNhomNV = maNhomNV;
	}

	public NhomNhanVien getNhomNhanVien() {
		return nhomNhanVien;
	}

	public void setNhomNhanVien(NhomNhanVien nhomNhanVien) {
		this.nhomNhanVien = nhomNhanVien;
	}
}
