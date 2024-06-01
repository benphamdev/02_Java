package sep23ex2;

public abstract class nhanVien {
	private String mnv, fullName, sex, addresss, phoneNumber;

	public nhanVien(String mnv, String fullName, String sex, String addresss, String phoneNumber) {
		this.mnv = mnv;
		this.fullName = fullName;
		this.sex = sex;
		this.addresss = addresss;
		this.phoneNumber = phoneNumber;
	}

	public String getMnv() {
		return mnv;
	}

	public void setMnv(String mnv) {
		this.mnv = mnv;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "nhanVien [mnv=" + mnv + ", fullName=" + fullName + ", sex=" + sex + ", addresss=" + addresss
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public abstract int tienLuong();

}
