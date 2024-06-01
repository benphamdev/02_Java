import java.util.Scanner;

public class bai_6 {
	public static int gcd(int a, int b) {
		// (a, b) = (b, a % b)
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void ptich(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				while (n % i == 0) {
					System.out.println(i);
					n /= i;
				}
			}
		}
		if (n > 1) {
			System.out.println(n);
		}
	}

	public static boolean fibo(long n) {
		if (n == 0 || n == 1)
			return true;
		long fn1 = 1, fn2 = 0;
		for (int i = 2; i <= 92; i++) {
			long fn = fn1 + fn2;
			if (fn == n)
				return true;
			fn2 = fn1;
			fn1 = fn;
		}
		return false;
	}

	public static int degree(int n, int p) {
		int sum = 0;
//		duyet cac boi p <= n
		for (int i = p; i <= n; i += p) {
			int j = i;
			while (j % p == 0) {
				sum++;
				j /= p;
			}
		}
		return sum;
	}

	public static int legendre(int n, int p) {
		int sum = 0;
		for (int i = p; i <= n; i *= p) {
			sum += n / i;
		}
		return sum;
	}

	public static void main(str[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println(gcd(2, 20));
//		System.out.println(fibo(34));
		System.out.println(degree(1000000, 11));
		System.out.println(legendre(1000000, 11));
	}
}
