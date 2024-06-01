package TTTA;
import java.util.List;
public class LoaiCV {
	private String maloaicv;
	private String tenloaicv;
	private List<CongViec> dscv;
	public LoaiCV(String maloaicv, String tenloaicv) {
		super();
		this.maloaicv = maloaicv;
		this.tenloaicv = tenloaicv;
	}
	public String getMaloaicv() {
		return maloaicv;
	}
	public void setMaloaicv(String maloaicv) {
		this.maloaicv = maloaicv;
	}
	public String getTenloaicv() {
		return tenloaicv;
	}
	public void setTenloaicv(String tenloaicv) {
		this.tenloaicv = tenloaicv;
	}
	public List<CongViec> getDscongviec() {
		return dscv;
	}
	public void setDscongviec(List<CongViec> dscongviec) {
		this.dscv = dscongviec;
	}
	
}
