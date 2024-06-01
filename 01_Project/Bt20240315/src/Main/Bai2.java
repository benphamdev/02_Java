package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai2 {
    private BigInteger p, alpha, a;

    public Bai2(BigInteger p, BigInteger alpha, BigInteger a) {
        this.p = p;
        this.alpha = alpha;
        this.a = a;
    }

    public BigInteger[] sign(BigInteger x, BigInteger k) {
        BigInteger r = alpha.modPow(k, p);
        BigInteger s = k.modInverse(p.subtract(BigInteger.ONE)).multiply(x.subtract(a.multiply(r))).mod(p.subtract(BigInteger.ONE));

        return new BigInteger[]{r, s};
    }

    public boolean verify(BigInteger x, BigInteger r, BigInteger s, BigInteger y) {
        BigInteger v1 = y.modPow(r, p).multiply(r.modPow(s, p)).mod(p);
        BigInteger v2 = alpha.modPow(x, p);

        return v1.equals(v2);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("p = ");
    	String t = sc.nextLine();
        BigInteger p = new BigInteger(t);
        System.out.println("alpha = ");
        t = sc.nextLine();
        BigInteger alpha = new BigInteger(t);
        System.out.println("a = ");
        t = sc.nextLine();
        BigInteger a = new BigInteger(t);
        System.out.println("x = ");
        t = sc.nextLine();
        BigInteger x = new BigInteger(t);
        System.out.println("k = ");
        t = sc.nextLine();
        BigInteger k = new BigInteger(t);
        
        Bai2 elGamal = new Bai2(p, alpha, a);
        
        // Ký thông điệp
        BigInteger[] signature = elGamal.sign(x, k);
        System.out.println("Chữ ký: (r, s) = (" + signature[0] + ", " + signature[1] + ")");
        
        // Tạo khóa công khai y
        BigInteger y = alpha.modPow(a, p);

        // Xác minh chữ ký
        boolean isVerified = elGamal.verify(x, signature[0], signature[1], y);
        System.out.println("Chữ ký có hợp lệ? " + isVerified);
    }
}