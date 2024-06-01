package sep23ex2;

public class nvHopDong extends nhanVien {
	private int soNgay, luongThang;

	public nvHopDong(String mnv, String fullName, String sex, String addresss, String phoneNumber, int soNgay,
			int luongThang) {
		super(mnv, fullName, sex, addresss, phoneNumber);
		this.soNgay = soNgay;
		this.luongThang = luongThang;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public int getLuongThang() {
		return luongThang;
	}

	public void setLuongThang(int luongThang) {
		this.luongThang = luongThang;
	}

	@Override
	public String toString() {
		return super.toString() + " nvHopDong [soNgay=" + soNgay + ", luongThang=" + luongThang + "]";
	}

	@Override
	public int tienLuong() {
		return this.soNgay * this.luongThang / 26;
	}

}
