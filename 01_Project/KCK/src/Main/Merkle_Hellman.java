package Main;

import java.util.ArrayList;

public class Merkle_Hellman {
    public static void main(String[] args) {
        int S = 53;
        int[] numbers = {17, 38, 73, 4, 11, 1};

        ArrayList<Integer> solution = findSubset(numbers, S);
        if (solution != null) {
            System.out.println(" S = " + S + " = " + solution);
        } else {
            System.out.println("Không có lời giải.");
        }
    }

    public static ArrayList<Integer> findSubset(int[] numbers, int S) {
        ArrayList<Integer> subset = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int sum = numbers[i];
            subset.clear();
            subset.add(numbers[i]);

            for (int j = 0; j < numbers.length; j++) {
                if (j != i) {
                    if (sum + numbers[j] <= S) {
                        subset.add(numbers[j]);
                        sum += numbers[j];
                    }
                }
            }

            if (sum == S) {
                return subset;
            }
        }
        return null;
    }
}