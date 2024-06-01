
public class Transcript {
	private String fullName, id;
	private double[] point;

	public Transcript(int id, String fullName, double[] point) {
		this.id = "HS" + String.format("%02d", id);
		this.fullName = fullName;
		this.point = new double[10];
		for (int i = 0; i < 10; i++) {
			this.point[i] = point[i];
		}
	}

	public double getAvgGpa() {
		double res = 0;
		for (int i = 0; i < 10; i++) {
			res += this.point[i];
		}
		return res / 10;
	}

	public String toString() {
		String res = "";
		double gpa = this.getAvgGpa();
		if (gpa >= 9)
			res = "XUAT SAC";
		else if (gpa >= 8)
			res = "GIOI";
		else if (gpa >= 7)
			res = "KHA";
		else if (gpa >= 5)
			res = "TB";
		else
			res = "YEU";
		return this.id + " " + this.fullName + " " + String.format("%.1f", getAvgGpa()) + " " + res;
	}
}
