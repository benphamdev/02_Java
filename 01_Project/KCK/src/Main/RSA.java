package Main;

import java.util.Scanner;

public class RSA {
    public static long func(long a, long b, long mod) {
        long result = 1;
        a = a % mod;
        while (b > 0) {
            if ((b & 1) == 1)
                result = (result * a) % mod;
            b = b >> 1;
            a = (a * a) % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập p: ");
        long p = scanner.nextLong();
        System.out.print("Nhập q: ");
        long q = scanner.nextLong();
        System.out.print("Nhập e: ");
        long e = scanner.nextLong();
        System.out.print("Nhập m: ");
        long m = scanner.nextLong();

        long r = p * q;
        long piN = (p - 1) * (q - 1);
        long res = 0;
        for (int i = 0; i <= piN; i++) {
            if ((i * e) % piN == 1) {
                res = i;
                break;
            }
        }

        System.out.println("d = " + res);
        System.out.println("Mã hóa: " + func(m, e, r));
        System.out.println("Giải mã: " + func(func(m, e, r), res, r));
    }
}