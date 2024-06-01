package deSo1;

import java.util.Arrays;

public class eBook extends Book implements IPhanMemDocSachDienTu {
	private LoaiTapTinSachDienTu[] fileType;

	public eBook(TheLoaiSach[] type, int date, int pageNumber, TacGia author, String bookCoverName,
			LoaiTapTinSachDienTu[] fileType) {
		super(type, date, pageNumber, author, bookCoverName);
		this.fileType = fileType;
	}

	@Override
	public void summaryBookContent() {
		System.out.println("hello ebook");
	}

	public static void cachCaiDatPhanMemDocSach() {
		System.out.println("installing");
	}

	public String toString() {
//		String ans = "";
//		for (LoaiTapTinSachDienTu loaiTapTinSachDienTu : fileType) {
//			ans += loaiTapTinSachDienTu + " ";
//		}
		return super.toString() + " " + Arrays.toString(this.fileType);
	}
}
