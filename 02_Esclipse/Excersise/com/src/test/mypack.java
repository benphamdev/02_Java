package test;

import programiz.Helper;

public class mypack {
	public static void main(String[] args) {
		double value = 99.5;
		String formattedValue = Helper.getFormattedDollar(value);
		System.out.println("formattedValue = " + formattedValue);
	}
}
