package deSo1;

public class PaperBook extends Book {
	private LoaiGiay[] paperType;

	public PaperBook(TheLoaiSach[] type, int date, int pageNumber, TacGia author, String bookCoverName,
			LoaiGiay[] paperType) {
		super(type, date, pageNumber, author, bookCoverName);
		this.paperType = paperType;
	}

	public LoaiGiay[] getPaperType() {
		return paperType;
	}

	public void setPaperType(LoaiGiay[] paperType) {
		this.paperType = paperType;
	}

	public void summaryBookContent() {
		System.out.println("hello paper");
	}
}
