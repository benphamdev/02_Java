package sep23ex2;

public class nvBienChe extends nhanVien {
	private int hs, phuCap;

	public nvBienChe(String mnv, String fullName, String sex, String addresss, String phoneNumber, int hs, int phuCap) {
		super(mnv, fullName, sex, addresss, phoneNumber);
		this.hs = hs;
		this.phuCap = phuCap;
	}

	public int getHs() {
		return hs;
	}

	public void setHs(int hs) {
		this.hs = hs;
	}

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}

	public int tienLuong() {
		return this.hs * 1800000 + this.phuCap;
	}

	@Override
	public String toString() {
		return super.toString() + " nvBienChe [hs=" + hs + ", phuCap=" + phuCap + "]";
	}

}
