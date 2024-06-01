import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	static List<NhomTho> dsNhomTho = new ArrayList<>();
	static List<Tho> dsTho = new ArrayList<>();
	static List<KhachHang> dsKhach = new ArrayList<>();
	static List<Xe> dsXe = new ArrayList<>();
	static List<HDSCXe> dsHDSCXe = new ArrayList<>();
	static List<PhieuThu> dsPhieuThu = new ArrayList<>();
	static List<CongViec> dsCongViec = new ArrayList<>();
	static List<LoaiCongViec> dsLoaiCV = new ArrayList<>();
	static List<ChiTietHDSC> dsChiTietHDSC = new ArrayList<>();

	public static void main(String[] args) {
		init();
//		bo sung cac thuoc tinh lien ket con thieu
		dsNhomTho.get(0).setMatruongnhom("T02");
		dsNhomTho.get(1).setMatruongnhom("T05");
		dsNhomTho.get(2).setMatruongnhom("T09");

		answer();
	}

	static void init() {
//		tao ds nhom tho
		TaoDSNhomTho();
//		tao ds tho
		TaoDSTho();
		// tao ds khach hang
		TaoDSKhachHang();
//		tao ds xe
		TaoDSXe();
// 		tao danh sach HDSCXe
		TaoDSHDSCXe();
//		tao danh sach phieu thu
		TaoDSPhieuThu();
//		tao danh sach loai cv
		TaoNhomCV();
//		tao danh sách công việc 
		TaoCongViec();
//		tao danh sách hướng dẫn chi tiết hợp đồng sửa chữa
		TaoChiTietHDSC();
	}

	static void answer() {
//		tra loi cau hoi
//		1 liet ke ds cac tho thuoc nhom NO1
//		cauSo1("N01");
//		2 biet ma nhom cho biet ai la truong nhom
//		cauSo2("N01");
//		System.out
//				.println("Số lượng thợ trong nhóm thợ có mã N03 là: " + cauSo3("N03"));

//		cauSo4();
//		cau4_1();

//		cauSo5();
//		cauSo6();
//		cauSo7();
//		cauSo8();
//		cauSo9();
//		cauSo10();
		cauSo11();
//		cauSo12();
	}

	// Tao danh sach
	public static void TaoDSNhomTho() {
		dsNhomTho.add(new NhomTho("N01", "DIEN", "Chuyen lam dien XE"));
		dsNhomTho.add(new NhomTho("N02", "MAY", "Chuyen lam may XE"));
		dsNhomTho.add(new NhomTho("N03", "SON", "Chuyen lam dong son"));
//		dsNhomTho.add(new NhomTho("N04", "DO XE", "Chuyen do XE"));
		dsNhomTho.add(new NhomTho("N04", "BAO DUONG", "Chuyen bao duong	xe"));
	}

	public static void TaoDSTho() {
		dsTho.add(new Tho("T01", "Nguyen Van A", "Nam", "N01"));
		dsTho.add(new Tho("T02", "Nguyen Van B", "Nam", "N01"));
		dsTho.add(new Tho("T03", "Nguyen Van C", "Nam", "N01"));
		dsTho.add(new Tho("T04", "Nguyen Van D", "Nu", "N02"));
		dsTho.add(new Tho("T05", "Nguyen Van E", "Nam", "N02"));
		dsTho.add(new Tho("T06", "Nguyen Van F", "Nam", "N02"));
		dsTho.add(new Tho("T07", "Nguyen Van G", "Nu", "N03"));
		dsTho.add(new Tho("T08", "Nguyen Van H", "Nam", "N03"));
		dsTho.add(new Tho("T09", "Nguyen Van I", "Nu", "N03"));
		dsTho.add(new Tho("T10", "Nguyen Van J", "Nam", "N03"));
		dsNhomTho.forEach(i -> {
			i.setDstho(dsTho.stream()
					.filter(n -> n.getManhomtho().equals(i.getManhomtho()))
					.collect(Collectors.toList()));
		});
//		dsNhomTho.get(0).getDstho().add(new Tho("T01", "Nguyen Van A", "Nam", "N01"));
//		dsNhomTho.get(0).getDstho().add(new Tho("T02", "Nguyen Van B", "Nam", "N01"));
//		dsNhomTho.get(0).getDstho().add(new Tho("T03", "Nguyen Van C", "Nam", "N01"));
//		dsNhomTho.get(1).getDstho().add(new Tho("T04", "Nguyen Van D", "Nu", "N02"));
//		dsNhomTho.get(1).getDstho().add(new Tho("T05", "Nguyen Van E", "Nam", "N02"));
//		dsNhomTho.get(1).getDstho().add(new Tho("T06", "Nguyen Van F", "Nam", "N02"));
//		dsNhomTho.get(2).getDstho().add(new Tho("T07", "Nguyen Van G", "Nu", "N03"));
//		dsNhomTho.get(2).getDstho().add(new Tho("T08", "Nguyen Van H", "Nam", "N03"));
//		dsNhomTho.get(2).getDstho().add(new Tho("T09", "Nguyen Van I", "Nu", "N03"));
//		dsNhomTho.get(2).getDstho().add(new Tho("T10", "Nguyen Van J", "Nam", "N03"));
	}

	public static void TaoDSKhachHang() {
		dsKhach.add(new KhachHang("KH001", "Nguyen Van Nam", "0903988999"));
		dsKhach.add(new KhachHang("KH002", "Le Minh An", "0913919293"));
	}

	public static void TaoDSXe() {
		dsXe.add(new Xe("51F2-223.44", "Lead", "Honda", "KH001"));
		dsXe.add(new Xe("59F9-123.45", "SH", "Honda", "KH001"));
		dsXe.add(new Xe("52F4-989.79", "Jutiper", "Yamaha", "KH002"));
	}

	public static void TaoDSHDSCXe() {
		dsHDSCXe.add(new HDSCXe("HD0001", 2500000, "51F2-223.44"));
		dsHDSCXe.add(new HDSCXe("HD0002", 1500000, "52F4-989.79"));
		dsHDSCXe.add(new HDSCXe("HD0003", 500000, "59F9-123.45"));
		dsHDSCXe.add(new HDSCXe("HD0004", 750000, "51F2-223.44"));
		dsHDSCXe.add(new HDSCXe("HD0005", 3500000, "52F4-989.79"));
		dsHDSCXe.add(new HDSCXe("HD0006", 1500000, "51F2-223.44"));
		dsHDSCXe.add(new HDSCXe("HD0007", 4500000, "59F9-123.45"));
	}

	public static void TaoDSPhieuThu() {
		dsPhieuThu.add(new PhieuThu("PH00001", 1000000, "HD0001"));
		dsPhieuThu.add(new PhieuThu("PH00002", 1000000, "HD0002"));
		dsPhieuThu.add(new PhieuThu("PH00003", 1000000, "HD0001"));
		dsPhieuThu.add(new PhieuThu("PH00004", 500000, "HD0001"));
		dsPhieuThu.add(new PhieuThu("PH00005", 300000, "HD0002"));
		dsPhieuThu.add(new PhieuThu("PH00006", 300000, "HD0003"));
		dsPhieuThu.add(new PhieuThu("PH00007", 100000, "HD0003"));
		dsPhieuThu.add(new PhieuThu("PH00008", 1000000, "HD0004"));
		dsPhieuThu.add(new PhieuThu("PH00009", 1000000, "HD0005"));
		dsPhieuThu.add(new PhieuThu("PH00010", 100000, "HD0005"));
		dsPhieuThu.add(new PhieuThu("PH00011", 1000000, "HD0006"));
		dsPhieuThu.add(new PhieuThu("PH00012", 300000, "HD0006"));
	}

	public static void TaoChiTietHDSC() {
		dsChiTietHDSC.add(new ChiTietHDSC("HD0001", "CV001", "T04", 180000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0001", "CV002", "T04", 30000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0001", "CV003", "T05", 5000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0002", "CV010", "T03", 50000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0002", "CV011", "T01", 100000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0002", "CV012", "T01", 350000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0002", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV018", "T07", 210000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV016", "T07", 410000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV014", "T08", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV015", "T10", 5600000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0003", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV010", "T03", 50000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV011", "T03", 100000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV012", "T01", 350000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV018", "T08", 210000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0004", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV001", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV002", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV003", "T04", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV007", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV008", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV009", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0005", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV007", "T04", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV008", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV009", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV010", "T03", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV005", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0006", "CV001", "T04", 180000));

		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV004", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV007", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV008", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV009", "T06", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV002", "T05", 10000));
		dsChiTietHDSC.add(new ChiTietHDSC("HD0007", "CV001", "T04", 180000));
	}

	public static void TaoNhomCV() {
		dsLoaiCV.add(new LoaiCongViec("L01", "Bao duong XE"));
		dsLoaiCV.add(new LoaiCongViec("L02", "Lam may XE"));
		dsLoaiCV.add(new LoaiCongViec("L03", "Lam dien trong XE"));
		dsLoaiCV.add(new LoaiCongViec("L04", "Lam dong son XE"));
	}

	public static void TaoCongViec() {
		dsCongViec.add(new CongViec("CV001", "Thay nhot XE", "L01"));
		dsCongViec.add(new CongViec("CV002", "Thay nuoc mat XE", "L01"));
		dsCongViec.add(new CongViec("CV003", "Bom XE", "L01"));
		dsCongViec.add(new CongViec("CV004", "Thay bac dan banh XE", "L01"));
		dsCongViec.add(new CongViec("CV005", "Thay sen cam XE", "L02"));
		dsCongViec.add(new CongViec("CV006", "Xoay subap XE", "L02"));
		dsCongViec.add(new CongViec("CV007", "Tien rang nap nhot may XE", "L02"));
		dsCongViec.add(new CongViec("CV008", "Thay bo noi ly hop XE", "L02"));
		dsCongViec.add(new CongViec("CV009", "Thay sen nhong dia XE", "L02"));
		dsCongViec.add(new CongViec("CV010", "Them nuoc binh dien XE", "L03"));
		dsCongViec.add(new CongViec("CV011", "Thay bong den XE", "L03"));
		dsCongViec.add(new CongViec("CV012", "Thay binh dien XE", "L03"));
		dsCongViec.add(new CongViec("CV013", "Thay bobin suon XE", "L03"));
		dsCongViec.add(new CongViec("CV014", "Han bo XE", "L04"));
		dsCongViec.add(new CongViec("CV015", "Son XE", "L04"));
		dsCongViec.add(new CongViec("CV016", "Han suon XE", "L04"));
		dsCongViec.add(new CongViec("CV017", "Lam nguoi chi tiet trong XE", "L04"));
		dsCongViec.add(new CongViec("CV018", "Phuc hoi phuoc XE", "L04"));
	}

	// Cau 1 - Liet ke danh sach cac tho thuoc nhom biet mannhomtho
	public static void cauSo1(String manhomtho) {
		List<Tho> ltho = dsTho.stream().filter(i -> i.getManhomtho().equals(manhomtho))
				.collect(Collectors.toList());
		if (ltho.size() == 0)
			System.out.println("nhóm thợ chưa tuyển được ai !!!");
		else {
			System.out.println("danh sách nhóm thợ thuộc nhóm : " + manhomtho);
			ltho.stream().forEach(e -> System.out.println(
					"mã thợ : " + e.getMatho() + "-họ tên : " + e.getHotentho()));
		}
//		List<NhomTho> lstho = dsNhomTho.stream()
//				.filter(i -> i.getManhomtho().equals(manhomtho))
//				.collect(Collectors.toList());
//		lstho.forEach(e -> e.getDstho().forEach(i -> System.out.println(i)));
	}

	// Cau 2 -In thong tin truong nhom khi biet manhomtho
	public static void cauSo2(String id) {
		Optional<String> maTruongNhom = dsNhomTho.stream()
				.filter(i -> i.getManhomtho().equals(id)).map(NhomTho::getMatruongnhom)
				.findFirst();
		if (maTruongNhom.isPresent()) {
			System.out.println(
					"ma nhom :" + id + " co nhom truong : " + maTruongNhom.get());
			Tho x = dsTho.stream().filter(i -> i.getManhomtho().equals(id))
					.filter(i -> i.getMatho().equals(maTruongNhom.get())).findAny()
					.orElse(null);
			System.out.println(x);
		} else
			System.out.println("NULL");
	}

	// Cau 3 - Cho biet nhom co bao nhieu tho khi biet manhomtho
	public static int cauSo3(String maNhomTho) {
		long cnt = dsTho.stream().filter(i -> i.getManhomtho().equals(maNhomTho))
				.count();
//		System.out.println("so luong tho trong nhom " + maNhomTho + " la : " + cnt);
		return (int) cnt;
	}

	// Cau 4- Cho biet nhom nao co nhieu tho nhat

	public static void cauSo4() {
//		for (NhomTho ntho : dsNhomTho)
//			ntho.setSotho(cauSo3(ntho.getManhomtho()));
		Optional<NhomTho> ans = dsNhomTho.stream()
				.max(Comparator.comparing(NhomTho::getSotho));
		ans.ifPresent(nhomtho -> System.out.println(
				"Nhóm thợ có số lượng thợ nhiều nhất là: " + nhomtho.getTennhomtho()));
		System.out.println("cac thanh vien trong nhom la ");
		ans.get().getDstho().forEach(e -> System.out.println(e));
	}

	public static void cau4_1() {
		Map<String, Long> nhomThomax = dsTho.stream().collect(
				Collectors.groupingBy(Tho::getManhomtho, Collectors.counting()));
		Map.Entry<String, Long> maxEntry = nhomThomax.entrySet().stream()
				.max(Map.Entry.comparingByValue()).orElse(null);
		if (maxEntry != null) {
			System.out.println(maxEntry.getKey() + " " + maxEntry.getValue());
		} else {
			System.out.println("ko co nhom tho nao ");
		}
	}

//	Cau05: In cac hop dong da duoc chi tra hoan tat tri gia hop dong
	public static void cauSo5() {
		Map<String, Double> totalMoneyOfContract = dsPhieuThu.stream()
				.collect(Collectors.groupingBy(PhieuThu::getSodh,
						Collectors.summingDouble(PhieuThu::getSotienthu)));
		dsHDSCXe.stream()
				.filter(n -> totalMoneyOfContract.getOrDefault(n.getSohd(), 0.0) == n
						.getTrigiahd())
				.forEach(hd -> System.out.println(
						"Hợp đồng số " + hd.getSohd() + " đã được chi trả đủ."));
	}

	// Cau 06: Hop dong gia tri lon nhat - nho nhat va >= gt trung binh
	public static void cauSo6() {
		dsHDSCXe.stream().max(Comparator.comparingDouble(HDSCXe::getTrigiahd))
				.ifPresent(hd -> System.out
						.println("hop dong co gia tri lon nhat : " + hd.getSohd()));
		dsHDSCXe.stream().min(Comparator.comparingDouble(HDSCXe::getTrigiahd))
				.ifPresent(hd -> System.out
						.println("hop dong co gia tri nho nhat : " + hd.getSohd()));
		OptionalDouble ave = dsHDSCXe.stream().mapToDouble(HDSCXe::getTrigiahd)
				.average();
		if (ave.isPresent()) {
			System.out.println(
					"Các hợp đồng có trị giá lớn hơn hoặc bằng giá trị trung bình:");
			dsHDSCXe.stream().filter(hd -> hd.getTrigiahd() >= ave.getAsDouble())
					.forEach(hd -> System.out.println("hop dong : " + hd.getSohd()
							+ " gia tri hop dong :" + hd.getTrigiahd()));
		}
	}

	// Cau 07: danh sách thợ không tham gia vào bất kỳ hợp đồng nào
	public static void cauSo7() {
		Set<String> thoThamGiaHD = dsChiTietHDSC.stream().map(ChiTietHDSC::getMatho)
				.collect(Collectors.toSet());
		dsTho.stream().filter(e -> !thoThamGiaHD.contains(e.getMatho()))
				.forEach(n -> System.out.println(
						"ma tho : " + n.getMatho() + " ho ten : " + n.getHotentho()));
	}

	// cauSo 8
	public static void cauSo8() {
		List<Set<String>> danhSachMaThoTrongTungHD = dsChiTietHDSC.stream()
				.map(hd -> dsChiTietHDSC.stream()
						.filter(ct -> hd.getSohd().equals(ct.getSohd()))
						.map(ChiTietHDSC::getMatho).collect(Collectors.toSet()))
				.collect(Collectors.toList());
		for (Set<String> set : danhSachMaThoTrongTungHD) {
			System.out.println(set);
		}
		Set<String> thoThamGiaTatCaHD = danhSachMaThoTrongTungHD.stream().collect(
				() -> new HashSet<>(danhSachMaThoTrongTungHD.get(0)), Set::retainAll,
				Set::retainAll);
		dsTho.stream().filter(tho -> thoThamGiaTatCaHD.contains(tho.getMatho()))
				.forEach(tho -> System.out.println("Ma tho: " + tho.getMatho()
						+ "; Ho ten: " + tho.getHotentho()));
	}

	// Cau09: Liệt kê danh sách thợ theo từng nhóm thợ và tổng số lượng thợ trong
	// mỗi nhóm
	public static void cauSo9() {
		dsNhomTho.forEach(e -> {
			System.out.println(e.getTennhomtho());
			e.getDstho().forEach(n -> System.out.println(n));
			System.out.println("tong so luong tho trong nhom " + e.getSotho());
		});
	}

	// Cau 10: Tính tổng thu nhập cho mỗi thợ
	static void cauSo10() {
		Map<String, Double> tongThuNhapCuaTho = dsChiTietHDSC.stream()
				.collect(Collectors.groupingBy(ChiTietHDSC::getMatho,
						Collectors.summingDouble(ChiTietHDSC::getTiencongtho)));
		List<Map.Entry<String, Double>> sortedSalary = new ArrayList<>(
				tongThuNhapCuaTho.entrySet());
		sortedSalary.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		sortedSalary.forEach(e -> System.out.println(e));
	}

	// Cau 11: Danh sách các thợ có tổng thu nhập cao nhất, thấp nhất và >= trung
	// bình
	static void cauSo11() {
		Map<String, Double> incomeWorker = dsChiTietHDSC.stream()
				.collect(Collectors.groupingBy(ChiTietHDSC::getMatho,
						Collectors.summingDouble(ChiTietHDSC::getTiencongtho)));

		Optional<Double> maxIncome = incomeWorker.values().stream()
				.max(Double::compareTo);
		Optional<Double> minIncome = incomeWorker.values().stream()
				.min(Double::compareTo);
		Double averIncome = incomeWorker.values().stream()
				.mapToDouble(Double::doubleValue).average().orElse(0.0);

		System.out.println("Thu nhập cao nhất: " + maxIncome.get());

		incomeWorker.entrySet().stream()
				.filter(e -> e.getValue().equals(maxIncome.orElse(0.0)))
				.forEach(entry -> System.out.println("Mã thợ: " + entry.getKey()
						+ " có tổng thu nhập cao nhất: " + entry.getValue()));

		System.out.println("Thu nhập thấp nhất: " + minIncome.get());
		incomeWorker.entrySet().stream()
				.filter(e -> e.getValue().equals(minIncome.orElse(0.0)))
				.forEach(entry -> System.out.println("Mã thợ: " + entry.getKey()
						+ " có tổng thu nhập thap nhất: " + entry.getValue()));

		System.out.println("Thu nhập trung bình: " + averIncome);
		incomeWorker.entrySet().stream()
				.filter(e -> e.getValue() > averIncome.doubleValue())
				.forEach(entry -> System.out.println("ma tho : " + entry.getKey()
						+ "co tong thu nhap lon hon trung binh : " + entry.getValue()));
	}

	static void cauSo12() {
		Map<String, Long> soLanThucHienCV = dsChiTietHDSC.stream().collect(Collectors
				.groupingBy(ChiTietHDSC::getMacongviec, Collectors.counting()));
		Optional<Map.Entry<String, Long>> CVthucHienNhieu = soLanThucHienCV.entrySet()
				.stream().max(Map.Entry.comparingByValue());
		CVthucHienNhieu.ifPresent(entry -> System.out
				.println("Công việc được thực hiện nhiều lần nhất: " + entry.getKey()
						+ " với số lần thực hiện là: " + entry.getValue()));
	}

	static void cauSo13() {

	}
}