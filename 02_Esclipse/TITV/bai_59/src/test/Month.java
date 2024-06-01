package test;

public enum Month {
	Month_1(31), Month_2(29), Month_3(30);

	private final int soNgay;

	Month(int soNgay) {
		this.soNgay = soNgay;
	}

	public int soNgay() {
		return this.soNgay;
	}
}
