package Exercise;

public class ProductionCompanies {
	private String nameFirm, nameCountry;

	public ProductionCompanies(String nameFirm, String nameCountry) {
		this.nameFirm = nameFirm;
		this.nameCountry = nameCountry;
	}

	public String getNameFirm() {
		return nameFirm;
	}

	public void setNameFirm(String nameFirm) {
		this.nameFirm = nameFirm;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}
}
