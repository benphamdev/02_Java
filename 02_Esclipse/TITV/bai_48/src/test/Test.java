package test;

import code.Infor;

public class Test {
	private Infor infor;

	public void method() {
//		this.infor.a => ko truy cap dc 
//		this.infor.b => ko truy cap dc
//		this.infor.c; // no access-modifier
		this.infor.d = 1;
	}
}
