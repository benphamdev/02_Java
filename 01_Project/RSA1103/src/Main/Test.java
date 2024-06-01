package Main;

import java.util.Scanner;

public class Test {

	public static long power(long x, long y, long p) {
		long res = 1;
		x = x % p;
		if (x == 0) {
			return 0;
		}
		while (y > 0) {
			if ((y & 1) == 1) {
				res = (res * x) % p;
			}
			y = y >> 1;
			x = (x * x) % p;
		}
		return res;
	}

	public static boolean isPrime(long n) {
		if (n <= 1) {
			return false;
		}
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long gcd(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static long[] gcdExtended(long a, long b) {
		if (a == 0) {
			return new long[] { b, 0, 1 };
		}
		long[] vals = gcdExtended(b % a, a);
		long gcd = vals[0];
		long x1 = vals[1];
		long y1 = vals[2];
		long x = y1 - (b / a) * x1;
		long y = x1;
		return new long[] { gcd, x, y };
	}

	public static void modInverse(long A, long M) {
		long[] vals = gcdExtended(A, M);
		long gcdVal = vals[0];
		long x = vals[1];
		if (gcdVal != 1) {
			System.out.println("Inverse doesn't exist");
		} else {
			long res = (x % M + M) % M;
			System.out.println("Modular multiplicative inverse is " + res);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long p = scanner.nextLong();
		long q = scanner.nextLong();
		long e = scanner.nextLong();
		long m = scanner.nextLong();
		modInverse(e, (p - 1) * (q - 1));
		System.out.println("Power is " + power(m, e, p * q));
	}
}
