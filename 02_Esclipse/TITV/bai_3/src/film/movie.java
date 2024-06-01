package film;

public class movie {
	private String name;
	private int year;
	private productionCompanies pC;
	private Double price;
	private releaseDate rd;

	public movie(String name, int year, productionCompanies pC, Double price, releaseDate rd) {
		this.name = name;
		this.year = year;
		this.pC = pC;
		this.price = price;
		this.rd = rd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public productionCompanies getpC() {
		return pC;
	}

	public void setpC(productionCompanies pC) {
		this.pC = pC;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public releaseDate getRd() {
		return rd;
	}

	public void setRd(releaseDate rd) {
		this.rd = rd;
	}

	public boolean checkPrice(movie other) {
		return this.price < other.price;
	}

	public double priceSale(double x) {
		return this.price * (1 - x / 100);
	}
}
