package Computer;

public class productionCompanies {
	private String nameCompanies;
	private Country nation;

	public productionCompanies(String nameCompanies, Country nation) {
		this.nameCompanies = nameCompanies;
		this.nation = nation;
	}

	public String getNameCompanies() {
		return nameCompanies;
	}

	public void setNameCompanies(String nameCompanies) {
		this.nameCompanies = nameCompanies;
	}

	public Country getNation() {
		return nation;
	}

	public void setNation(Country nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "productionCompanies [nameCompanies=" + nameCompanies + ", nation=" + nation + "]";
	}

}
