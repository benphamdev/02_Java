package cafe;

public class billCafe {
	private String name;
	private Double price, volume;

	public billCafe(String name, Double price, Double volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}

	public Double totalPrice() {
		return this.price * this.volume;
	}

	public boolean checkVolume(Double volume) {
		return this.volume > volume;
	}
	
	public boolean checkTotalPrice() {
		return this.totalPrice() > 500.0;
	}
	
	public Double priceSale(Double x) {
		if (this.totalPrice() > 500000)
			return x / 100 * this.totalPrice();
		return 0.0;
	}
	
	public Double priceAfterSale(Double x) {
		return this.totalPrice() - this.priceSale(x);
	}
}
