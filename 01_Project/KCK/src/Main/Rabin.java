package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rabin {
    
    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return 1;
    }

    public static List<Integer> encrypt(int message, int n) {
        List<Integer> ciphertext = new ArrayList<>();
        int c = (int) Math.pow(message, 2) % n;
        ciphertext.add(c);
        return ciphertext;
    }

    public static int decrypt(List<Integer> ciphertext, int p, int q) {
        int n = p * q;
        int m1 = (int) (Math.pow(ciphertext.get(0), (p + 1) / 4) % p);
        int m2 = (int) (Math.pow(ciphertext.get(0), (q + 1) / 4) % q);
        int y1 = (m1 * q * modInverse(q, p)) % n;
        int y2 = (m2 * p * modInverse(p, q)) % n;
        int r1 = (y1 + y2) % n;
        int r2 = (y1 - y2 + n) % n;
        int r3 = (-y1 + y2 + n) % n;
        int r4 = (-y1 - y2 + 2 * n) % n;

        int decryptedMessage = Math.max(r1, Math.max(r2, Math.max(r3, r4)));
        return decryptedMessage;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	System.out.print("p = ");
        int p = sc.nextInt();
        System.out.print("q = ");
        int q = sc.nextInt();
        System.out.print("x = ");
        int x = sc.nextInt();
        //101001001
        
        int n = p * q;
        List<Integer> ciphertext = encrypt(x, n);
        System.out.println("Bản mã hóa Rabin: " + ciphertext.get(0));
        int decryptedMessage = decrypt(ciphertext, p, q);
        System.out.println("Thông điệp đã giải mã Rabin: " + decryptedMessage);

        
    }
}
