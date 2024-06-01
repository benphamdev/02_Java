package set1;

import java.util.TreeSet;

public class IntSet {
	TreeSet<Integer> set;

	public IntSet() {
		set = new TreeSet<>();
	}

	public IntSet(int[] a) {
		set = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			this.set.add(a[i]);
		}
	}

	public IntSet intersection(IntSet b) {
		IntSet result = new IntSet();
		for (int x : this.set) {
			if (b.set.contains(x)) {
				result.set.add(x);
			}
		}
		return result;
	}

	public String toString() {
		String res = "";
		for (int x : this.set) {
			res += x + " ";
		}
		return res;
	}
}
