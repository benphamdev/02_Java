package TTTA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class QLTT {
	public static List<LopHoc> dslop;
	public static List<HocSinh> dshs;
	public static List<ChiTietHD> dschitiethd;
	public static List<CongViec> dscv;
	public static List<GiangVien> dsgv;
	public static List<HopDongDHP> dshddhp;
	public static List<LoaiCV> dsloaicv;
	public static List<NhomGV> dsnhomgv;
	public static List<PhieuThu> dsphieuthu;
	public static void main(String[] args) {
		dslop=new ArrayList<>();
		dshs=new ArrayList<>();
		dschitiethd=new ArrayList<>();
		dscv=new ArrayList<>();
		dsgv=new ArrayList<>();
		dshddhp=new ArrayList<>();
		dsloaicv=new ArrayList<>();
		dsnhomgv=new ArrayList<>();
		dsphieuthu=new ArrayList<>();
		TaoDanhSachNhomGV();
		TaoDSGV();
		TaoDS
		
		

	}
	public static void TaoDanhSachNhomGV() {
		dsnhomgv.add(new NhomGV("N01","nhom 1","day lop thu 1", 3, "gv001"));
		dsnhomgv.add(new NhomGV("N02","nhom 2","day lop thu 2", 3, "gv004"));
		dsnhomgv.add(new NhomGV("N03","nhom 3","day lop thu 3", 3, "gv007")); 
	}
	public static void TaoDSGV() {
		dsgv.add(new GiangVien("gv001","Nguyen van a","Nam", "N01"));
		dsgv.add(new GiangVien("gv002","Nguyen van b","Nam", "N01"));
		dsgv.add(new GiangVien("gv003","Nguyen van c","Nam", "N01"));
		dsgv.add(new GiangVien("gv004","Nguyen van d","Nam", "N02"));
		dsgv.add(new GiangVien("gv005","Nguyen van e","Nam", "N02"));
		dsgv.add(new GiangVien("gv006","Nguyen van f","Nam", "N02"));
		dsgv.add(new GiangVien("gv007","Nguyen van g","Nam", "N03"));
		dsgv.add(new GiangVien("gv008","Nguyen van h","Nam", "N03"));
		dsgv.add(new GiangVien("gv009","Nguyen van j","Nam", "N03"));
		
	}
	public static void TaoDSLop() {
		dslop.add(new LopHoc("L01", "anh sao"));
		dslop.add(new LopHoc("L02", "mat troi"));
		dslop.add(new LopHoc("L03", "mat dat"));
	}
	public static void TaoDSHS() {
		dshs.add(new HocSinh("hs001","Ta su An","0386488748", "L01"));
		dshs.add(new HocSinh("hs002","Pham Chien","0386488748", "L01"));
		dshs.add(new HocSinh("hs003","ta su la","0355468745", "L01"));
		dshs.add(new HocSinh("hs004","Do thuy","0245874512", "L01"));
		dshs.add(new HocSinh("hs005","Nam san","0684554785", "L02"));
		dshs.add(new HocSinh("hs006","Dai toc","0125875654", "L02"));
		dshs.add(new HocSinh("hs007","nam hien","0783645651", "L02"));
		dshs.add(new HocSinh("hs008","van an","0386484646", "L02"));
		dshs.add(new HocSinh("hs009","cua ta","0386478595", "L03"));
		dshs.add(new HocSinh("hs010","tren troi","0386959929", "L03"));
		dshs.add(new HocSinh("hs011","nhin trai","0386488959", "L03"));
		dshs.add(new HocSinh("hs012","nhin phai","0386489794", "L03"));
	}
	public static void TaoDSHDDHP() {
		dshddhp.add(new HopDongDHP("hd01", 500000,"hs001"));
		dshddhp.add(new HopDongDHP("hd02", 500000,"hs002"));
		dshddhp.add(new HopDongDHP("hd03", 500000,"hs003"));
		dshddhp.add(new HopDongDHP("hd04", 500000,"hs004"));
		dshddhp.add(new HopDongDHP("hd05", 500000,"hs005"));
		dshddhp.add(new HopDongDHP("hd06", 500000,"hs006"));
		dshddhp.add(new HopDongDHP("hd07", 500000,"hs007"));
		dshddhp.add(new HopDongDHP("hd08", 500000,"hs008"));
		dshddhp.add(new HopDongDHP("hd09", 500000,"hs009"));
		dshddhp.add(new HopDongDHP("hd10", 500000,"hs010"));
		dshddhp.add(new HopDongDHP("hd11", 500000,"hs011"));
		dshddhp.add(new HopDongDHP("hd12", 500000,"hs012"));
	}
	public static void TaoDSPhieuThu() {
		dsphieuthu.add(new PhieuThu("P001","500000","hd01"));
		dsphieuthu.add(new PhieuThu("P002","500000","hd02"));
		dsphieuthu.add(new PhieuThu("P003","600000","hd03"));
		dsphieuthu.add(new PhieuThu("P004","600000","hd04"));
		dsphieuthu.add(new PhieuThu("P005","1000000","hd05"));
		dsphieuthu.add(new PhieuThu("P006","500000","hd06"));
		dsphieuthu.add(new PhieuThu("P007","500000","hd07"));
		dsphieuthu.add(new PhieuThu("P008","1000000","hd08"));
		dsphieuthu.add(new PhieuThu("P009","500000","hd09"));
		dsphieuthu.add(new PhieuThu("P010","600000","hd10"));
		dsphieuthu.add(new PhieuThu("P011","500000","hd11"));
		dsphieuthu.add(new PhieuThu("P012","1000000","hd12"));
	}
	public static void TaoNhomCV() {
		dsloaicv.add(new LoaiCV("NCV01", "lop bat dau"));
		dsloaicv.add(new LoaiCV("NCV02", "cung co kien thuc"));
		dsloaicv.add(new LoaiCV("NCV03", "tang toc chuan bi thi"));
	}
	public static void TaoCV() {
		dscv.add(new CongViec("CV01", "day tren lop" ));
		dscv.add(new CongViec("CV02", "ho tro day tren lop va chuan bi truoc khi vao lop" ));
		dscv.add(new CongViec("CV03", "cung co ho tro giai bai tren lop va tai nha" ));
	}
	public static void TaoChiTietHD() {
		dschitiethd.add(new ChiTietHD("hd01", "cv01","gv001", 250000));
		dschitiethd.add(new ChiTietHD("hd01", "cv02","gv002", 250000));
		dschitiethd.add(new ChiTietHD("hd01", "cv03","gv003", 250000));
		dschitiethd.add(new ChiTietHD("hd02", "cv01","gv001", 250000));
		dschitiethd.add(new ChiTietHD("hd02", "cv02","gv002", 250000));
		dschitiethd.add(new ChiTietHD("hd02", "cv03","gv003", 250000));
		dschitiethd.add(new ChiTietHD("hd03", "cv01","gv001", 250000));
		dschitiethd.add(new ChiTietHD("hd03", "cv02","gv002", 250000));
		dschitiethd.add(new ChiTietHD("hd03", "cv03","gv003", 250000));
		dschitiethd.add(new ChiTietHD("hd04", "cv01","gv011", 250000));
		dschitiethd.add(new ChiTietHD("hd04", "cv02","gv002", 250000));
		dschitiethd.add(new ChiTietHD("hd04", "cv03","gv003", 250000));
		
		dschitiethd.add(new ChiTietHD("hd05", "cv01","gv004", 250000));
		dschitiethd.add(new ChiTietHD("hd05", "cv02","gv005", 250000));
		dschitiethd.add(new ChiTietHD("hd05", "cv03","gv006", 250000));
		dschitiethd.add(new ChiTietHD("hd06", "cv01","gv004", 250000));
		dschitiethd.add(new ChiTietHD("hd06", "cv02","gv005", 250000));
		dschitiethd.add(new ChiTietHD("hd06", "cv03","gv006", 250000));
		dschitiethd.add(new ChiTietHD("hd07", "cv01","gv004", 250000));
		dschitiethd.add(new ChiTietHD("hd07", "cv02","gv005", 250000));
		dschitiethd.add(new ChiTietHD("hd07", "cv03","gv006", 250000));
		dschitiethd.add(new ChiTietHD("hd08", "cv01","gv004", 250000));
		dschitiethd.add(new ChiTietHD("hd08", "cv02","gv005", 250000));
		dschitiethd.add(new ChiTietHD("hd08", "cv03","gv006", 250000));
		
		dschitiethd.add(new ChiTietHD("hd09", "cv01","gv007", 250000));
		dschitiethd.add(new ChiTietHD("hd09", "cv02","gv008", 250000));
		dschitiethd.add(new ChiTietHD("hd09", "cv03","gv009", 250000));
		dschitiethd.add(new ChiTietHD("hd10", "cv01","gv007", 250000));
		dschitiethd.add(new ChiTietHD("hd10", "cv02","gv008", 250000));
		dschitiethd.add(new ChiTietHD("hd10", "cv03","gv009", 250000));
		dschitiethd.add(new ChiTietHD("hd11", "cv01","gv007", 250000));
		dschitiethd.add(new ChiTietHD("hd11", "cv02","gv008", 250000));
		dschitiethd.add(new ChiTietHD("hd11", "cv03","gv009", 250000));
		dschitiethd.add(new ChiTietHD("hd12", "cv01","gv007", 250000));
		dschitiethd.add(new ChiTietHD("hd12", "cv02","gv008", 250000));
		dschitiethd.add(new ChiTietHD("hd12", "cv03","gv009", 250000));
	}
	//liet ke danh sach giao vien biet manhomgv
	public static void CauSo1(String manhomgv) {
	List<GiangVien> lGV= dsgv
			.stream()
			.filter(GiangVien->GiangVien.getManhomgv().equals(manhomgv))
			.collect(Collectors.toList());
	if(lGV.size()==0) {
		System.out.println("Nhom này chưa có giảng viên");
	} else {
		System.out.println("danh sach cac giảng viên thuoc nhómcó mã " + manhomgv+" :" );
		for(GiangVien gv : lGV) {
			System.out.println("mã giảng viên "+ gv.getMsgv()+"Họ Tên"+ gv.getHotengv());
		}
	}
	}}