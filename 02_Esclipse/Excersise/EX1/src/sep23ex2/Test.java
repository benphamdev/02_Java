package sep23ex2;

public class Test {
	public static void main(String[] args) {
		System.out.println("-------nhân viên công nhật------");

		nvCongNhat congNhat = new nvCongNhat("1", "truong ai nga", "male", "quang ngai", "12344", 12, 20);
		System.out.println(congNhat);
		System.out.println("Salary : " + congNhat.tienLuong());

		System.out.println("-------nhân viên hợp đồng------");
		nvHopDong hd = new nvHopDong("2", "pham thi truc linh", "femail", "1212", "1212121", 23, 23);
		System.out.println(hd);
		System.out.println("Salary : " + hd.tienLuong());

		System.out.println("-------nhân viên biên chế------");
		nvBienChe bienChe = new nvBienChe("3", "pham duy chien", "male", "brvt", "121212", 12, 12);
		System.out.println(bienChe);
		System.out.println("Salary : " + bienChe.tienLuong());
	}
}
