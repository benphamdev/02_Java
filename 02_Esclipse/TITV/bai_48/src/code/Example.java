package code;

public class Example {
	private Infor infor;

	public void method() {
//		this.infor.a // ko truy xuat duoc a
		this.infor.b = 2; // => truy cap dc
		this.infor.c = 3; // access modifier
		this.infor.d = 4;
	}
}
