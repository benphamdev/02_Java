package test;

import code_a.Example;

public class Test {
	public static void main(String[] args) {
		Example ex = new Example(12, 23);
		System.out.println(ex.getA());

		code_b.Example ex2 = new code_b.Example(1, 20, 3);
		System.out.println(ex2.getC());
	}
}
