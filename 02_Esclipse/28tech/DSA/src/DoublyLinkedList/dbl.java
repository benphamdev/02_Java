//package DoublyLinkedList;
//
//import java.util.Scanner;
//
//class Node {
//	int data;
//	Node pNext, prev;
//
//	Node(int x) {
//		this.data = x;
//		this.pNext = this.prev = null;
//	}
//}
//
//class DoublyLinkedList {
//	Node pHead;
//	Node pTail;
//
//	public DoublyLinkedList() {
//		this.pHead = null;
//		this.pTail = null;
//	}
//
//	public void addNode(int x) {
//		Node newNode = new Node(x);
//		if (pHead == null) {
//			pHead = pTail = newNode;
//		} else {
//			newNode.pNext = pHead;
//			pHead.prev = newNode;
//			pHead = newNode;
//		}
//	}
//
//	public void addNode2(int x) {
//		Node newNode = new Node(x);
//		if (pHead == null) {
//			pHead = pTail = newNode;
//		} else {
//			pTail.pNext = newNode;
//			newNode.prev = pTail;
//			pTail = newNode;
//		}
//	}
//
//	public Node findNode(int x) {
//		Node curNode = pHead;
//		while (curNode != null) {
//			if (curNode.data == x) {
//				return curNode;
//			}
//			curNode = curNode.pNext;
//		}
//		return null;
//
//	}
//
//	public Node findNodeBeforeX(int x) {
//		Node curNode = pHead;
//		while (curNode != null && curNode.pNext != null) {
//			if (curNode.pNext.data == x) {
//				return curNode;
//			}
//			curNode = curNode.pNext;
//		}
//		return null;
//	}
//
//	public void addNodeDataXBeforeNodeDataY(int x, int y) {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		if (findNode(y) == null) {
//			System.out.println("Không tìm thấy Node có giá trị y!!!");
//			return;
//		} else {
//			Node newNode = new Node(x);
//			Node curNode = findNode(y);
//			if (curNode.prev != null) {
//				curNode.prev.pNext = newNode;
//				newNode.prev = curNode.prev;
//			} else {
//				pHead = newNode;
//			}
//			newNode.pNext = curNode;
//			curNode.prev = newNode;
//		}
//	}
//
//	public void addNodeDataXAfterNodeDataY(int x, int y) {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		if (findNode(y) == null) {
//			System.out.println("Không tìm thấy Node có giá trị y!!!");
//			return;
//		} else {
//			Node newNode = new Node(x);
//			Node curNode = findNode(y);
//			Node tmp = null;
//			if (curNode.pNext != null) {
//				tmp = curNode.pNext;
//				curNode.pNext = newNode;
//				newNode.prev = curNode;
//			} else {
//				addNode2(x);
//				return;
//			}
//			newNode.pNext = tmp;
//			tmp.prev = newNode;
//		}
//	}
//
//	public void delNodeFirst() {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		pHead = pHead.pNext;
//	}
//
//	public void delNodeAfter() {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		if (pTail.prev != null) {
//			pTail.prev.pNext = null;
//			pTail = pTail.prev;
//		} else {
//			pHead = pTail = null;
//			return;
//		}
//	}
//
//	public void delNodeBeforeNodeDataX(int x) {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		if (findNode(x) == null) {
//			System.out.println("Danh sách liên kết không có Node có giá trị x");
//			return;
//		} else {
//			Node curNode = findNode(x);
//			Node nodeBfx = findNodeBeforeX(x);
//			if (nodeBfx == null) {
//				System.out.println("Không có node đứng trước node X!!!");
//				return;
//			} else {
//				if (nodeBfx == pHead) {
//					pHead = curNode;
//					return;
//				} else {
//					nodeBfx.prev.pNext = curNode;
//					curNode.prev = nodeBfx.prev;
//				}
//			}
//		}
//	}
//
//	public void delNodeAfterNodeDataX(int x) {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		if (findNode(x) == null) {
//			System.out.println("Danh sách liên kết không có Node có giá trị x");
//			return;
//		} else {
//			Node curNode = findNode(x);
//			if (curNode.pNext == null) {
//				System.out.println("Không có node đứng sau node x");
//				return;
//			} else {
//				if (curNode.pNext == pTail) {
//					curNode.pNext = null;
//					pTail = curNode;
//				} else {
//					curNode.pNext.pNext.prev = curNode;
//					curNode.pNext = curNode.pNext.pNext;
//				}
//			}
//		}
//	}
//
//	public void updateNodeDataX_Y(int x, int y) {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		if (findNode(x) == null) {
//			System.out.println("Danh sách liên kết không có Node có giá trị x");
//			return;
//		}
//		Node curNode = findNode(x);
//		curNode.data = y;
//	}
//
//	public void updateAllNodeDataX_Y(int x, int y) {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		Node curNode = pHead;
//		while (curNode != null) {
//			if (curNode.data == x) {
//				curNode.data = y;
//			}
//			curNode = curNode.pNext;
//		}
//	}
//
//	public void delAllNodeBeforeNodeDataX(int x) {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng!!!");
//			return;
//		}
//		Node curNode = pHead;
//		while (curNode != null) {
//			if (curNode.data == x && curNode.prev != null) {
//				if (curNode.prev == pHead) {
//					pHead = curNode;
//					pHead.prev = null;
//				} else {
//					curNode.prev.prev.pNext = curNode;
//					curNode.prev = curNode.prev.prev;
//				}
//			}
//			curNode = curNode.pNext;
//		}
//	}
//
//	public void delAllNodeAfterNodeDataX(int x) {
//		if (pHead == null) {
//			System.out.println("Danh sách rỗng");
//			return;
//		}
//		Node curNode = pHead;
//		while (curNode != null && curNode.pNext != null) {
//			if (curNode.data == x) {
//				if (curNode.pNext == pTail) {
//					pTail = curNode;
//					curNode.pNext = null;
//				} else {
//					curNode.pNext.pNext.prev = curNode;
//					curNode.pNext = curNode.pNext.pNext;
//				}
//			}
//			curNode = curNode.pNext;
//		}
//	}
//
////		1 2 3 4 5
//	public void print() {
//		Node curNode = pHead;
//		while (curNode != null) {
//			if (curNode.pNext != null) {
//				System.out.print(curNode.data + "->");
//			} else {
//				System.out.print(curNode.data);
//			}
//			curNode = curNode.pNext;
//		}
//	}
//}
//
//public class dbl {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		DoublyLinkedList dslk = new DoublyLinkedList();
//		int luachon = 0;
//		do {
//			System.out.println("--------MENU--------" + "\n1.Thêm node vào đầu."
//					+ "\n2.Thêm node vào cuối."
//					+ "\n3.Thêm node có giá trị x vào trước node có giá trị y."
//					+ "\n4.Thêm node có giá trị x vào sau node có giá trị y."
//					+ "\n5.Xóa node đầu." + "\n6.Xóa node cuối cùng."
//					+ "\n7.Xóa node trước node có giá trị x."
//					+ "\n8.Xóa node sau node có giá trị x."
//					+ "\n9.Xóa 1 node đầu và cuối sau node có giá trị x ."
//					+ "\n10.Update node có giá trị x = node có giá trị y"
//					+ "\n11.Tim kiếm node có giá trị x."
//					+ "\n12.Sắp xếp danh sách liên kết theo BubbleSort."
//					+ "\n13.Xóa node có giá trị X."
//					+ "\n14.Tìm node ở giữa danh sách liên kết."
//					+ "\n15.Sắp xếp danh sách liên kết theo MergeSort"
//					+ "\n20.In danh sách liên kết." + "\n0.Thoát.");
//			System.out.println("Nhập lựa chọn: ");
//			luachon = sc.nextInt();
//			sc.nextLine();
//			if (luachon == 1) {
//				System.out.println("Nhập giá trị thêm vào: ");
//				int x = sc.nextInt();
//				sc.nextLine();
//				dslk.addNode(x);
//			} else if (luachon == 2) {
//				System.out.println("Nhập giá trị thêm vào: ");
//				int x = sc.nextInt();
//				sc.nextLine();
//				dslk.addNode2(x);
//			} else if (luachon == 3) {
//				System.out.println("Nhập giá trị x: ");
//				int x = sc.nextInt();
//				sc.nextLine();
//				System.out.println("Nhập giá trị y: ");
//				int y = sc.nextInt();
//				sc.nextLine();
//				dslk.addNodeDataXBeforeNodeDataY(x, y);
//			} else if (luachon == 4) {
//				System.out.println("Nhập giá trị x: ");
//				int x = sc.nextInt();
//				sc.nextLine();
//				System.out.println("Nhập giá trị y: ");
//				int y = sc.nextInt();
//				sc.nextLine();
//				dslk.addNodeDataXAfterNodeDataY(x, y);
//			} else if (luachon == 5) {
//				dslk.delNodeFirst();
//			} else if (luachon == 6) {
//				dslk.delNodeAfter();
//			} else if (luachon == 7) {
//				System.out.println("Nhập giá trị x: ");
//				int x = sc.nextInt();
//				sc.nextLine();
//				dslk.delAllNodeBeforeNodeDataX(x);
//			} else if (luachon == 8) {
//				System.out.println("Nhập giá trị x: ");
//				int x = sc.nextInt();
//				sc.nextLine();
//				dslk.delAllNodeAfterNodeDataX(x);
//			}
////				else if(luachon == 9) {
////					System.out.println("Nhập giá trị x: ");
////					int x = sc.nextInt(); sc.nextLine();
////					dslk.xoa1NodeTruoSauNodeX(x);
////				}
//			else if (luachon == 10) {
//				System.out.println("Nhập giá trị x: ");
//				int x = sc.nextInt();
//				sc.nextLine();
//				System.out.println("Nhập giá trị y: ");
//				int y = sc.nextInt();
//				sc.nextLine();
//				dslk.updateAllNodeDataX_Y(x, y);
//			}
////				else if(luachon == 11) {
////					System.out.println("Nhập giá trị x: ");
////					int x = sc.nextInt(); sc.nextLine();
////					Node reNode = dslk.timKiemNodeX(x);
////					if(reNode != null) {
////						System.out.println("Tìm thấy node có giá trị: " + reNode.data);
////					}else {
////						System.out.println("Không tìm thấy node có giá trị x!!!");
////					}
////				}
////				else if(luachon == 12) {
////					dslk.bubbleSort(dslk);
////					if(dslk.bubbleSort(dslk) == false) {
////						System.out.println("Danh sách liên kết rỗng");
////					}else {
////						System.out.println("Danh sách liên kết đã được sắp xếp");
////					}
////				}
////				else if(luachon == 13) {
////					System.out.println("Nhập giá trị x: ");
////					int x = sc.nextInt(); sc.nextLine();
////					dslk.xoaNodeCoGiatriX(x);
////				}
////				else if(luachon == 14) {
////					System.out.println("Node nằm giữa danh sách liên kết là: " + dslk.findNodeMiddle(dslk.pHead).data);
////				}
////				else if(luachon == 15) {
////					dslk.pHead = dslk.mergeSort(dslk.pHead);
////				}
//			else if (luachon == 20) {
//				dslk.print();
//				System.out.println();
//				System.out.println("Nhấn enter để tiếp tục....");
//				sc.nextLine();
//			}
//		} while (luachon != 0);
//		System.out.println("Kết thúc chương trình!!!!");
//	}
//
//}
