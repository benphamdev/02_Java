package Interface;

public class InsertionSort implements SortInterface {

	@Override
	public void sortAscending(int[] arr) {
		int n = arr.length;
		int i, j, key;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public void sortDecending(int[] arr) {
		int n = arr.length;
		int i, j, key;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}
	}

}
