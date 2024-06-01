package Main;

import java.util.ArrayList;
import java.util.List;

public class StaffGroup {
	private String staffGroupId; // PK
	private String nameStaffGroup;
	private String info;
	private int staffCount;

	private String leaderId;
	private List<Staff> staffList = new ArrayList<Staff>();

	public StaffGroup(String id, String name, String info) {
		this.staffGroupId = id;
		this.nameStaffGroup = name;
		this.info = info;
	}

	public String getstaffGroupId() {
		return staffGroupId;
	}

	public void setstaffGroupId(String id) {
		this.staffGroupId = id;
	}

	public String getnameStaffGroup() {
		return nameStaffGroup;
	}

	public void setnameStaffGroup(String name) {
		this.nameStaffGroup = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getStaffCount() {
		return staffCount;
	}

	public void setStaffCount(int staffCount) {
		this.staffCount = staffCount;
	}

	public String getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}

	public List<Staff> getStaffList() {
		return staffList;
	}

	public void setStaffList(List<Staff> staffList) {
		this.staffList = staffList;
		this.staffCount = staffList.size();
	}
}
