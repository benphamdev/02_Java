package sep23ex1;

public class Fish {
	private String nameFish, color;
	private double weight;
	private boolean oar;

	public Fish(String nameFish, String color, double weight, boolean oar) {
		this.nameFish = nameFish;
		this.color = color;
		this.weight = weight;
		this.oar = oar;
	}

	public String toString() {
		return "Fish [nameFish=" + nameFish + ", color=" + color + ", weight=" + weight + ", covay=" + oar + "]";
	}

	public String getNameFish() {
		return nameFish;
	}

	public void setNameFish(String nameFish) {
		this.nameFish = nameFish;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isOar() {
		return oar;
	}

	public void setOar(boolean oar) {
		this.oar = oar;
	}

}
