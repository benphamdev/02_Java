package code;

public class Sub_Infor extends Infor {
	public void method() {
//		super.a => khong truy cap duoc 
		super.b = 2; // => truy cap dc vi chung 1 pakage
		super.c = 3; // access-modifier
		super.d = 4;
	}
}
