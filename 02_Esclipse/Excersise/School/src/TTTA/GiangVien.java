package TTTA;

public class GiangVien {
	private String msgv;
	private String hotengv;
	private String phai;
	private String manhomgv;
	private NhomGV nhomgv;
	private String 
	public GiangVien(String msgv, String hotengv, String phai, String manhomgv) {
		super();
		this.msgv = msgv;
		this.hotengv = hotengv;
		this.phai = phai;
		this.manhomgv = manhomgv;
		
	}
	public String getMsgv() {
		return msgv;
	}
	public void setMsgv(String msgv) {
		this.msgv = msgv;
	}
	public String getHotengv() {
		return hotengv;
	}
	public void setHotengv(String hotengv) {
		this.hotengv = hotengv;
	}
	public String getPhai() {
		return phai;
	}
	public void setPhai(String phai) {
		this.phai = phai;
	}
	public String getManhomgv() {
		return manhomgv;
	}
	public void setManhomgv(String manhomgv) {
		this.manhomgv = manhomgv;
	}
	public NhomGV getNhomgv() {
		return nhomgv;
	}
	public void setNhomgv(NhomGV nhomgv) {
		this.nhomgv = nhomgv;
	}
	
	
}
