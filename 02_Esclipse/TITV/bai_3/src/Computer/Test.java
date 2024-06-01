package Computer;

public class Test {
	public static void main(String[] args) {
		Country ct = new Country("2212", "vietnam");
		productionCompanies pC = new productionCompanies("vinFast", ct);
		Date date = new Date(2, 9, 2023);
		Compu compu = new Compu(pC, date, 12.25, 12);
		Compu compu1 = new Compu(pC, date, 12.5, 12);
		System.out.println(compu.checkPrice(compu1));
		System.out.println(compu.getFirm().getNation().getName());
	}
}
