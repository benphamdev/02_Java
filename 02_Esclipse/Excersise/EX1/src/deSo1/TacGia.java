package deSo1;

public class TacGia {
	private String fullName, id;

	public TacGia(String fullName, String id) {
		this.fullName = fullName;
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return this.fullName + " " + this.id;
	}
}
