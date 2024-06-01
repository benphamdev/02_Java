package TTTA;

public class ChiTietHD {
	private String sohd;
	private String macv;
	private String msgv;
	private double luong;
	public ChiTietHD(String sohd, String macv, String msgv, double luong) {
		super();
		this.sohd = sohd;
		this.macv = macv;
		this.msgv = msgv;
		this.luong = luong;
	}
	public String getSohd() {
		return sohd;
	}
	public void setSohd(String sohd) {
		this.sohd = sohd;
	}
	public String getMacv() {
		return macv;
	}
	public void setMacv(String macv) {
		this.macv = macv;
	}
	public String getMsgv() {
		return msgv;
	}
	public void setMsgv(String msgv) {
		this.msgv = msgv;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	
}
