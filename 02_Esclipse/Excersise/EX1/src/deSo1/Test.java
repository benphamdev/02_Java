package deSo1;

public class Test {
	public static void main(String[] args) {
		TheLoaiSach[] theLoaiSachs = TheLoaiSach.values();
		LoaiGiay[] giays = LoaiGiay.values();
		LoaiTapTinSachDienTu[] loaiTapTinSachDienTus = LoaiTapTinSachDienTu.values();

//		int[] a = { 1, 2, 4 };
//		System.out.println(Arrays.toString(a));
//		ArrayList<Integer> a = new ArrayList<>();
//		a.add(1);
//		a.add(2);
//		System.out.println(a.toString());

//		System.out.println(theLoaiSachs.toString());

		TacGia tacGia = new TacGia("pham duy chien", "22");
		TacGia tacGia1 = new TacGia("duy chien", "22");

		eBook eBook = new eBook(theLoaiSachs, 2011, 23, tacGia, "java", loaiTapTinSachDienTus);
		System.out.println(eBook);
		eBook.summaryBookContent();

		PaperBook paperBook = new PaperBook(theLoaiSachs, 2021, 200, tacGia1, "c++", giays);
		System.out.println(paperBook);
		paperBook.summaryBookContent();
	}
}