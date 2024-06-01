package Main;

public class Staff {
	private String staffId; // PK
	private String positionId; // FK
	private String staffGroupId; // FK
	private String name, address, idNumber;
	private StaffGroup staffGroup;

	public Staff(String id, String positionId, String name, String address,
			String idNumber, String staffGroupId) {
		this.staffId = id;
		this.positionId = positionId;
		this.name = name;
		this.address = address;
		this.idNumber = idNumber;
		this.staffGroupId = staffGroupId;
	}

	public String getstaffId() {
		return staffId;
	}

	public void setstaffId(String id) {
		this.staffId = id;
	}

	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getStaffGroupId() {
		return staffGroupId;
	}

	public void setStaffGroupId(String staffGroupId) {
		this.staffGroupId = staffGroupId;
	}

	public StaffGroup getStaffGroup() {
		return staffGroup;
	}

	public void setStaffGroup(StaffGroup staffGroup) {
		this.staffGroup = staffGroup;
	}
}
