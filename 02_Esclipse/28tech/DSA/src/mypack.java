import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class mypack {

	static Node head;
	static Scanner sc = new Scanner(System.in);

	static void push_front(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	static void push_back(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	static Node search(int data) {
		Node tmp = head;
		while (tmp != null) {
			if (tmp.data == data)
				return tmp;
			tmp = tmp.next;
		}
		return null;
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

	static void insert(int idx, int data) {
		int n = size();
		if (idx < 1 || idx > n + 1) {
			return;
		}
		if (idx == 1) {
			push_front(data);
			return;
		}
		Node temp = head;
		for (int i = 1; i <= idx - 2; i++) {
			temp = temp.next;
		}
		Node newNode = new Node(data);
		newNode.next = temp.next;
		temp.next = newNode;
	}

	static void pop_front() {
		if (head == null)
			return;
		head = head.next;
	}

	static void pop_back() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	static void erase(int idx) {
		int n = size();
		if (idx < 1 || idx > n) {
			return;
		} else if (idx == 1) {
			pop_front();
		} else {
			Node temp = head;
			for (int i = 1; i <= idx - 2; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	static void swap(Node x, Node y) {
		int tmp = x.data;
		x.data = y.data;
		y.data = tmp;
	}

//	static void bubbleSort() {
//		if (head == null || head.next == null) {
//			return;
//		}
//		boolean swap = false;
//		Node i = head;
//		do {
//			swap = false;
//			i = head;
//			while (i.next != null) {
//				if (i.data > i.next.data) {
//					int tmp = i.data;
//					i.data = i.next.data;
//					i.next.data = tmp;
//					swap = true;
//				}
//				i = i.next;
//			}
//		} while (swap);
//	}

	static void bubbleSort() {
		if (head == null || head.next == null) {
			return;
		}
		boolean swap = false;
		Node i = head, prev = null;
		do {
			swap = false;
			i = head;
			while (i != null && i.next != null) {
				if (i.data > i.next.data) {
					// swap the nodes without swapping the data
					Node next = i.next;
					i.next = next.next;
					next.next = i;
					if (i == head) {
						head = next;
					} else {
						prev.next = next;
					}
					swap = true;
				}
				prev = i;
				i = i.next;
			}
		} while (swap);
	}

	static void addValueBefore(int data, int x) {
		if (head == null) {
			return;
		}
		if (head.data == x) {
			push_front(data);
		} else {
			Node prev = null;
			Node temp = head;
			while (temp != null) {
				if (temp.data == x) {
					Node newNode = new Node(data);
					newNode.next = temp;
					prev.next = newNode;
				}
				prev = temp;
				temp = temp.next;
			}
		}
	}

	static void addValueAfter(int data, int x) {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null && temp.data != x) {
			temp = temp.next;
		}
		if (temp == null)
			return;
		Node newNode = new Node(data);
		newNode.next = temp.next;
		temp.next = newNode;
	}

	static void deleteNode(int key) {
		Node temp = head, prev = null;
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
	}

	static void deleteBefore(int key) {
		if (head == null || head.next == null) {
			return;
		}
		if (head.next.data == key) {
			head = head.next;
			return;
		}
		Node temp = head, prev = null;
		while (temp != null && temp.next != null && temp.next.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null || temp.next == null) {
			return;
		}
		prev.next = temp.next;
		temp = null;
	}

	static void deleteAfter(int key) {
		if (head == null) {
			return;
		}
		if (head.data == key) {
			head = head.next;
			return;
		}
		Node temp = head, prev = null;
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp.next == null) {
			return;
		}
		prev.next = temp.next;
	}

	static void update(int key, int value) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key) {
				temp.data = value;
			}
			temp = temp.next;
		}
	}

	static void removeAll(int key) {
		if (head == null) {
			return;
		}
		Node temp = head, prev = null;
		while (temp != null) {
			if (temp.data == key) {
				if (prev == null)
					head = head.next;
				else
					prev.next = temp.next;
			} else {
				prev = temp;
			}
			temp = temp.next;
		}
	}

	static void deleteFirstNode(int key) {
		if (head == null) {
			return;
		}
		if (head.data == key) {
			head = head.next;
			return;
		}
		Node temp = head;
		while (temp != null && temp.next != null && temp.next.data != key) {
			temp = temp.next;
		}
		if (temp != null && temp.next != null) {
			temp.next = temp.next.next;
		}
	}

	static void deleteLastNode(int key) {
		if (head == null)
			return;
		if (head.data == key) {
			head = head.next;
			return;
		}
		Node temp = head, prev = null;
		while (temp.next != null) {
			if (temp.next.data == key) {
				prev = temp;
			}
			temp = temp.next;
		}
		if (prev != null && prev.next != null) {
			prev.next = prev.next.next;
		}
	}

	static void updateAllValue(int x, int data) {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null) {
			if (temp.data == x) {
				temp.data = data;
			}
			temp = temp.next;
		}
	}

	static void deleteAllValueAfter(int x, int y) {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null && temp.data != x) {
			temp = temp.next;
		}
		if (temp == null) {
			return;
		}
		Node prev = null;
		while (temp != null) {
			if (temp.data == y) {
				prev.next = temp.next;
			} else
				prev = temp;
			temp = temp.next;
		}
	}

	static Node findMiddle(Node node) {
		Node slow = node, fast = node.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	static Node merge(Node left, Node right) {
		Node res = null;
		if (left == null)
			return right;
		if (right == null)
			return left;
		if (left.data <= right.data) {
			res = left;
			res.next = merge(left.next, right);
		} else {
			res = right;
			res.next = merge(left, right.next);
		}
		return res;
	}

	static Node mergeSort(Node h) {
		if (h == null || h.next == null) {
			return h;
		}
		Node middle = findMiddle(h);
		Node nextOfMiddle = middle.next;

		middle.next = null;

		Node left = mergeSort(h), right = mergeSort(nextOfMiddle);
		return merge(left, right);
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n--------------------------------------");
			System.out.println("-------- 1.chen dau  -------------------");
			System.out.println("-------- 2.chen cuoi -------------------");
			System.out.println("-------- 3.chen giua -------------------");
			System.out.println("-------- 4.xoa dau   -------------------");
			System.out.println("-------- 5.xoa cuoi  -------------------");
			System.out.println("-------- 6.xoa giua  -------------------");
			System.out.println("-------- 7.print     -------------------");
			System.out.println("-------- 8.search    -------------------");
			System.out.println("-------- 9.bubble sort  ----------------");
			System.out.println("--------10.them gt x vao truoc gt y-----");
			System.out.println("--------11.them gt x vao sau gt y-------");
			System.out.println("--------12.xoa gt x---------------------");
			System.out.println("--------13.xoa gt truoc x---------------");
			System.out.println("--------14.xoa gt sau x-----------------");
			System.out.println("--------15.update gt x = y--------------");
			System.out.println("--------16. s2 six----------------------");
			System.out.println("--------17. del five before-------------");
			System.out.println("--------18. del five after--------------");
			System.out.println("--------19. update all value--------------");
			System.out.println("--------20. delete all value y after x--------------");
			System.out.println("--------21. mergeSort--------------");
			System.out.println("--------0.exit--------------------------");

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
				int x = sc.nextInt();
				if (search(x) != null)
					System.out.println("value : " + x);
				else
					System.out.println("NULL");
			} else if (op == 9) {
				bubbleSort();
			} else if (op == 10) {
				int x = sc.nextInt(), y = sc.nextInt();
				addValueBefore(x, y);
			} else if (op == 11) {
				int x = sc.nextInt(), y = sc.nextInt();
				addValueAfter(x, y);
			} else if (op == 12) {
				int x = sc.nextInt();
				deleteNode(x);
			} else if (op == 13) {
				int x = sc.nextInt();
				deleteBefore(x);
			} else if (op == 14) {
				int x = sc.nextInt();
				deleteAfter(x);
			} else if (op == 15) {
				int x = sc.nextInt(), y = sc.nextInt();
				update(x, y);
			} else if (op == 16) {
				removeAll(6);
			} else if (op == 17) {
				deleteFirstNode(5);
			} else if (op == 18) {
				deleteLastNode(5);
			} else if (op == 19) {
				updateAllValue(5, 6);
			} else if (op == 20) {
				int x = sc.nextInt(), y = sc.nextInt();
				deleteAllValueAfter(x, y);
			} else if (op == 21) {
				head = mergeSort(head);
			} else if (op == 22) {
			} else {
				break;
			}
		}
	}
}