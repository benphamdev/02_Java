package genericExample;

import java.util.ArrayList;
import java.util.List;

public class Merge_two_lists {
	public static <T> List<T> mergeLists(List<T> a, List<T> b) {
		List<T> tmp = new ArrayList<T>();
		int mx = Math.max(a.size(), b.size());
		for (int i = 0; i < mx; i++) {
			if (i < a.size()) {
				tmp.add(a.get(i));
			}
			if (i < b.size()) {
				tmp.add(b.get(i));
			}
		}
		return tmp;
	}

	public static void main(String[] args) {
		List<Integer> nums1 = List.of(1, 3, 5, 7);
		List<Integer> nums2 = List.of(2, 4, 8, 10);
		System.out.println("List of numbers:");
		System.out.println(nums1);
		System.out.println(nums2);
		List<String> colors1 = List.of("Red", "Green", "Blue");
		List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
		System.out.println("\nList of colors:");
		System.out.println(colors1);
		System.out.println(colors2);
		List<Integer> mergedNumbers = mergeLists(nums1, nums2);
		// Output:[1, 2, 3, 4, 5, 8, 7, 10]
		System.out.println("\nMerged Numbers: " + mergedNumbers);
		// Output:[Red, White, Green, Black, Blue, Orange, Pink]
		List<String> mergedWords = mergeLists(colors1, colors2);
		System.out.println("Merged Colors: " + mergedWords);
	}
}
