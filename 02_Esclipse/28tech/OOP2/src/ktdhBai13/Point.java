package ktdhBai13;

public class Point {
	private float x, y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String toString() {
		return "X : " + String.format("%.2f", this.x) + "\n" + "Y : " + String.format("%.2f", this.y) + "\n";
	}
}
