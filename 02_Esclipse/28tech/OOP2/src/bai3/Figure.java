package bai3;

public class Figure {
	private int power, blood;
	private boolean alive;

	public Figure(int power, int blood, boolean alive) {
		this.power = power;
		this.blood = blood;
		this.alive = alive;
	}

	public String toString() {
		String res = "";
		if (this.alive)
			res = "ALIVE";
		else
			res = "DEAD";
		return "Power : " + this.power + "\nBlood : " + this.blood + "\n" + res + "\n-------------\n";
	}

	public void updateState() {
		this.blood = this.power = 0;
		this.alive = false;
	}

	public void meetMushroom() {
		if (this.alive) {
			this.blood -= 15;
			this.power -= 2;
			if (this.blood <= 0 || this.power <= 0) {
				updateState();
			}

		}
	}

	public void meetWitch(int power) {
		if (this.alive) {
			if (power >= this.power) {
				updateState();
			} else {
				this.power += 5;
			}
		}

	}

	public void meetPea() {
		if (!this.alive)
			return;
		this.power += 2;
		this.blood += 10;
	}

	public void meeetSolider(int power) {
		if (!this.alive)
			return;
		if (power >= this.power) {
			updateState();
		} else {
			this.blood += 5;
			this.power += 7;
		}
	}
}
