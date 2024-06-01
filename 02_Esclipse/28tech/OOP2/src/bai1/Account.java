package bai1;

public class Account {
	private String Id, customerId, UserName, Password;

	public Account(String id, String customerId, String userName, String password) {
		Id = id;
		this.customerId = customerId;
		UserName = userName;
		Password = password;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Account [Id=" + Id + ", customerId=" + customerId + ", UserName=" + UserName + ", Password=" + Password
				+ "]";
	}

}
