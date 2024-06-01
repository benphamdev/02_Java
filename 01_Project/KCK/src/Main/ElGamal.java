package Main;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.math.BigInteger;

public class ElGamal {
    public static void main(String[] args) {
        // Các tham số
        BigInteger p = BigInteger.valueOf(211);
        BigInteger alpha = BigInteger.valueOf(39);
        BigInteger a = BigInteger.valueOf(113);

        // Tính khóa công khai của A
        BigInteger beta = alpha.modPow(a, p);

        // Bản tin cần mã hóa
        BigInteger x = BigInteger.valueOf(34);

        // Số ngẫu nhiên k
        BigInteger k = BigInteger.valueOf(23);

        // Mã hóa bản tin x
        BigInteger[] encrypted = encrypt(x, k, p, alpha, beta);

        // Giải mã bản mã
        BigInteger decrypted = decrypt(encrypted[0], encrypted[1], a, p);

        // Hiển thị kết quả
        System.out.println("Publickey: " + beta);
        System.out.println("Encrypted (y1): " + encrypted[0]);
        System.out.println("Encrypted (y2): " + encrypted[1]);
        System.out.println("Decrypted message: " + decrypted);
    }

    // Hàm mã hóa
    public static BigInteger[] encrypt(BigInteger x, BigInteger k, BigInteger p, BigInteger alpha, BigInteger beta) {
        BigInteger[] result = new BigInteger[2];
        // y1 = alpha^k mod p
        result[0] = alpha.modPow(k, p);
        // y2 = (beta^k * x) mod p
        result[1] = (beta.modPow(k, p).multiply(x)).mod(p);
        return result;
    }

    // Hàm giải mã
    public static BigInteger decrypt(BigInteger y1, BigInteger y2, BigInteger a, BigInteger p) {
        // Dùng công thức y2 * y1^(-a) mod p
        return (y2.multiply(y1.modPow(a.negate(), p))).mod(p);
    }
}
