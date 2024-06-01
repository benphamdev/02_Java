package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	static Scanner sc = new Scanner(System.in);

	void ex() {
		Stack<String> st = new Stack<String>();

//		st.push("pham");
//		st.pop();
//		st.peek();
//		st.clear();
//		st.contains("pham");

		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i) + "");
		}

		for (int i = 0; i < s.length(); i++) {
			System.out.print(st.pop());
		}
	}

	static void ex1() {
		int x = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		while (x > 0) {
			st.push(x % 2);
			x /= 2;
		}
		while (!st.empty()) {
			System.out.print(st.pop());
		}
	}

	public static void main(String[] args) {
//		ex();
		ex1();
	}
}
