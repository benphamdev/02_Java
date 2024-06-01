package DoublyLinkedList;

import java.util.Scanner;

//class Node {
//	int data;
//	Node next, prev;
//
//	Node(int data) {
//		this.data = data;
//	}
//}

public class DBLL {
	static Scanner sc = new Scanner(System.in);
	static Node head;

	static void pushFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		if (head != null)
			head.prev = newNode;
		head = newNode;
	}

	static void append(int data) {
		Node temp = head, newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
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
			pushFront(x);
			return;
		}
		Node newNode = new Node(x), temp = head;
		for (int i = 1; i <= idx - 1; i++)
			temp = temp.next;
		newNode.next = temp;
		temp.prev.next = newNode;
		newNode.prev = temp.prev;
		temp.prev = newNode;
	}

	static void popFront() {
		if (head == null)
			return;
		head = head.next;
		if (head != null) {
			head.prev = null;
		}
	}

	static void popBack() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.prev.next = null;
	}

	static void erase(int idx) {
		int n = size();
		if (idx < 1 || idx > n)
			return;
		if (idx == 1) {
			popFront();
			return;
		}
		Node temp = head;
		for (int i = 1; i <= idx - 1; i++)
			temp = temp.next;
		temp.prev.next = temp.next;
		if (temp.next != null) {
			temp.next.prev = temp.prev;
		}
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	static int size() {
		Node temp = head;
		int cnt = 0;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}

	static Node search(int x) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == x) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	static Node searchBeforeNode(int x) {
		Node temp = head;
		while (temp.next != null && temp != null) {
			if (temp.next.data == x) {
				return temp.next;
			}
			temp = temp.next;
		}
		return null;
	}

	static void addNodeDataXBeforeNodeDataY(int x, int y) {
		if (head == null) {
			System.out.println("Danh sách rỗng!!!");
			return;
		}
		Node curNode = search(y);
		if (curNode == null) {
			System.out.println("Không tìm thấy Node có giá trị y!!!");
			return;
		}
		Node newNode = new Node(x);
		if (curNode.prev != null) {
			curNode.prev.next = newNode;
			newNode.prev = curNode.prev;
		} else {
			head = newNode;
		}
		newNode.next = curNode;
		curNode.prev = newNode;
	}

	static void addNodeDataXAfterNodeDataY(int x, int y) {
		if (head == null) {
			System.out.println("danh sach rong");
			return;
		}
		Node curNode = search(y);
		if (curNode == null) {
			System.out.println("not found y");
			return;
		}
		Node newNode = new Node(x);
		if (curNode.next != null) {
			curNode.next.prev = newNode;
		}
		newNode.next = curNode.next;
		newNode.prev = curNode;
		curNode.next = newNode;
	}

	static void delNodeBeforeNodeDataX(int x) {
		if (head == null) {
			System.out.println("danh sach rong");
			return;
		}
		Node cur = search(x);
		if (cur == null) {
			System.out.println("not found value");
			return;
		}
		if (cur.prev == null) {
			System.out.println("ko co node truoc x");
			return;
		}
		Node beforeCur = cur.prev;
		if (beforeCur == head) {
			head = cur;
			return;
		}
		beforeCur.prev.next = cur;
		cur.prev = beforeCur.prev;
	}

	static void delNodeAfterNodeDataX(int x) {
		if (head == null) {
			return;
		}
		Node current = head;
		while (current != null && current.data != x) {
			current = current.next;
		}
		if (current != null && current.next != null) {
			Node afterTarget = current.next;
			if (afterTarget.next != null) {
				afterTarget.next.prev = current;
				current.next = afterTarget.next;
			} else {
				current.next = null;
			}
		}

	}

	static void updateValue(int x, int y) {
		if (head == null) {
			return;
		}
		Node cur = search(x);
		if (cur == null)
			return;

		cur.data = y;
	}

	static void updateAllValue(int x, int y) {
		if (head == null) {
			return;
		}
		Node cur = head;
		while (cur != null) {
			if (cur.data == x) {
				cur.data = y;
			}
			cur = cur.next;
		}
	}

	static void swap(Node x, Node y) {
		int tmp = x.data;
		x.data = y.data;
		y.data = tmp;
	}

	// Bubble sort the given linked list
	static void bubbleSort() {
		int swapped, i;
		Node temp, lptr = null;
		if (head == null)
			return;
		do {
			swapped = 0;
			temp = head;
			while (temp.next != lptr) {
				if (temp.data > temp.next.data) {
					swap(temp, temp.next);
					swapped = 1;
				}
				temp = temp.next;
			}
			lptr = temp;
		} while (swapped != 0);
	}

	static void delAllNodeBeforeNodeDataX(int x) {
		if (head == null)
			return;
		Node temp = head;
		while (temp != null) {
			if (temp.data == x && temp.prev != null) {
				if (temp.prev == head) {
					head = temp;
					head.prev = null;
				} else {
					temp.prev.prev.next = temp;
					temp.prev = temp.prev.prev;
				}
			}
			temp = temp.next;
		}
	}

	static void delAllNodeAfterNodeDataX(int x) {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.data == x) {
				if (temp.next.next == null) {
					temp.next = null;
				} else {
					temp.next.next.prev = temp;
					temp.next = temp.next.next;
				}
			}
			temp = temp.next;
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

	public static void main(String[] args) {
		DBLL ll = new DBLL();
		while (true) {
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
					+ "\n11.Xóa node sau node có giá trị x." + "\n12.Xóa node x ."
					+ "\n13.Update node có giá trị x = node có giá trị y"
					+ "\n14.Tim kiếm node có giá trị x."
					+ "\n15.Sắp xếp danh sách liên kết theo BubbleSort."
					+ "\n16.Xóa node có giá trị X."
					+ "\n17.Tìm node ở giữa danh sách liên kết."
					+ "\n18.Sắp xếp danh sách liên kết theo MergeSort" + "\n0.Thoát.");
			System.out.println("--------0.exit-----------------");
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
				ll.printList();
			} else if (op == 8) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				System.out.println("Nhập giá trị y: ");
				int y = sc.nextInt();
				addNodeDataXBeforeNodeDataY(x, y);
			} else if (op == 9) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				System.out.println("Nhập giá trị y: ");
				int y = sc.nextInt();
				addNodeDataXAfterNodeDataY(x, y);
			} else if (op == 10) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				delNodeBeforeNodeDataX(x);
			} else if (op == 11) {
				System.out.println("Nhập giá trị x: ");
				int x = sc.nextInt();
				delNodeAfterNodeDataX(x);
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

			} else if (op == 15) {
				bubbleSort();
			} else {
				break;
			}
		}
	}
}
