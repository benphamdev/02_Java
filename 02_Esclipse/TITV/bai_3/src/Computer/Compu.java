package Computer;

public class Compu {
	private productionCompanies firm;
	private Date date;
	private double price;
	private int monthGuarantee;

	public Compu(productionCompanies firm, Date date, double price, int monthGuarantee) {
		this.firm = firm;
		this.date = date;
		this.price = price;
		this.monthGuarantee = monthGuarantee;
	}

	public productionCompanies getFirm() {
		return firm;
	}

	public void setFirm(productionCompanies firm) {
		this.firm = firm;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMonthGuarantee() {
		return monthGuarantee;
	}

	public void setMonthGuarantee(int monthGuarantee) {
		this.monthGuarantee = monthGuarantee;
	}

	@Override
	public String toString() {
		return "Compu [firm=" + firm + ", date=" + date + ", price=" + price + ", monthGuarantee=" + monthGuarantee
				+ "]";
	}

	public boolean checkPrice(Compu other) {
		return this.price < other.price;
	}

}
