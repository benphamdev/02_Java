package mypack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static List<DichVu> dsDichVu = new ArrayList<DichVu>();
	public static List<HoaDon> dsHoaDon = new ArrayList<HoaDon>();
	public static List<LoaiPhong> dsLoaiPhong = new ArrayList<LoaiPhong>();
	public static List<Phong> dsPhong = new ArrayList<Phong>();
	public static List<DatPhong> dsDatPhong = new ArrayList<DatPhong>();
	public static List<KhachHang> dsKhachHang = new ArrayList<KhachHang>();
	public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
	public static List<ChucVu> dsChucVu = new ArrayList<ChucVu>();
	public static List<NhomNhanVien> dsNhomNhanVien = new ArrayList<NhomNhanVien>();
	public static List<ChiTietDatPhong> dsChiTietDatPhong = new ArrayList<ChiTietDatPhong>();

	public static void main(String[] args) {
		initValue();
		answer();
	}

	static void answer() {
		System.out.println("--- Câu 01 ---");
		cauSo1("N01");
		System.out.println();
		System.out.println("--- Câu 02 ---");
		cauSo2("N02");
		System.out.println();
		System.out.println("--- Câu 03 ---");
		cauSo3("N04");
		System.out.println();
		System.out.println("--- Câu 04 ---");
		cauSo4();
		System.out.println();
		System.out.println("--- Câu 05 ---");
		cauSo5();
		System.out.println();
		System.out.println("--- Câu 06 ---");
		cauSo6();
		System.out.println();
		System.out.println("--- Câu 07 ---");
		cauSo7();
		System.out.println();
		System.out.println("--- Câu 08 ---");
		cauSo8();
		System.out.println();
		System.out.println("--- Câu 09 ---");
		cauSo9();
		System.out.println();
		System.out.println("--- Câu 10 ---");
		cauSo10();
		System.out.println();
		System.out.println("--- Câu 11 ---");
		cauSo11("kh01");
		System.out.println();
		System.out.println("--- Câu 12 ---");
		cauSo12();
		System.out.println();
		System.out.println("--- Câu 13 ---");
		cauSo13("kh01");
		System.out.println();
		System.out.println("--- Câu 14 ---");
		cauSo14();
		System.out.println();
		System.out.println("--- Câu 15 ---");
		cauSo15();
		System.out.println();
	}

	static void initValue() {
		taoDsNhomNhanVien();
		taoDsNhanVien();

		dsNhomNhanVien.get(0).setMaTruongNhom("nv01");
		dsNhomNhanVien.get(1).setMaTruongNhom("nv02");
		dsNhomNhanVien.get(2).setMaTruongNhom("nv13");
		dsNhomNhanVien.get(3).setMaTruongNhom("nv10");
		dsNhomNhanVien.get(4).setMaTruongNhom("nv08");

		taoDsDichVu();
		taoDsHoaDon();
		taoDsLoaiPhong();
		taoDsPhong();
		taoDsDatPhong();
		taoDsKhachHang();
		taoDsChucVu();
		taoDsChiTietDatPhong();
	}

	static void taoDsDichVu() {
		dsDichVu.add(new DichVu("dv01", "DV giặt ủi", 50000));
		dsDichVu.add(new DichVu("dv02", "DV ăn uống", 100000));
		dsDichVu.add(new DichVu("dv03", "DV spa", 100000));
		dsDichVu.add(new DichVu("dv04", "DV giải trí", 15000));
	}

	static void taoDsHoaDon() {
		dsHoaDon.add(new HoaDon("hd1", "22/11/2022", 400000));
		dsHoaDon.add(new HoaDon("hd2", "22/11/2022", 1100000));
		dsHoaDon.add(new HoaDon("hd3", "22/11/2022", 700000));
		dsHoaDon.add(new HoaDon("hd4", "22/12/2022", 3500000));

		dsHoaDon.get(0).setDsDV(new ArrayList<DichVu>() {
			{
				add(dsDichVu.get(0));
				add(dsDichVu.get(1));
				add(dsDichVu.get(2));
			}
		});

		dsHoaDon.get(1).setDsDV(new ArrayList<DichVu>() {
			{
				add(dsDichVu.get(1));
			}
		});

		dsHoaDon.get(2).setDsDV(new ArrayList<DichVu>() {
			{
				add(dsDichVu.get(2));
			}
		});

		dsHoaDon.get(3).setDsDV(new ArrayList<DichVu>() {
			{
				add(dsDichVu.get(1));
				add(dsDichVu.get(2));
			}
		});
	}

	static void taoDsLoaiPhong() {
		dsLoaiPhong.add(new LoaiPhong("lp1", "Phòng đơn", 50000));
		dsLoaiPhong.add(new LoaiPhong("lp2", "Phòng đôi", 100000));
		dsLoaiPhong.add(new LoaiPhong("lp3", "Phòng ở 10 người", 100000));
	}

	static void taoDsPhong() {
		dsPhong.add(new Phong("p01", "con", "lp1"));
		dsPhong.add(new Phong("p06", "con", "lp3"));
		dsPhong.add(new Phong("p07", "con", "lp2"));
		dsPhong.add(new Phong("p03", "con", "lp1"));
		dsPhong.add(new Phong("p02", "con", "lp3"));
		dsPhong.add(new Phong("p04", "con", "lp2"));
		dsPhong.add(new Phong("p08", "con", "lp1"));
		dsPhong.add(new Phong("p05", "con", "lp3"));
		dsPhong.add(new Phong("p09", "con", "lp3"));
		dsPhong.add(new Phong("p10", "con", "lp2"));
		dsPhong.add(new Phong("p11", "con", "lp1"));
		dsPhong.add(new Phong("p12", "con", "lp2"));
		dsPhong.add(new Phong("p13", "con", "lp3"));
		dsPhong.add(new Phong("p14", "con", "lp1"));
		dsPhong.add(new Phong("p15", "con", "lp2"));
	}

	static void taoDsDatPhong() {
		dsDatPhong.add(new DatPhong("dp01", "kh01", "p06"));
		dsDatPhong.add(new DatPhong("dp05", "kh01", "p01"));
		dsDatPhong.add(new DatPhong("dp06", "kh01", "p05"));

		dsDatPhong.add(new DatPhong("dp02", "kh02", "p03"));
		dsDatPhong.add(new DatPhong("dp07", "kh02", "p07"));

		dsDatPhong.add(new DatPhong("dp03", "kh03", "p02"));

		dsDatPhong.add(new DatPhong("dp04", "kh04", "p04"));
		dsPhong.forEach(e -> {
			Optional<String> ht = dsDatPhong.stream()
					.filter(n -> n.getMaP().equals(e.getMaP())).map(DatPhong::getMaP)
					.findAny();
			if (ht.isPresent() && ht.get().equals(e.getMaP())) {
				e.setHienTrang("het");
			}
		});
	}

	static void taoDsKhachHang() {
		dsKhachHang.add(new KhachHang("kh01", "Nguyễn Minh", "Nam", "19930201", "Huế",
				"033588291", "0334666919"));
		dsKhachHang.add(new KhachHang("kh02", "Nguyễn Lan", "Nữ", "19941212", "Đà Nẵng",
				"033588292", "0354666918"));
		dsKhachHang.add(new KhachHang("kh03", "Nguyễn Ánh", "Nữ", "19950204",
				"Trà Vinh", "033588293", "0334666917"));
		dsKhachHang.add(new KhachHang("kh04", "Phạm Văn Hải ", "Nam", "19931819",
				"Tiền Giang", "033588294", "0334666916"));
	}

	static void taoDsNhanVien() {
		dsNhanVien.add(new NhanVien("nv01", "cv01", "Trần Linh", "Nữ", "19930401",
				"Trà Vinh", "033588296", "0354666914", "12/12", "N01"));
		dsNhanVien.add(new NhanVien("nv02", "cv02", "Trần Ngọc", "Nữ", "19930501",
				"Cần Thơ", "033288297", "0354666913", "12/12", "N02"));
		dsNhanVien.add(new NhanVien("nv03", "cv03", "Lê Anh Dũng", "Nam", "19930601",
				"Trà Vinh", "033588298", "0354666912", "12/12", "N03"));
		dsNhanVien.add(new NhanVien("nv04", "cv01", "Trần Linh Hoa", "Nữ", "19930701",
				"Bến Tre", "033588299", "0354666911", "12/12", "N01"));
		dsNhanVien.add(new NhanVien("nv05", "cv05", "Trần Ngọc Ân", "Nữ", "19930801",
				"Tiền Giang", "033588281", "0354666921", "Đại học", "N05"));
		dsNhanVien.add(new NhanVien("nv06", "cv01", "Lê Văn Nam", "Nam", "19930819",
				"Huế", "033588265", "0354666466", "Đại học", "N01"));
		dsNhanVien.add(new NhanVien("nv07", "cv02", "Định Thị Nga", "Nữ", "19930607",
				"Đà Nẵng", "033588345", "0354666587", "12/12", "N02"));
		dsNhanVien.add(new NhanVien("nv08", "cv05", "Phạm Hải Nam", "Nam", "19930904",
				"Tiền Giang", "033588212", "0354666989", "Cao đẳng", "N05"));
		dsNhanVien.add(new NhanVien("nv09", "cv02", "Hà Văn Bá", "Nam", "19930105",
				"Hải Phòng", "033588216", "0354666945", "Cao đẳng", "N02"));
		dsNhanVien.add(new NhanVien("nv10", "cv04", "Trần Uyển Linh", "Nữ", "19930603",
				"Nam Định", "033588217", "0354666936", "Đại học", "N04"));
		dsNhanVien.add(new NhanVien("nv11", "cv01", "Hoàng Phương Thảo", "Nữ",
				"19930604", "Đồng Nai", "033588213", "0354666931", "Đại học", "N01"));
		dsNhanVien.add(new NhanVien("nv12", "cv04", "Nguyễn Thanh Tâm", "Nam",
				"19930704", "Cần Thơ", "033588256", "0354666998", "Cao đẳng", "N04"));
		dsNhanVien.add(new NhanVien("nv13", "cv03", "Ngô Ngọc Nga", "Nữ", "19950807",
				"Vĩnh Long", "033588239", "0354666789", "12/12", "N03"));
		dsNhanVien.add(new NhanVien("nv14", "cv02", "Nguyễn Thanh Hải", "Nam",
				"19930702", "Nam Định", "033588321", "0354666456", "Đại học", "N02"));
		dsNhanVien.add(new NhanVien("nv15", "cv01", "Hồ Thanh Tuấn", "Nam", "19930905",
				"Quảng Ngãi", "033588546", "0354666852", "Cao đẳng", "N01"));
		dsNhomNhanVien.forEach(e -> e.setDsNhanVien(
				dsNhanVien.stream().filter(n -> n.getMaNhomNV().equals(e.getMaNhomNV()))
						.collect(Collectors.toList())));
	}

	static void taoDsChucVu() {
		dsChucVu.add(new ChucVu("cv01", "Nhân viên giặt ủi"));
		dsChucVu.add(new ChucVu("cv02", "Nhân viên phục vụ phòng"));
		dsChucVu.add(new ChucVu("cv03", "Nhân viên bảo vệ"));
		dsChucVu.add(new ChucVu("cv04", "Nhân viên vệ sinh"));
		dsChucVu.add(new ChucVu("cv05", "Nhân viên lễ tân"));
	}

	static void taoDsChiTietDatPhong() {
		dsChiTietDatPhong.add(new ChiTietDatPhong("nv01", "hd1", "dp01", 5000000));
		dsChiTietDatPhong.add(new ChiTietDatPhong("nv02", "hd2", "dp02", 6000000));
		dsChiTietDatPhong.add(new ChiTietDatPhong("nv03", "hd3", "dp03", 4500000));
		dsChiTietDatPhong.add(new ChiTietDatPhong("nv04", "hd4", "dp04", 7000000));
		dsChiTietDatPhong.add(new ChiTietDatPhong("nv05", "hd2", "dp05", 5500000));
		dsChiTietDatPhong.add(new ChiTietDatPhong("nv08", "hd3", "dp06", 5500000));
		dsChiTietDatPhong.add(new ChiTietDatPhong("nv10", "hd4", "dp07", 5500000));
	}

	static void taoDsNhomNhanVien() {
		dsNhomNhanVien.add(new NhomNhanVien("N01", "Giặt ủi", "Nhân viên giặt ủi"));
		dsNhomNhanVien
				.add(new NhomNhanVien("N02", "phục vụ", "Nhân viên phục vụ phòng"));
		dsNhomNhanVien.add(new NhomNhanVien("N03", "Bảo vệ", "Nhân viên bảo vệ"));
		dsNhomNhanVien.add(new NhomNhanVien("N04", "Vệ sinh", "Nhân viên vệ sinh"));
		dsNhomNhanVien.add(new NhomNhanVien("N05", "Lễ tân", "Nhân viên lễ tân"));
	}

	// Các câu hỏi truy vấn

	// Cau 1 - Liệt kê danh sách các nhân viên thuộc nhóm nào khi biết mã nhóm nhân
	// viên
	static void cauSo1(String manhom) {
		List<NhanVien> dsNV = dsNhanVien.stream()
				.filter(e -> e.getMaNhomNV().equals(manhom))
				.collect(Collectors.toList());
		if (dsNV.size() == 0) {
			System.out.println("Nhóm chưa có nhân viên nào cả!!!");
		} else {
			System.out.println("Danh sách các nhân viên thuộc nhóm: " + manhom);
			dsNV.forEach(nv -> System.out.println(
					"Mã nhân viên: " + nv.getMaNV() + " -- Họ tên: " + nv.getTenNV()));
		}
	}

	// Cau 2 -In thông tin trưởng nhóm khi biết mã nhóm nhân viên
	static void cauSo2(String maNhomNV) {
		Optional<String> maTruongNhom = dsNhomNhanVien.stream()
				.filter(e -> e.getMaNhomNV().equals(maNhomNV))
				.map(NhomNhanVien::getMaTruongNhom).findFirst();

		if (maTruongNhom.isPresent()) {
			System.out.println(
					"Nhóm: " + maNhomNV + " có trưởng nhóm: " + maTruongNhom.get());

			NhanVien x = dsNhanVien.stream()
					.filter(e -> e.getMaNV().equals(maTruongNhom.get())).findAny()
					.orElse(null);

			System.out.println("Thông tin của nhóm trưởng ");
			System.out.println(
					"Họ tên : " + x.getTenNV() + " có địa chỉ : " + x.getDiaChi());
		} else {
			System.out.println("Không tìm thấy nhóm nhân viên với mã: " + maNhomNV);
		}
	}

	// Cau 3 - Cho biết nhóm có bao nhiêu nhân viên khi biết mã nhóm nhân viên
	static void cauSo3(String maNhomNhanVien) {
		long cnt = dsNhanVien.stream()
				.filter(e -> e.getMaNhomNV().equals(maNhomNhanVien)).count();
		System.out.println("Nhóm " + maNhomNhanVien + " có " + cnt + " thành viên ");
	}

	// Cau 4- Cho biết nhóm nào có nhiều nhân viên nhất
	static void cauSo4() {
		Map<String, Long> mxChucVu = dsNhanVien.stream().collect(
				Collectors.groupingBy(NhanVien::getMaCV, Collectors.counting()));

		Optional<Map.Entry<String, Long>> ans = mxChucVu.entrySet().stream()
				.max(Map.Entry.comparingByValue());

		if (ans.isPresent()) {
			dsChucVu.stream().filter(e -> e.getMaCV().equals(ans.get().getKey()))
					.forEach(e -> System.out.println("Chức vụ có nhiều nhân viên nhất "
							+ e.getTenCV() + " có số lượng nhân viên là "
							+ ans.get().getValue()));
		} else {
			System.out.println("null");
		}
	}

	// câu số 5 : khách hàng nào đã đặt nhiều phòng nhất
	static void cauSo5() {
		Map<String, Long> tmp = dsDatPhong.stream().collect(
				Collectors.groupingBy(DatPhong::getMaKH, Collectors.counting()));

		Optional<Map.Entry<String, Long>> mxCustomer = tmp.entrySet().stream()
				.max(Map.Entry.comparingByValue());

		mxCustomer.ifPresent(kh -> {
			System.out.println("Khách hàng có mã là : " + kh.getKey()
					+ " có số lượng đặt phòng là : " + kh.getValue());
		});
	}

	// Cau 6: Cho biết dịch vụ nào được chưa thực hiện trên tất cả các hóa đơn
	static void cauSo6() {
		Set<String> dvDuocThucHien = dsHoaDon.stream()
				.flatMap(hd -> hd.getDsDV().stream()).map(DichVu::getMaDV)
				.collect(Collectors.toSet());

		List<DichVu> DVchuaThucHien = dsDichVu.stream()
				.filter(e -> !dvDuocThucHien.contains(e.getMaDV()))
				.collect(Collectors.toList());

		if (DVchuaThucHien.size() == 0) {
			System.out.println("Tất cả các dịch vụ đã được thực hiện!!!");
		} else {
			DVchuaThucHien.forEach(dv -> System.out
					.println("Dịch vụ chưa được thực hiện : " + dv.getTenDV()));
		}
	}

	// câu số 7 : Cho biết dịch vụ nào được thực hiện nhiều nhất trên tất cả các
	// hóa đơn

	static void cauSo7() {
		Map<DichVu, Long> dvSoLanThucHien = dsHoaDon.stream()
				.flatMap(hd -> hd.getDsDV().stream())
				.collect(Collectors.groupingBy(dv -> dv, Collectors.counting()));

		Optional<Map.Entry<DichVu, Long>> dvPopular = dvSoLanThucHien.entrySet()
				.stream().max(Map.Entry.comparingByValue());

		dvPopular.ifPresent(dv -> {
			System.out.println("Dịch vụ được thực hiện nhiều nhất là dịch vụ : "
					+ dv.getKey().getTenDV() + " được thực hiện với số lần : "
					+ dv.getValue());
		});
	}

	// Cau 08: Hóa đơn có giá trị lớn nhất - nhỏ nhất >= giá trị trung bình
	static void cauSo8() {
		OptionalDouble average = dsHoaDon.stream().mapToInt(HoaDon::getThanhTien)
				.average();

		dsHoaDon.stream().max(Comparator.comparingInt(HoaDon::getThanhTien))
				.ifPresent(hd -> System.out
						.println("Hợp đồng có trị giá lớn nhất: " + hd.getMaHD()));

		dsHoaDon.stream().min(Comparator.comparingInt(HoaDon::getThanhTien))
				.ifPresent(hd -> System.out
						.println("Hợp đồng có trị giá nhỏ nhất: " + hd.getMaHD()));

		// Tìm các hóa đơn có giá trị >= giá trị trung bình
		if (average.isPresent()) {
			double aveVal = average.getAsDouble();

			List<HoaDon> hoaDonTrungBinh = dsHoaDon.stream()
					.filter(hd -> hd.getThanhTien() >= aveVal)
					.collect(Collectors.toList());

			hoaDonTrungBinh.forEach(hd -> System.out.println("Hóa đơn : " + hd.getMaHD()
					+ " có giá trị hóa đơn lớn hơn hoặc bằng giá trị trung bình: "
					+ hd.getThanhTien()));
		}
	}

	// Cau 09: Danh sách nhân viên không tham gia vào bất kỳ hóa đơn nào
	static void cauSo9() {
		Set<String> nhanvienThamGia = dsChiTietDatPhong.stream()
				.map(ChiTietDatPhong::getMaNV).collect(Collectors.toSet());

		List<NhanVien> nhanVienKhongThamGia = dsNhanVien.stream()
				.filter(nv -> !nhanvienThamGia.contains(nv.getMaNV()))
				.collect(Collectors.toList());

		nhanVienKhongThamGia.forEach(nv -> System.out.println(
				"Mã nhân viên: " + nv.getMaNV() + " -- Họ tên: " + nv.getTenNV()));
	}

	// câu 10: đếm xem còn bao nhiêu phòng trống và in ra mã phòng
	static void cauSo10() {
		List<Phong> dsPhongTrong = dsPhong.stream()
				.filter(e -> e.getHienTrang().equals("con"))
				.collect(Collectors.toList());

		if (dsPhongTrong.isEmpty()) {
			System.out.println("Không có phòng còn trống!!!");
		} else {
			System.out.print("Các phòng còn trống: ");
			dsPhongTrong.forEach(e -> System.out.print(e.getMaP() + " "));
			System.out.println();
		}
	}

	// câu 11:in ra mã phòng của khách hàng có mã ...
	static void cauSo11(String maKhachHang) {
		Set<String> mdp = dsDatPhong.stream()
				.filter(e -> e.getMaKH().compareTo(maKhachHang) == 0)
				.map(DatPhong::getMaP).collect(Collectors.toSet());

		if (mdp.isEmpty()) {
			System.out.println("Không có khách hàng!!!");
		} else {
			System.out
					.print("Khách hàng có mã " + maKhachHang + " đã đặt các mã phòng ");
			mdp.forEach(e -> System.out.print(e + " "));
		}
		System.out.println();
	}

	// Câu 12 : Liệt kê danh sách nhân viên theo từng nhóm nhân viên và tổng số
	// lượng nhân viên trong mỗi nhóm
	static void cauSo12() {
		dsNhomNhanVien.forEach(nhomNV -> {
			List<NhanVien> lNhanVien = dsNhanVien.stream().filter(
					nhanvien -> nhanvien.getMaNhomNV().equals(nhomNV.getMaNhomNV()))
					.collect(Collectors.toList());

			System.out.println("Nhóm nhân viên: " + nhomNV.getTenNhomNhanVien());

			nhomNV.setDsNhanVien(lNhanVien);

			List<NhanVien> danhSachNV = nhomNV.getDsNhanVien();

			// In ra danh sách nhân viên trong nhóm
			danhSachNV.forEach(
					nhanvien -> System.out.println(" - " + nhanvien.getTenNV()));

			// Tính và in ra tổng số lượng nhân viên trong nhóm
			long tongSoLuongNhanVienTrongNhom = danhSachNV.stream().count();
			System.out.println("Tổng số lượng nhân viên trong nhóm: "
					+ tongSoLuongNhanVienTrongNhom);
		});
	}

	// câu 13: mã khách hàng in ra loại phòng đã đặt
	static void cauSo13(String maKH) {
		Set<String> mdp = dsDatPhong.stream()
				.filter(e -> e.getMaKH().compareTo(maKH) == 0).map(DatPhong::getMaP)
				.collect(Collectors.toSet());

		if (mdp.isEmpty()) {
			System.out.println("Không có khách hàng!!!");
		} else {
			Set<String> mlp = dsPhong.stream().filter(e -> mdp.contains(e.getMaP()))
					.map(Phong::getMaLP).collect(Collectors.toSet());

			System.out.println("Khách hàng có mã khách hàng là : " + maKH
					+ " đã đặt các loại phòng là : ");

			dsLoaiPhong.stream().filter(e -> mlp.contains(e.getMaLP()))
					.forEach(e -> System.out.println("loại phòng " + e.getTenLP()));
		}
	}

	// câu 14: Danh sách các nhân viên có tổng thu nhập cao nhất, thấp nhất và >=
	// trung bình
	static void cauSo14() {
		// Tính tổng thu nhập cho mỗi nhân viên
		Map<String, Double> tongThuNhapTheoNV = dsChiTietDatPhong.stream()
				.collect(Collectors.groupingBy(ChiTietDatPhong::getMaNV,
						Collectors.summingDouble(ChiTietDatPhong::getThuNhap)));

		// Tìm thợ có thu nhập cao nhất và thấp nhất
		Optional<Double> maxThuNhap = tongThuNhapTheoNV.values().stream()
				.max(Double::compare);

		Optional<Double> minThuNhap = tongThuNhapTheoNV.values().stream()
				.min(Double::compare);

		// Tính tổng thu nhập trung bình
		double trungBinhThuNhap = tongThuNhapTheoNV.values().stream()
				.mapToDouble(Double::doubleValue).average().orElse(0.0);

		// Lọc ra các nhân viên có thu nhập cao nhất
		System.out.println("Thu nhập cao nhất: " + maxThuNhap.get());
		tongThuNhapTheoNV.entrySet().stream()
				.filter(entry -> entry.getValue().equals(maxThuNhap.orElse(0.0)))
				.forEach(entry -> System.out.println("Mã nhân viên: " + entry.getKey()
						+ " có tổng thu nhập cao nhất: " + entry.getValue()));

		// Lọc ra các nhân viên có thu nhập thấp nhất
		System.out.println("\nThu nhập thấp nhất: " + minThuNhap.get());
		tongThuNhapTheoNV.entrySet().stream()
				.filter(entry -> entry.getValue().equals(minThuNhap.orElse(0.0)))
				.forEach(entry -> System.out.println("Mã nhân viên: " + entry.getKey()
						+ " có tổng thu nhập nhỏ nhất: " + entry.getValue()));

		// Lọc ra các nhân viên có thu nhập hơn trung bình
		System.out.println("\nThu nhập trung bình: " + trungBinhThuNhap);
		tongThuNhapTheoNV.entrySet().stream()
				.filter(entry -> entry.getValue() > trungBinhThuNhap)
				.forEach(entry -> System.out.println("Mã nhân viên: " + entry.getKey()
						+ " có tổng thu nhập lớn hơn trung bình: " + entry.getValue()));

		// Lọc ra các nhóm nhân viên có tổng thu nhập lớn hơn hoặc bằng trung bình
		System.out.println(
				"\nNhóm nhân viên có tổng thu nhập lớn hơn hoặc bằng trung bình:");
		dsNhomNhanVien.stream()
				.filter(nhomTho -> nhomTho.getDsNhanVien().stream().mapToDouble(
						tho -> tongThuNhapTheoNV.getOrDefault(tho.getMaNV(), 0.0))
						.sum() >= trungBinhThuNhap)
				.forEach(nhomNV -> System.out
						.println("Nhóm nhân viên: " + nhomNV.getTenNhomNhanVien()));
	}

	// câu số 15 : sắp xếp các phòng theo loại phòng
	static void cauSo15() {
		dsPhong.stream().sorted((p1, p2) -> p1.getMaLP().compareTo(p2.getMaLP()))
				.forEach(p -> System.out.println("Phòng có mã phòng " + p.getMaP()
						+ " có loại phòng là " + p.getMaLP()));
	}
}
