package mypack;

public class ChiTietDatPhong {
	private String maNV;// FK
	private String maDatPhong;// FK
	private String maHoaDon;// FK
	private double thuNhap;

	public ChiTietDatPhong(String maNV, String maHoaDon, String maDatPhong,
			double thuNhap) {
		this.maNV = maNV;
		this.maHoaDon = maHoaDon;
		this.maDatPhong = maDatPhong;
		this.thuNhap = thuNhap;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public String getMaDatPhong() {
		return maDatPhong;
	}

	public void setMaDatPhong(String maDatPhong) {
		this.maDatPhong = maDatPhong;
	}

	public double getThuNhap() {
		return thuNhap;
	}

	public void setThuNhap(double thuNhap) {
		this.thuNhap = thuNhap;
	}
}
