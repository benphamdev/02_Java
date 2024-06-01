package book;

public class author {
	private String name;
	private date birth;

	public author(String name, date birth) {
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public date getBirth() {
		return birth;
	}

	public void setBirth(date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "author [name=" + name + ", birth=" + birth + "]";
	}
}
