package test;

import code.Infor;

public class Sub_Infor2 extends Infor {
	public void method() {
//		super.b => no access-modifier
		super.c = 1; // access-modifier
	}
}
