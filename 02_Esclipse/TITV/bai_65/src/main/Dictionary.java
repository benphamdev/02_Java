package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary {
	private Map<String, String> mp = new TreeMap<String, String>();

	public String addWord(String vocabulary, String mean) {
		return this.mp.put(vocabulary, mean);
	}

	public String deleteWord(String vocabulary) {
		return this.mp.remove(vocabulary);
	}

	public String lookUpWords(String vocabulary) {
		return this.mp.get(vocabulary);
	}

	public void printVocabulary() {
		Set<String> se = this.mp.keySet();
		System.out.println(Arrays.toString(se.toArray()));
	}

	public int getQuantity() {
		return this.mp.size();
	}

	public void deleteAll() {
		this.mp.clear();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary dictionary = new Dictionary();
		int op = 0;
		do {
			System.out.println("----------------------");
			System.out.println("---------MENU---------");
			System.out.println("1. add vocabulary \n");
			System.out.println("2. delete vocabulary\n");
			System.out.println("3. mean vocabulary\n");
			System.out.println("4. print vocabulary\n");
			System.out.println("5. print quantity of vocabulary\n");
			System.out.println("6. delete all vocabulary\n");
			System.out.println("0. Exit\n");
			System.out.println("----------------------");

			op = sc.nextInt();
			sc.nextLine();
			if (op == 1) {
				System.out.println("input vocabulary : ");
				String vocabulary = sc.nextLine();
				System.out.println("input mean : ");
				String mean = sc.nextLine();
				dictionary.addWord(vocabulary, mean);
			} else if (op == 2 || op == 3) {
				System.out.println("input vocabulary : ");
				String vocabulary = sc.nextLine();
				if (op == 2) {
					dictionary.deleteWord(vocabulary);
				} else {
					System.out.println(dictionary.lookUpWords(vocabulary));
				}
			} else if (op == 4) {
				dictionary.printVocabulary();
			} else if (op == 5) {
				System.out.println(dictionary.getQuantity());
			} else if (op == 6) {
				dictionary.deleteAll();
			}
		} while (op != 0);
	}
}
