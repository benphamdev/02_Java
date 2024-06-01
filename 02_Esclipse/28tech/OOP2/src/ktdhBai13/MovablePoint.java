package ktdhBai13;

public class MovablePoint extends Point {
	private float xSpeed, ySpeed;

	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getySpeed() {
		return ySpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}

	public MovablePoint move() {
		super.setX(getX() + this.xSpeed);
		super.setY(getY() + this.ySpeed);
		return new MovablePoint(super.getX(), super.getY(), this.xSpeed, this.ySpeed);
	}

	public String toString() {
		return super.toString() + "X Speed : " + String.format("%.2f", this.xSpeed) + "\n" + "Y Speed : "
				+ String.format("%.2f", this.ySpeed);
	}
}
