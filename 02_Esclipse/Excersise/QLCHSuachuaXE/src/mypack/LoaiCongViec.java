package mypack;

import java.util.List;

public class LoaiCongViec {
	private String maloaiCV; // PK
	private String tenloaiCV;
	//
	private List<CongViec> dscongviec;

	public LoaiCongViec(String maloaiCV, String tenloaiCV) {
		this.maloaiCV = maloaiCV;
		this.tenloaiCV = tenloaiCV;
	}

	public String getMaloaiCV() {
		return maloaiCV;
	}

	public void setMaloaiCV(String maloaiCV) {
		this.maloaiCV = maloaiCV;
	}

	public String getTenloaiCV() {
		return tenloaiCV;
	}

	public void setTenloaiCV(String tenloaiCV) {
		this.tenloaiCV = tenloaiCV;
	}

	public List<CongViec> getDscongviec() {
		return dscongviec;
	}

	public void setDscongviec(List<CongViec> dscongviec) {
		this.dscongviec = dscongviec;
	}

}
