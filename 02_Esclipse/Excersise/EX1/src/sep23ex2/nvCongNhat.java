package sep23ex2;

public class nvCongNhat extends nhanVien {
	private int soNgayCong, tienCong;

	public nvCongNhat(String mnv, String fullName, String sex, String addresss, String phoneNumber, int soNgayCong,
			int tienCong) {
		super(mnv, fullName, sex, addresss, phoneNumber);
		this.soNgayCong = soNgayCong;
		this.tienCong = tienCong;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public int getTienCong() {
		return tienCong;
	}

	public void setTienCong(int tienCong) {
		this.tienCong = tienCong;
	}

	@Override
	public String toString() {
		return super.toString() + " nvCongNhat [soNgayCong=" + soNgayCong + ", tienCong=" + tienCong + "]";
	}

	public int tienLuong() {
		return this.soNgayCong * this.tienCong;
	}

}
