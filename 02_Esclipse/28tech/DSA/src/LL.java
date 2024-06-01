
import java.util.Scanner;

//class Node {
//	int data;
//	Node next;
//
//	Node(int d) {
//		data = d;
//		next = null;
//	}
//}

public class LL {
	static Scanner sc = new Scanner(System.in);

	static Node head;

	public static int search(int key) {
		Node temp = head;
		int cnt = 1;
		while (temp != null) {
			if (temp.data == key) {
				return cnt;
			}
			cnt++;
			temp = temp.next;
		}
		return -1;
	}

	static void swap(Node x, Node y) {
		int tmp = x.data;
		x.data = y.data;
		y.data = tmp;
	}

	public static void pushFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public static void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}

	public static void insert(int idx, int x) {
		int n = size();
		if (idx < 1 || idx > n + 1)
			return;
		if (idx == 1) {
			pushFront(x);
			return;
		}
		Node tmp = head;
		for (int i = 1; i <= idx - 2; i++) {
			tmp = tmp.next;
		}
		Node newNode = new Node(x);
		newNode.next = tmp.next;
		tmp.next = newNode;
	}

	static void popFront() {
		if (head == null)
			return;
		head = head.next;
	}

	static void popBack() {
		Node temp = head;
		if (head == null) {
			return;
		}
		if (temp.next == null) {
			head = null;
			return;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	static void erase(int idx) {
		int n = size();
		if (idx < 1 || idx > n)
			return;
		else if (idx == 1)
			popFront();
		else {
			Node temp = head;
			for (int i = 1; i <= idx - 2; i++) {
				temp = temp.next;
			}
			Node kth = temp.next;
			temp.next = kth.next;
//			temp.next = temp.next.next;
		}
	}

	static void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	static int size() {
		int cnt = 0;
		Node tmp = head;
		while (tmp != null) {
			tmp = tmp.next;
			cnt++;
		}
		return cnt;
	}

	static void updateVal(int idx, int val) {
		Node temp = head;
		for (int i = 1; i <= idx - 1; i++) {
			temp = temp.next;
		}
		temp.data = val;
	}

	static void updateNodeValue(int x, int y) {
		Node current = head;

		while (current != null) {
			if (current.data == x) {
				// Tìm thấy node có giá trị x, cập nhật giá trị thành y
				current.data = y;
			}
			current = current.next;
		}
	}

	static void removeByValue(int value) {
		int count = size();
		if (size() == 0) {
			return;
		} else if (count == 1) {
			if (head.data == value) {
				head = null;
			}
		} else {
			Node current = head;
			Node prev = null;

			while (current != null) {
				if (current.data == value) {
					if (prev == null) {
						head = current.next;
					} else {
						prev.next = current.next;
					}
				} else {
					prev = current;
				}
				current = current.next;
			}
		}
	}

	static void deleteNodeAfterValue(int value) {
		Node current = head;
		if (head == null) {
			return;
		}
		if (head.data == value) {
			head = head.next;
			return;
		}
		while (current != null && current.next.data != value) {
			current = current.next;
		}
		if (current != null && current.next != null) {
			current.next = current.next.next;
		}
	}

	static void deleteNodesAfterX(int x, int y) {
		if (head == null) {
			return;
		}
		Node current = head;
		// Tìm nút có giá trị x
		while (current != null && current.data != x) {
			current = current.next;
		}
		if (current == null) {
			return;
		}
		Node temp = current.next;
		while (temp != null && temp.data == y) {
			temp = temp.next;
		}
		current.next = temp;
	}

	static void deleteLastNodeAfterValue(int value) {
		Node current = head;
		Node nodeToDelete = null;
		while (current.next != null) {
			if (current.next.data == value) {
				nodeToDelete = current;
			}
			current = current.next;
		}
		if (nodeToDelete != null && nodeToDelete.next != null) {
			nodeToDelete.next = nodeToDelete.next.next;
		}
	}

	static void bubbleSort() {
		if (head == null || head.next == null) {
			return;
		}
		boolean swapped;
		Node current;
		do {
			swapped = false;
			current = head;

			while (current.next != null) {
				if (current.data > current.next.data) {
					swap(current, current.next);
					swapped = true;
				}
				current = current.next;
			}

		} while (swapped);
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
		Node result = null;

		if (left == null) {
			return right;
		}

		if (right == null) {
			return left;
		}

		if (left.data >= right.data) {
			result = left;
			result.next = merge(left.next, right);
		} else {
			result = right;
			result.next = merge(left, right.next);
		}

		return result;
	}

	static Node mergeSortRecursive(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node middle = findMiddle(node);
		Node nextOfMiddle = middle.next;

		middle.next = null;

		Node left = mergeSortRecursive(node);
		Node right = mergeSortRecursive(nextOfMiddle);

		return merge(left, right);
	}

	static void mergeSort() {
		if (head == null || head.next == null) {
			return;
		}
		head = mergeSortRecursive(head);
	}

	public static void main(String[] args) {
		LL ll = new LL();
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
				pushFront(x);
			} else if (op == 2) {
				int x = sc.nextInt();
				append(x);
			} else if (op == 3) {
				int idx = sc.nextInt(), x = sc.nextInt();
				insert(idx, x);
			} else if (op == 4) {
				popFront();
			} else if (op == 5) {
				popBack();
			} else if (op == 6) {
				int idx = sc.nextInt();
				erase(idx);
			} else if (op == 7) {
				printList();
			} else if (op == 8) {
				int x = sc.nextInt();
				if (search(x) != -1)
					System.out.println("value : " + x);
				else
					System.out.println("NULL");
			} else if (op == 9) {
				bubbleSort();
			} else if (op == 10) {
				int x = sc.nextInt(), y = sc.nextInt();
				int tmp = search(y);
				if (tmp != -1) {
					insert(tmp, x);
				} else {
					System.out.println("ko co gia tri y");
				}
			} else if (op == 11) {
				int x = sc.nextInt(), y = sc.nextInt();
				int tmp = search(y);
				if (tmp != -1) {
					insert(tmp + 1, x);
				} else {
					System.out.println("ko co gia tri y");
				}
			} else if (op == 12) {
				int x = sc.nextInt();
				int tmp = search(x);
				if (tmp != -1) {
					erase(tmp);
				} else {
					System.out.println("ko co gia tri x");
				}
			} else if (op == 13) {
				int x = sc.nextInt();
				int tmp = search(x);
				if (tmp != -1) {
					erase(tmp - 1);
				} else {
					System.out.println("ko co gia tri x");
				}
			} else if (op == 14) {
				int x = sc.nextInt();
				int tmp = search(x);
				if (tmp != -1) {
					erase(tmp + 1);
				} else {
					System.out.println("ko co gia tri x");
				}
			} else if (op == 15) {
				int x = sc.nextInt(), y = sc.nextInt();
				int tmp = search(x);
				if (tmp != -1) {
					updateVal(tmp, y);
				} else {
					System.out.println("ko co gia tri y");
				}
			} else if (op == 16) {
				removeByValue(6);
			} else if (op == 17) {
				deleteNodeAfterValue(5);
			} else if (op == 18) {
				deleteLastNodeAfterValue(5);
			} else if (op == 19) {
				updateNodeValue(5, 6);
			} else if (op == 20) {
				deleteNodesAfterX(5, 6);
			} else if (op == 21) {
				mergeSort();
			} else if (op == 22) {
			} else {
				break;
			}
		}
	}
}
