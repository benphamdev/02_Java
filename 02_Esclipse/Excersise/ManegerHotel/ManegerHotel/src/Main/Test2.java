package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
	public static List<Service> serviceList = new ArrayList<Service>();
	public static List<Bill> billList = new ArrayList<Bill>();
	public static List<RoomType> roomTypeList = new ArrayList<RoomType>();
	public static List<Room> roomList = new ArrayList<Room>();
	public static List<Booking> bookingList = new ArrayList<Booking>();
	public static List<Customer> customerList = new ArrayList<Customer>();
	public static List<Staff> staffList = new ArrayList<Staff>();
	public static List<Position> positionList = new ArrayList<Position>();
	public static List<StaffGroup> staffGroupList = new ArrayList<StaffGroup>();
	public static List<BookingDetail> bookingDetailList = new ArrayList<BookingDetail>();

	public static void main(String[] args) {
		initValue();
		answer();
	}

	static void answer() {
		System.out.println("Câu 1");
		cauSo1("N04");
		System.out.println();
		System.out.println("Câu 2");
		cauSo2("N02");
		// cauSo2_1("N02");
		System.out.println();
		System.out.println("Câu 3");
		cauSo3();
		// cauSo3_1();
		System.out.println();
		System.out.println("Câu 4");
		cauSo4();
		System.out.println();
		System.out.println("Câu 5");
		cauSo5();
		System.out.println();
		System.out.println("Câu 6");
		cauSo6();
		System.out.println();
		System.out.println("Câu 7");
		cauSo7("kh01");
		System.out.println();
		System.out.println("Câu 8");
		cauSo8();
		System.out.println();
		System.out.println("Câu 9");
		cauSo9();
		System.out.println();
		System.out.println("Câu 10");
		cauSo10();

		System.out.println("\n--- Câu 11 ---");
		cauSo11("N02");
		System.out.println();
		System.out.println("--- Câu 12 ---");
		cauSo12();
		System.out.println();
		System.out.println("--- Câu 13 ---");
		cauSo13();
		System.out.println();
		System.out.println("--- Câu 14 ---");
		cauSo14();
		System.out.println();
		System.out.println("--- Câu 15 ---");
		cauSo15("kh01");
		System.out.println();
		System.out.println("--- Câu 16 ---");
		cauSo16();
		System.out.println();
		System.out.println("--- Câu 17 ---");
		cauSo17();
		System.out.println();
		System.out.println("--- Câu 18 ---");
		cauSo18();
		System.out.println();
		System.out.println("--- Câu 19 ---");
		cauSo19();
		System.out.println();
		System.out.println("--- Câu 20 ---");
		cauSo20("Phòng đơn");
	}

	static void initValue() {
		taoDsStaffGroup();
		taoDsStaff();

		staffGroupList.get(0).setLeaderId("nv01");
		staffGroupList.get(1).setLeaderId("nv02");
		staffGroupList.get(2).setLeaderId("nv03");
		staffGroupList.get(3).setLeaderId("nv10");
		staffGroupList.get(4).setLeaderId("nv08");

		taoserviceList();
		taobillList();
		taoroomTypeList();
		taoroomList();
		taobookingList();
		taocustomerList();
		taoDsChucVu();
		taoDsBookingDetail();
	}

	static void taoserviceList() {
		serviceList.add(new Service("dv01", "DV giặt ủi", 50000));
		serviceList.add(new Service("dv02", "DV ăn uống", 100000));
		serviceList.add(new Service("dv03", "DV spa", 100000));
		serviceList.add(new Service("dv04", "DV giải trí", 15000));
	}

	static void taobillList() {
		billList.add(new Bill("hd1", 400000));
		billList.add(new Bill("hd2", 1100000));
		billList.add(new Bill("hd3", 700000));
		billList.add(new Bill("hd4", 3500000));

		billList.get(0).setServices(new ArrayList<Service>() {
			{
				add(serviceList.get(0));
				add(serviceList.get(1));
				add(serviceList.get(2));
			}
		});

		billList.get(1).setServices(new ArrayList<Service>() {
			{
				add(serviceList.get(1));
			}
		});

		billList.get(2).setServices(new ArrayList<Service>() {
			{
				add(serviceList.get(2));
			}
		});

		billList.get(3).setServices(new ArrayList<Service>() {
			{
				add(serviceList.get(1));
				add(serviceList.get(2));
			}
		});
	}

	static void taoroomTypeList() {
		roomTypeList.add(new RoomType("lp1", "Phòng đơn", 50000));
		roomTypeList.add(new RoomType("lp2", "Phòng đôi", 100000));
		roomTypeList.add(new RoomType("lp3", "Phòng ở 10 người", 100000));
	}

	static void taoroomList() {
		roomList.add(new Room("p01", "con", "lp1"));
		roomList.add(new Room("p06", "con", "lp3"));
		roomList.add(new Room("p07", "con", "lp2"));
		roomList.add(new Room("p03", "con", "lp1"));
		roomList.add(new Room("p02", "con", "lp3"));
		roomList.add(new Room("p04", "con", "lp2"));
		roomList.add(new Room("p08", "con", "lp1"));
		roomList.add(new Room("p05", "con", "lp3"));
		roomList.add(new Room("p09", "con", "lp3"));
		roomList.add(new Room("p10", "con", "lp2"));
		roomList.add(new Room("p11", "con", "lp1"));
		roomList.add(new Room("p12", "con", "lp2"));
		roomList.add(new Room("p13", "con", "lp3"));
		roomList.add(new Room("p14", "con", "lp1"));
		roomList.add(new Room("p15", "con", "lp2"));
	}

	static void taobookingList() {
		bookingList.add(new Booking("dp01", "kh01", "p06"));
		bookingList.add(new Booking("dp05", "kh01", "p01"));
		bookingList.add(new Booking("dp06", "kh01", "p05"));

		bookingList.add(new Booking("dp02", "kh02", "p03"));
		bookingList.add(new Booking("dp07", "kh02", "p07"));

		bookingList.add(new Booking("dp03", "kh03", "p02"));

		bookingList.add(new Booking("dp04", "kh04", "p04"));

		roomList.forEach(e -> {
			Optional<String> ht = bookingList.stream()
					.filter(n -> n.getRoomId().equals(e.getroomId()))
					.map(Booking::getRoomId).findAny();
			if (ht.isPresent() && ht.get().equals(e.getroomId())) {// dk 2 thua
				e.setStatus("het");
			}
		});

	}

	static void taocustomerList() {
		customerList.add(new Customer("kh01", "Nguyễn Minh", "Nam", "1993/02/01", "Huế",
				"033588291", "0334666919"));
		customerList.add(new Customer("kh02", "Nguyễn Lan", "Nữ", "1994/12/12",
				"Đà Nẵng", "033588292", "0354666918"));
		customerList.add(new Customer("kh03", "Nguyễn Ánh", "Nữ", "1995/02/04",
				"Trà Vinh", "033588293", "0334666917"));
		customerList.add(new Customer("kh04", "Phạm Văn Hải ", "Nam", "1993/18/19",
				"Tiền Giang", "033588294", "0334666916"));
	}

	static void taoDsStaff() {
		staffList.add(new Staff("nv01", "cv01", "Hoàng Phương Thảo", "Huế",
				"0354666931", "N01"));
		staffList.add(new Staff("nv02", "cv04", "Nguyễn Thanh Tâm", "Cần Thơ",
				"0354666998", "N04"));
		staffList.add(
				new Staff("nv03", "cv03", "Ngô Ngọc Nga", "Huế", "0354666789", "N03"));
		staffList.add(new Staff("nv04", "cv02", "Nguyễn Thanh Hải", "Nam Định",
				"0354666456", "N02"));
		staffList.add(new Staff("nv05", "cv01", "Hồ Thanh Tuấn", "Quảng Ngãi",
				"0354666852", "N01"));
		staffList.add(
				new Staff("nv06", "cv01", "Lê Văn Nam", "Huế", "0354666466", "N01"));
		staffList.add(new Staff("nv07", "cv02", "Định Thị Nga", "Đà Nẵng", "0354666587",
				"N02"));
		staffList.add(new Staff("nv08", "cv05", "Phạm Hải Nam", "Tiền Giang",
				"0354666989", "N05"));
		staffList.add(new Staff("nv09", "cv02", "Hà Văn Bá", "Hải Phòng", "0354666945",
				"N02"));
		staffList.add(new Staff("nv10", "cv04", "Trần Uyển Linh", "Nam Định",
				"0354666936", "N04"));

		staffGroupList.forEach(e -> e.setStaffList(staffList.stream()
				.filter(n -> n.getStaffGroupId().equals(e.getstaffGroupId()))
				.collect(Collectors.toList())));
	}

	static void taoDsChucVu() {
		positionList.add(new Position("cv01", "Nhân viên giặt ủi"));
		positionList.add(new Position("cv02", "Nhân viên phục vụ phòng"));
		positionList.add(new Position("cv03", "Nhân viên bảo vệ"));
		positionList.add(new Position("cv04", "Nhân viên vệ sinh"));
		positionList.add(new Position("cv05", "Nhân viên lễ tân"));
	}

	static void taoDsBookingDetail() {
		bookingDetailList.add(new BookingDetail("nv01", "hd1", "dp01", 5000000));
		bookingDetailList.add(new BookingDetail("nv02", "hd2", "dp02", 6000000));
		bookingDetailList.add(new BookingDetail("nv03", "hd3", "dp03", 4500000));
		bookingDetailList.add(new BookingDetail("nv04", "hd4", "dp04", 7000000));
		bookingDetailList.add(new BookingDetail("nv05", "hd2", "dp05", 5500000));
		bookingDetailList.add(new BookingDetail("nv08", "hd3", "dp06", 5500000));
		bookingDetailList.add(new BookingDetail("nv10", "hd4", "dp07", 5500000));
	}

	static void taoDsStaffGroup() {
		staffGroupList.add(new StaffGroup("N01", "Giặt ủi", "Nhân viên giặt ủi"));
		staffGroupList.add(new StaffGroup("N02", "phục vụ", "Nhân viên phục vụ phòng"));
		staffGroupList.add(new StaffGroup("N03", "Bảo vệ", "Nhân viên bảo vệ"));
		staffGroupList.add(new StaffGroup("N04", "Vệ sinh", "Nhân viên vệ sinh"));
		staffGroupList.add(new StaffGroup("N05", "Lễ tân", "Nhân viên lễ tân"));
	}

	// Các câu hỏi truy vấn

	// Cau 1 -In thông tin trưởng nhóm khi biết mã nhóm nhân viên
	static void cauSo1(String maNhomNV) {

		Optional<String> maTN = staffGroupList.stream()
				.filter(e -> e.getstaffGroupId().equals(maNhomNV))
				.map(StaffGroup::getLeaderId).findAny();

		if (maTN.isPresent()) {
			System.out.println("Nhóm: " + maNhomNV + " có trưởng nhóm: " + maTN.get());

			Staff nv = staffList.stream().filter(e -> e.getstaffId().equals(maTN.get()))
					.findAny().orElse(null);

			System.out.println("Thông tin của nhóm trưởng ");
			System.out.println("Họ tên : " + nv.getfullName() + " có địa chỉ : "
					+ nv.getAddress());
		} else {
			System.out.println("Không tìm thấy nhóm nhân viên với mã: " + maNhomNV);
		}
	}

	// Cau 2 - Cho biết nhóm có bao nhiêu nhân viên khi biết mã nhóm nhân viên
	static void cauSo2(String maStaffGroup) {
		long cnt = staffList.stream()
				.filter(e -> e.getStaffGroupId().equals(maStaffGroup)).count();
		System.out.println("Nhóm " + maStaffGroup + " có " + cnt + " thành viên ");
	}

	static void cauSo2_1(String maGroup) {
		OptionalInt cnt = staffGroupList.stream()
				.filter(e -> e.getstaffGroupId().equals(maGroup))
				.mapToInt(StaffGroup::getStaffCount).findFirst();
		System.out
				.println("Nhóm " + maGroup + " có " + cnt.getAsInt() + " thành viên ");
	}

	// Cau 3- Cho biết nhóm nào có nhiều nhân viên nhất
	static void cauSo3() {
		Map<String, Long> mxChucVu = staffList.stream().collect(
				Collectors.groupingBy(Staff::getPositionId, Collectors.counting()));

		Optional<Map.Entry<String, Long>> ans = mxChucVu.entrySet().stream()
				.max(Map.Entry.comparingByValue());
		// .max((p1, p2) -> (p1.getValue().compareTo(p2.getValue())));

		if (ans.isPresent()) {
			positionList.stream()
					.filter(e -> e.getpositionId().equals(ans.get().getKey()))
					.forEach(e -> System.out.println("Chức vụ có nhiều nhân viên nhất "
							+ e.getName() + " có số lượng nhân viên là "
							+ ans.get().getValue()));
		} else {
			System.out.println("null");
		}
	}

	static void cauSo3_1() {
		Optional<StaffGroup> ans = staffGroupList.stream()
				.max(Comparator.comparingInt(e -> e.getStaffCount()));

		ans.ifPresent(e -> System.out
				.println(e.getnameStaffGroup() + " " + e.getStaffCount()));
	}

	// Cau 4: Cho biết dịch vụ nào được chưa thực hiện trên tất cả các hóa đơn
	static void cauSo4() {
		Set<String> dvDuocThucHien = billList.stream()
				.flatMap(hd -> hd.getServices().stream()).map(Service::getserviceId)
				.collect(Collectors.toSet());

		List<Service> DVchuaThucHien = serviceList.stream()
				.filter(e -> !dvDuocThucHien.contains(e.getserviceId()))
				.collect(Collectors.toList());

		if (DVchuaThucHien.size() == 0) {
			System.out.println("Tất cả các dịch vụ đã được thực hiện!!!");
		} else {
			DVchuaThucHien.forEach(dv -> System.out
					.println("Dịch vụ chưa được thực hiện : " + dv.getnameService()));
		}
	}

	// Cau 05: Hóa đơn có giá trị lớn nhất - nhỏ nhất >= giá trị trung bình
	static void cauSo5() {
		OptionalDouble average = billList.stream().mapToInt(Bill::getTotal).average();

		billList.stream().max(Comparator.comparingInt(Bill::getTotal))
				.ifPresent(hd -> System.out
						.println("Hợp đồng có trị giá lớn nhất: " + hd.getbillId()));

		billList.stream().min(Comparator.comparingInt(Bill::getTotal))
				.ifPresent(hd -> System.out
						.println("Hợp đồng có trị giá nhỏ nhất: " + hd.getbillId()));

		// Tìm các hóa đơn có giá trị >= giá trị trung bình
		if (average.isPresent()) {
			double aveVal = average.getAsDouble();

			List<Bill> hoaDonTrungBinh = billList.stream()
					.filter(hd -> hd.getTotal() >= aveVal).collect(Collectors.toList());

			hoaDonTrungBinh.forEach(hd -> System.out.println("Hóa đơn : "
					+ hd.getbillId()
					+ " có giá trị hóa đơn lớn hơn hoặc bằng giá trị trung bình: "
					+ hd.getTotal()));
		}
	}

	// câu 6: đếm xem còn bao nhiêu phòng trống và in ra mã phòng
	static void cauSo6() {
		List<Room> roomListTrong = roomList.stream()
				.filter(e -> e.getStatus().equals("con")).collect(Collectors.toList());

		if (roomListTrong.isEmpty()) {
			System.out.println("Không có phòng còn trống!!!");
		} else {
			System.out.print("Các phòng còn trống: ");
			roomListTrong.forEach(e -> System.out.print(e.getroomId() + " "));
			System.out.println(
					"\nCó tổng cộng : " + roomListTrong.size() + " phòng trống");
		}
	}

	// câu 7: Cho biết mã khách hàng in ra loại phòng đã đặt
	static void cauSo7(String maKH) {
		Set<String> mdp = bookingList.stream()
				.filter(e -> e.getCustomerId().compareTo(maKH) == 0)
				.map(Booking::getRoomId).collect(Collectors.toSet());

		if (mdp.isEmpty()) {
			System.out.println("Không có khách hàng!!!");
		} else {
			Set<String> mlp = roomList.stream().filter(e -> mdp.contains(e.getroomId()))
					.map(Room::getRoomTypeId).collect(Collectors.toSet());

			System.out.println("Khách hàng có mã khách hàng là : " + maKH
					+ " đã đặt các loại phòng là : ");

			roomTypeList.stream().filter(e -> mlp.contains(e.getroomTypeId())).forEach(
					e -> System.out.println("loại phòng " + e.getnameRoomType()));
		}
	}

	// Câu 8: Liệt kê tất cả những nhân viên có địa chỉ là "Huế" và số lượng đặt
	// phòng của họ.
	static void cauSo8() {
		Map<String, Long> soLuongDatPhongTheoNhanVien = bookingDetailList.stream()
				.collect(Collectors.groupingBy(BookingDetail::getStaffId,
						Collectors.counting()));

		List<String> nhanVienHue = staffList.stream()
				.filter(e -> e.getAddress().equals("Huế"))
				.map(e -> "Nhân viên " + e.getfullName() + " có số lượng đặt phòng là "
						+ soLuongDatPhongTheoNhanVien.getOrDefault(e.getstaffId(), 0L))
				.collect(Collectors.toList());

		nhanVienHue.forEach(e -> System.out.println(e));
	}

	// câu 9 : Liệt kê danh sách nhân viên theo từng nhóm nhân viên và tổng số
	// lượng nhân viên trong mỗi nhóm
	static void cauSo9() {
		// staffGroupList.forEach(nhomNV -> {
		// // List<Staff> lNhanVien = staffList.stream()
		// // .filter(nhanvien -> nhanvien.getStaffGroupId()
		// // .equals(nhomNV.getstaffGroupId()))
		// // .collect(Collectors.toList());
		// //
		// // nhomNV.setStaffList(lNhanVien);

		// System.out.println("Nhóm nhân viên: " + nhomNV.getnameStaffGroup());
		// List<Staff> danhSachNV = nhomNV.getStaffList();

		// // In ra danh sách nhân viên trong nhóm
		// danhSachNV.forEach(
		// nhanvien -> System.out.println(" - " + nhanvien.getfullName()));

		// // Tính và in ra tổng số lượng nhân viên trong nhóm
		// long tongSoLuongNhanVienTrongNhom = danhSachNV.stream().count();
		// System.out.println("Tổng số lượng nhân viên trong nhóm: "
		// + tongSoLuongNhanVienTrongNhom);
		// });

		staffGroupList.forEach(nhomNV -> {
			System.out.println("Nhóm nhân viên: " + nhomNV.getnameStaffGroup());

			List<Staff> dsNV = nhomNV.getStaffList();
			dsNV.forEach(nv -> System.out.println(" - " + nv.getfullName()));

			long ans = nhomNV.getStaffCount();

			System.out.println("Tổng số lượng nhân viên trong nhóm: " + ans);
		});
	}

	// câu 10 : In ra thu nhập của tất cả các nhân viên theo tên
	static void cauSo10() {
		Map<String, Double> thuNhapTheoNhanVien = bookingDetailList.stream()
				.collect(Collectors.groupingBy(BookingDetail::getStaffId,
						Collectors.summingDouble(BookingDetail::getIncome)));

		System.out.println("Thu nhập của từng nhân viên:");

		thuNhapTheoNhanVien.forEach((maNhanVien, thuNhap) -> System.out
				.println("Nhân viên " + maNhanVien + ": " + Math.round(thuNhap)));
	}

	// them
	// Cau 1 - Liệt kê danh sách các nhân viên thuộc nhóm nào khi biết mã nhóm
	// nhân viên
	static void cauSo11(String manhom) {
		List<Staff> dsNV = staffList.stream()
				.filter(e -> e.getStaffGroupId().equals(manhom))
				.collect(Collectors.toList());

		if (dsNV.size() == 0) {
			System.out.println("Nhóm chưa có nhân viên nào cả!!!");
		} else {
			System.out.println("Danh sách các nhân viên thuộc nhóm: " + manhom);
			dsNV.forEach(nv -> System.out.println("Mã nhân viên: " + nv.getstaffId()
					+ " -- Họ tên: " + nv.getAddress()));
		}
	}

	// câu số 2 : khách hàng nào đã đặt nhiều phòng nhất
	static void cauSo12() {
		Map<String, Long> tmp = bookingList.stream().collect(
				Collectors.groupingBy(Booking::getCustomerId, Collectors.counting()));

		Optional<Map.Entry<String, Long>> mxCustomer = tmp.entrySet().stream()
				.max(Map.Entry.comparingByValue());

		mxCustomer.ifPresent(kh -> {
			System.out.println("Khách hàng có mã là : " + kh.getKey()
					+ " có số lượng đặt phòng là : " + kh.getValue());
		});
	}

	// câu số 3 : Cho biết dịch vụ nào được thực hiện nhiều nhất trên tất cả các
	// hóa đơn
	static void cauSo13() {
		Map<Service, Long> dvSoLanThucHien = billList.stream()
				.flatMap(hd -> hd.getServices().stream())
				.collect(Collectors.groupingBy(hd -> hd, Collectors.counting()));

		Optional<Map.Entry<Service, Long>> dvPopular = dvSoLanThucHien.entrySet()
				.stream().max(Map.Entry.comparingByValue());

		dvPopular.ifPresent(dv -> {
			System.out.println("Dịch vụ được thực hiện nhiều nhất là dịch vụ : "
					+ dv.getKey().getnameService() + " được thực hiện với số lần : "
					+ dv.getValue());

		});
	}

	// Cau 04: Danh sách nhân viên không tham gia vào bất kỳ hóa đơn nào??

	static void cauSo14() {
		Set<String> nhanvienThamGia = bookingDetailList.stream()
				.map(BookingDetail::getStaffId).collect(Collectors.toSet());

		List<Staff> nhanVienKhongThamGia = staffList.stream()
				.filter(nv -> !nhanvienThamGia.contains(nv.getstaffId()))
				.collect(Collectors.toList());

		nhanVienKhongThamGia.forEach(nv -> System.out.println("Mã nhân viên: "
				+ nv.getstaffId() + " -- Họ tên: " + nv.getfullName()));

		Set<String> NVtg = bookingDetailList.stream().map(BookingDetail::getStaffId)
				.collect(Collectors.toSet());

		if (NVtg.size() == 0) {

		} else {
			List<Staff> nvKhongThamGia = staffList.stream()
					.filter(e -> !NVtg.contains(e.getstaffId()))
					.collect(Collectors.toList());

			nvKhongThamGia.forEach(nv -> System.out.println("Mã nhân viên: "
					+ nv.getstaffId() + " -- Họ tên: " + nv.getfullName()));
		}
	}

	// cau 05:in ra mã phòng của khách hàng có mã ...
	static void cauSo15(String maKhachHang) {
		Set<String> madp = bookingList.stream()
				.filter(e -> e.getCustomerId().equals(maKhachHang))
				.map(Booking::getRoomId).collect(Collectors.toSet());// chua cac
																		// ma
																		// phong
		System.out.print("Khách hàng có mã " + maKhachHang + " đã đặt phòng: ");

		madp.forEach(e -> System.out.print(e + " "));
	}

	// câu 7: Danh sách các nhân viên có tổng thu nhập cao nhất, thấp nhất và >=
	// trung bình

	static void cauSo16() {
		// Tính tổng thu nhập cho mỗi nhân viên
		Map<String, Double> tongThuNhapTheoNV = bookingDetailList.stream()
				.collect(Collectors.groupingBy(BookingDetail::getStaffId,
						Collectors.summingDouble(BookingDetail::getIncome)));

		// Tìm nhân viên có thu nhập cao nhất và thấp nhất
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

		// Lọc ra các nhân viên có thu nhập lớn hơn trung bình
		System.out.println("\nThu nhập trung bình: " + trungBinhThuNhap);
		tongThuNhapTheoNV.entrySet().stream()
				.filter(entry -> entry.getValue() > trungBinhThuNhap)
				.forEach(entry -> System.out.println("Mã nhân viên: " + entry.getKey()
						+ " có tổng thu nhập lớn hơn trung bình: " + entry.getValue()));

		// Lọc ra các nhóm nhân viên có tổng thu nhập nhỏ hơn hoặc bằng trung
		// bình
		System.out.println(
				"\nNhóm nhân viên có tổng thu nhập lớn hơn hoặc bằng trung bình:");
		staffGroupList.stream()
				.filter(nhomNV -> nhomNV.getStaffList().stream()
						.mapToDouble(nhanvien -> tongThuNhapTheoNV
								.getOrDefault(nhanvien.getstaffId(), 0.0))
						.sum() >= trungBinhThuNhap)
				.forEach(nhomNV -> System.out
						.println("Nhóm nhân viên: " + nhomNV.getInfoGroup()));
	}

	// câu số 8 : sắp xếp các phòng theo loại phòng
	static void cauSo17() {
		roomList.stream()
				.sorted((p1, p2) -> p1.getRoomTypeId().compareTo(p2.getRoomTypeId()))
				.forEach(
						p -> System.out.println("Phòng có mã phòng " + p.getRoomTypeId()
								+ " có loại phòng là " + p.getRoomTypeId()));
	}

	// câu số 18 : để lấy ra danh sách các mã khách hàng đã đặt phòng trong khách
	// sạn và sắp xếp theo thứ tự giảm dần của số tiền trong hóa đơn tương ứng
	static void cauSo18() {
		Map<String, Double> mdp = bookingDetailList.stream().collect(Collectors
				.toMap(BookingDetail::getBookingId, BookingDetail::getIncome));

		List<String> ans = bookingList.stream()
				.filter(e -> mdp.containsKey(e.getbookingId()))
				.sorted(Comparator
						.comparingDouble(b -> mdp.getOrDefault(b.getRoomId(), 0.0)))
				.map(e -> "mã khách hàng " + e.getCustomerId()
						+ " có hóa đơn số tiền là : " + mdp.get(e.getbookingId()))
				.collect(Collectors.toList());

		Collections.reverse(ans);
		ans.forEach(e -> System.out.println(e));
	}

	// Câu số 19 : Tìm danh sách tất cả các dịch vụ có doanh thu cao nhất
	static void cauSo19() {
		Map<String, Double> serviceRevenueMap = billList.stream()
				.flatMap(s -> s.getServices().stream())
				.collect(Collectors.groupingBy(Service::getnameService,
						Collectors.summingDouble(Service::getPrice)));

		double maxRevenue = serviceRevenueMap.values().stream().max(Double::compareTo)
				.orElse(0.0);

		// double maxRevenue = serviceRevenueMap.values().stream()
		// .max(Comparator.naturalOrder()).orElse(0.0);

		List<String> mostProfitableServices = serviceRevenueMap.entrySet().stream()
				.filter(entry -> entry.getValue() == maxRevenue).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println("Danh sách các dịch vụ có doanh thu cao nhất: ");
		mostProfitableServices.forEach(e -> System.out.print(e + " "));
	}

	// câu số 20 : Tìm danh sách tất cả các hóa đơn của một loại phòng nhất định.
	static void cauSo20(String lp) {
		Set<String> maLPhong = roomTypeList.stream()
				.filter(e -> e.getnameRoomType().equals(lp))
				.map(RoomType::getroomTypeId).collect(Collectors.toSet());

		if (maLPhong.size() == 0) {
			System.out.println("oke");
		} else {
			Set<String> mP = roomList.stream()
					.filter(e -> maLPhong.contains(e.getRoomTypeId()))
					.map(Room::getroomId).collect(Collectors.toSet());

			Set<String> maDP = bookingList.stream()
					.filter(e -> mP.contains(e.getRoomId())).map(Booking::getbookingId)
					.collect(Collectors.toSet());

			Set<String> ans = bookingDetailList.stream()
					.filter(e -> maDP.contains(e.getBookingId()))
					.map(BookingDetail::getBillId).collect(Collectors.toSet());

			ans.forEach(e -> System.out.print(e + " "));
			// billList.stream().filter(e -> !maDP.contains(e.getBookingId()))
			// .forEach(e -> System.out.print(e.getbillId() + " "));
		}
	}
}