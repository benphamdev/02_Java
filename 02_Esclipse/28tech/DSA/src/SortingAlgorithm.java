import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithm {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	static void inputArray(int[] a, int n) {
		for (int i = 0; i < n; i++)
			a[i] = rd.nextInt(100);
	}

	static void printArray(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void interchangeSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j])
					swap(a, i, j);
			}
		}
	}

	static void selectionSort(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for (int j = i; j < n; j++) {
				if (a[minIdx] > a[j])
					minIdx = j;
			}
			swap(a, minIdx, i);
		}
	}

	static void bubbleSort(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}

	static void shakerSort(int[] a, int n) {// variant BubbleSort
		int l = 0, r = n - 1, carry = n - 1;
		while (l < r) {
			for (int i = l; i < r; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
					carry = i;
				}
			}
			r = carry;
			for (int i = r; i > l; i--) {
				if (a[i] < a[i - 1]) {
					swap(a, i, i - 1);
					carry = i;
				}
			}
			l = carry;
		}
	}

	static void insertionSort(int a[], int n) {
		for (int i = 1; i < n; i++) {
			int j = i - 1, tmp = a[i];
			while (j >= 0 && a[j] > tmp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = tmp;
		}
	}

	static void binaryInsertionSort(int[] a, int n) {// variant insertion
		for (int i = 1; i < n; i++) {
			int l = 0, r = i - 1, key = a[i];
			while (l <= r) {
				int m = (l + r) / 2;
				if (a[m] < key)
					l = m + 1;
				else
					r = m - 1;

			}
			for (int j = i - 1; j >= l; j--) {
				a[j + 1] = a[j];
			}
			a[l] = key;
		}
	}

	static void shellSort(int a[], int n) {// variant insertion
		for (int gap = n >> 1; gap > 0; gap >>= 1) {
			for (int i = gap; i < n; i++) {
				int j = i, tmp = a[i];
				while (j >= gap && a[j - gap] > tmp) {
					a[j] = a[j - gap];
					j -= gap;
				}
				a[j] = tmp;
			}
		}
	}

	static void heapify(int[] a, int n, int i) {
		int largest = i, l = 2 * i + 1, r = 2 * i + 2;
		if (l < n && a[largest] < a[l])
			largest = l;
		if (r < n && a[largest] < a[r])
			largest = r;
		if (largest != i) {
			swap(a, i, largest);
			heapify(a, n, largest);
		}
	}

	static void heapSort(int a[], int n) {
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(a, n, i);
		for (int i = n - 1; i >= 0; i--) {
			swap(a, i, 0);
			heapify(a, i, 0);
		}
	}

	static int partition(int a[], int l, int r) {
		int pivot = a[l];
		int i = l - 1, j = r + 1;
		while (true) {
			do {
				i++;
			} while (a[i] < pivot);
			do {
				j--;
			} while (a[j] > pivot);
			if (i < j) {
				swap(a, i, j);
			} else {
				return j;
			}
		}
	}

	static void quickSort(int a[], int l, int r) {
		if (l >= r)
			return;
		int p = partition(a, l, r);
		quickSort(a, l, p);
		quickSort(a, p + 1, r);
	}

	static void merge(int[] a, int l, int m, int r) {
		int[] L = Arrays.copyOfRange(a, l, m + 1);
		int[] R = Arrays.copyOfRange(a, m + 1, r + 1);
		int i = 0, j = 0;
		while (i < L.length && j < R.length) {
			if (L[i] <= R[j]) {
				a[l++] = L[i++];
			} else {
				a[l++] = R[j++];
			}
		}
		while (i < L.length)
			a[l++] = L[i++];
		while (j < R.length)
			a[l++] = R[j++];
	}

	static void mergeSort(int a[], int l, int r) {
		// code here
		if (l > r)
			return;
		int m = (l + r) / 2;
		mergeSort(a, l, m);
		mergeSort(a, m + 1, r);
		merge(a, l, m, r);
	}

	static void radixSort(int a[], int n) {
		int mx = Arrays.stream(a).max().getAsInt();
		int iteration = (int) Math.log10(mx) + 1, mod = 10;
		while (iteration-- > 0) {
			HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int digit = (a[i] % mod) / (mod / 10);
				map.computeIfAbsent(digit, k -> new ArrayList<>()).add(a[i]);
			}
			int idx = 0;
			for (int i = 0; i <= 9; i++) {
				if (map.containsKey(i)) {
					for (int x : map.get(i)) {
						a[idx++] = x;
					}
				}
			}
			mod *= 10;
		}
	}

	public static void main(String[] args) {
		int n = rd.nextInt((20 - 10) + 1) + 10, a[] = new int[n];
		System.out.println("Array before sort : ");
		inputArray(a, n);
		printArray(a, n);
		System.out.println();
//		"1. Interchange Sort"
//		interchangeSort(a, n);
//		"2. Selection Sort"
//		selectionSort(a, n);
//		"3. Bubble Sort"
//		bubbleSort(a, n);
//		"4. Insertion Sort"
//		insertionSort(a, n);
//		"5. Binary Insertion Sort"
//		binaryInsertionSort(a, n);
//		"6. Shaker Sort"
//		shakerSort(a, n);
//		"7. Shell Sort"
//		shellSort(a, n);
//		"8. Heap Sort"
//		heapSort(a, n);
//		"9. Quick Sort"
//		quickSort(a, 0, n - 1);
//		"10. Merge Sort"
//		mergeSort(a, 0, n - 1);
//		"11. Radix Sort"
//		radixSort(a, n);
//		System.out.println("Array after sort : ");
//		printArray(a, n);
	}
}
