package DoublyLinkedList;

import java.util.Scanner;

class Node {
	int data;
	Node prev, next;

	Node(int data) {
		this.data = data;
	}
}

public class mypack1 {
	static Scanner sc = new Scanner(System.in);
	static Node head;

	static void push_front(int x) {
		Node newNode = new Node(x);
		newNode.next = head;
		if (head != null)
			head.prev = newNode;
		head = newNode;
	}

	static void push_back(int x) {
		Node newNode = new Node(x);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	static void insert(int idx, int x) {
		int n = size();
		if (idx < 1 || idx > n + 1)
			return;
		if (idx == 1) {
			push_front(x);
			return;
		}
		Node temp = head;
		for (int i = 1; i <= idx - 1; i++) {
			temp = temp.next;
		}
		Node newNode = new Node(x);
		newNode.prev = temp.prev;
		temp.prev.next = newNode;
		temp.prev = newNode;
		newNode.next = temp;
	}

	static void pop_front() {
		if (head == null) {
			return;
		}
		head = head.next;
		if (head != null) {
			head.prev = null;
		}
	}

	static void pop_back() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.prev.next = null;
	}

	static void erase(int idx) {
		int n = size();
		if (idx < 1 || idx > n)
			return;
		if (idx == 1) {
			pop_front();
		} else {
			Node temp = head;
			for (int i = 1; i <= idx - 1; i++)
				temp = temp.next;
			temp.prev.next = temp.next;
			if (temp.next != null)
				temp.next.prev = temp.prev;
		}
	}

	static void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	static int size() {
		int cnt = 0;
		Node temp = head;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}

	static Node search(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	static void addALLValueBefore(int x, int data) {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null) {
			if (temp.data == x) {
				Node newNode = new Node(data);
				if (temp.prev != null) {
					temp.prev.next = newNode;
					newNode.prev = temp.prev;
					temp.prev = newNode;
					newNode.next = temp;
				} else {
					push_front(data);
				}
			}
			temp = temp.next;
		}
	}

	static void addValueBefore(int x, int data) {
		if (head == null)
			return;
		Node cur = search(x);
		if (cur == null) {
			return;
		}
		Node newNode = new Node(data);
		if (cur.prev != null) {
			cur.prev.next = newNode;
			newNode.prev = cur.prev;
		} else
			head = newNode;
		newNode.next = cur;
		cur.prev = newNode;
	}

