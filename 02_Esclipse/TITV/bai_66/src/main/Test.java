package main;

public class Test {
	public static void main(String[] args) {
		Box box = new Box<Integer>(15);
		System.out.println(box.getValue());
	}
}
