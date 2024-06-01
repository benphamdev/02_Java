package film;

public class productionCompanies {
	private String nameCompany, country;

	public productionCompanies(String nameCompany, String country) {
		this.nameCompany = nameCompany;
		this.country = country;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
