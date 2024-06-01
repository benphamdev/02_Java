package film;

public class Main {
	public static void main(String[] args) {
		releaseDate dt = new releaseDate(2, 9, 2023);
		productionCompanies pc = new productionCompanies("ute", "vietnam");
		movie fm = new movie("freedom", 2023, pc, 23.8, dt);
		movie fm1 = new movie("independence", 1975, pc, 23.8, dt);
		System.out.println(fm.checkPrice(fm1));
		System.out.println(fm.getpC().getNameCompany());
		System.out.println(fm.priceSale(20));
	}
}
