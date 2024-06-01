package Main;

public class Customer {
	private String customerId; // PK
	private String fullName;
	private String gender;
	private String birthYear, address, idNumber, phone;

	public Customer(String customerId, String fullName, String gender, String birthYear,
			String address, String idNumber, String phone) {
		this.customerId = customerId;
		this.fullName = fullName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.address = address;
		this.idNumber = idNumber;
		this.phone = phone;
	}

	public String getcustomerId() {
		return customerId;
	}

	public void setcustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
