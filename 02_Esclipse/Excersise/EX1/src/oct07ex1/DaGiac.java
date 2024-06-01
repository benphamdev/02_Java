package oct07ex1;

public abstract class DaGiac {
	protected double[] cdCanh;
	private int soCanh;

	public DaGiac(int soCanh) {
		this.soCanh = soCanh;
		this.cdCanh = new double[soCanh];
	}

	public void infor() {
		System.out.println("Da giac co " + this.soCanh);
	}

	public abstract double tinhChuVi();

	public abstract double tinhDienTich();
}
