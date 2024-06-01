package deSo1Thu7;

public class Test {
	public static void main(String[] args) {
		HangSanXuatXeXayDung[] hangSanXuatXeXayDungs = HangSanXuatXeXayDung.values();

		XeXuc xeXuc = new XeXuc(1.2, "red", "22", "new", 123, hangSanXuatXeXayDungs, 2.3);
		System.out.println(xeXuc);

		XeLu xeLu = new XeLu(3.2, "white", "23", "old", 12, hangSanXuatXeXayDungs, 0);
		System.out.println(xeLu);

		XeCau xeCau = new XeCau(3.4, "black", "we", "likenew", 2, hangSanXuatXeXayDungs, 3);
		System.out.println(xeCau);
	}
}
