package Main;

import java.util.ArrayList;
import java.util.List;

public class StaffGroup {
	private String staffGroupId; // PK
	private String nameStaffGroup;
	private String infoGroup;
	private int staffCount;

	private String leaderId;
	private List<Staff> staffList = new ArrayList<Staff>();

	public StaffGroup(String staffGroupId, String nameStaffGroup, String infoGroup) {
		this.staffGroupId = staffGroupId;
		this.nameStaffGroup = nameStaffGroup;
		this.infoGroup = infoGroup;
	}

	public String getstaffGroupId() {
		return staffGroupId;
	}

	public void setstaffGroupId(String staffGroupId) {
		this.staffGroupId = staffGroupId;
	}

	public String getnameStaffGroup() {
		return nameStaffGroup;
	}

	public void setnameStaffGroup(String nameStaffGroup) {
		this.nameStaffGroup = nameStaffGroup;
	}

	public String getInfoGroup() {
		return infoGroup;
	}

	public void setInfoGroup(String infoGroup) {
		this.infoGroup = infoGroup;
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
