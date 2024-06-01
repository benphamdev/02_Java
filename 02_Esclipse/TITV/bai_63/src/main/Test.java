package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
	void ex() {
		Queue<String> ds = new LinkedList<String>();
		ds.offer("pham chien");
		ds.offer("ai nga");
		ds.offer("tlinh");

		while (true) {
			String head = ds.poll();
			if (head == null)
				break;
			System.out.println(head);
		}
	}

	static void ex1() {
		Queue<String> ds = new PriorityQueue<String>();
		ds.offer("pham chien");
		ds.offer("ai nga");
		ds.offer("tlinh");

		while (true) {
			String head = ds.poll();
			if (head == null)
				break;
			System.out.println(head);
		}
	}

	static void ex2() {
		Deque<String> ds = new ArrayDeque<String>();
		ds.offerFirst("pham chien");
		ds.offerLast("ai nga");
		ds.offer("tlinh");

		while (true) {
			String head = ds.poll();
			if (head == null)
				break;
			System.out.println(head);
		}
	}

	public static void main(String[] args) {
//		ex();
//		ex1();
		ex2();
	}
}
