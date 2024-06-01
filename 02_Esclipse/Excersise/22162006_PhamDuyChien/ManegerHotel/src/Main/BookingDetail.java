package Main;

public class BookingDetail {
	private String staffId; // FK
	private String bookingId; // FK
	private String billId; // FK
	private double income;

	public BookingDetail(String staffId, String billId, String bookingId,
			double income) {
		this.staffId = staffId;
		this.billId = billId;
		this.bookingId = bookingId;
		this.income = income;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
}