	static void addValueAfter(int x, int data) {
		if (head == null) {
			return;
		}
		Node temp = search(x);
		if (temp == null) {
			return;
		}
		Node newNode = new Node(data);
		if (temp.next != null) {
			temp.next.prev = newNode;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		newNode.prev = temp;
	}

	static void deleteNodeBefore(int x) {
		if (head == null) {
			return;
		}
		Node cur = search(x);
		if (cur == null || cur.prev == null) {
			return;
		}
		Node prevNode = cur.prev;
		prevNode.prev.next = cur;
		cur.prev = prevNode.prev;
	}

	static void deleteNodeAfter(int x) {
		if (head == null)
			return;
		Node cur = search(x);
		if (cur == null || cur.next == null)
			return;
		if (cur.next.next != null) {
			cur.next.next.prev = cur.prev;
			cur.next = cur.next.next;
		} else {
			cur.next = null;
		}
	}

	static void deleteNode(int x) {
		if (head == null)
			return;
		if (head.data == x) {
			if (head.next != null) {
				head.next.prev = null;
			}
			head = head.next;
			return;
		}
		Node temp = head;
		while (temp != null && temp.data != x)
			temp = temp.next;
		if (temp == null) {
			return;
		}
		if (temp.next != null) {
			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;
		} else {
			temp.prev.next = null;
		}
	}

	static void updateAllValue(int target, int alter) {
		if (head == null)
			return;
		Node temp = head;
		while (temp != null) {
			if (temp.data == target) {
				temp.data = alter;
			}
			temp = temp.next;
		}
	}

	static void swap(Node x, Node y) {
		int tmp = x.data;
		x.data = y.data;
		y.data = tmp;
	}

	static void bubbleSort() {
		Node cur = head;
		boolean flag = true;
		do {
			flag = false;
			cur = head;
			while (cur.next != null) {
				if (cur.data > cur.next.data) {
					swap(cur, cur.next);
					flag = true;
				}
				cur = cur.next;
			}
		} while (flag);
	}

	static Node getMiddle(Node h) {
		Node fast = h.next, slow = h;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	static Node merge(Node l, Node r) {
		if (l == null)
			return r;
		if (r == null)
			return l;
		Node res = null;
		if (l.data <= r.data) {
			res = l;
			res.next = merge(l.next, r);
		} else {
			res = r;
			res.next = merge(l, r.next);
		}
		return res;
	}

	static Node mergeSort(Node h) {
		if (h == null || h.next == null) {
			return h;
		}
		Node mid = getMiddle(h), nextOfMid = mid.next;
		mid.next = null;
		Node l = mergeSort(h), r = mergeSort(nextOfMid);
		return merge(l, r);
	}

	static void deleteFirstNode(int x) {
		if (head == null)
			return;
		Node cur = search(x);
		if (cur == null)
			return;
		deleteNode(x);
	}

	static void deleteLastNode(int x) {
		if (head == null)
			return;
		Node temp = head, res = null;
		while (temp != null) {
			if (temp.data == x) {
				res = temp;
			}
			temp = temp.next;
		}
		if (res == null)
			return;
		if (res.next != null) {
			if (res.prev != null) {
				res.next.prev = res.prev;
				res.prev.next = res.next;
			} else {
				pop_front();
			}
		} else {
			res.prev.next = null;
		}
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("\n-----------------------------");
			System.out.println("1.insertFront----------");
			System.out.println("2.append---------------");
			System.out.println("3.insertion------------");
			System.out.println("4.xoa dau--------------");
			System.out.println("5.xoa cuoi-------------");
			System.out.println("6.xoa giua-------------");
			System.out.println("7.print----------------");
			System.out.println("8.Thêm node có giá trị x vào trước node có giá trị y."
					+ "\n9.Thêm node có giá trị x vào sau node có giá trị y."
					+ "\n10.Xóa node trước node có giá trị x."
					+ "\n11.Xóa node sau node có giá trị x."
					+ "\n12.Xóa 1 node đầu và cuối sau node có giá trị x ."
					+ "\n13.Update node có giá trị x = node có giá trị y"
					+ "\n14.Tim kiếm node có giá trị x."
					+ "\n15.Sắp xếp danh sách liên kết theo BubbleSort."
					+ "\n16.Sắp xếp danh sách liên kết theo MergeSort"
					+ "\n17. delete meet first node" + "\n18. delete meet last node"
					+ "\n0.Thoát.");
			System.out.println("--------0.exit-----------------");
			int op = sc.nextInt();
			if (op == 1) {
				int x = sc.nextInt();
				push_front(x);
			} else if (op == 2) {
				int x = sc.nextInt();
				push_back(x);
			} else if (op == 3) {
				int idx = sc.nextInt(), x = sc.nextInt();
				insert(idx, x);
			} else if (op == 4) {
				pop_front();
			} else if (op == 5) {
				pop_back();
			} else if (op == 6) {
				int idx = sc.nextInt();
				erase(idx);
			} else if (op == 7) {
				print();
			} else if (op == 8) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				System.out.println("Nhập giá trị data: ");
				int y = sc.nextInt();
				addValueBefore(x, y);
			} else if (op == 9) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				System.out.println("Nhập data y: ");
				int y = sc.nextInt();
				addValueAfter(x, y);
			} else if (op == 10) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				deleteNodeBefore(x);
			} else if (op == 11) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				deleteNodeAfter(x);
			} else if (op == 12) {
				int x = sc.nextInt();
				deleteNode(x);
			} else if (op == 13) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				System.out.println("Nhập giá trị y: ");
				int y = sc.nextInt();
				updateAllValue(x, y);
			} else if (op == 14) {
				int x = sc.nextInt();
				if (search(x) != null)
					System.out.println("oke");
				else
					System.out.println("null");
			} else if (op == 15) {
				bubbleSort();
			} else if (op == 16) {
				head = mergeSort(head);
			} else if (op == 17) {
				deleteFirstNode(1);
			} else if (op == 18) {
				deleteLastNode(1);
			} else {
				break;
			}
		}
	}
}
