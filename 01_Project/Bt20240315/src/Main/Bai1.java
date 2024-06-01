package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Declare values for the example
    	Scanner sc = new Scanner(System.in);
    	System.out.println("p = ");
    	String p1 = sc.nextLine();
        BigInteger p = new BigInteger(p1);
        System.out.println("q = ");
        p1 = sc.nextLine();
        BigInteger q = new BigInteger(p1);
        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        System.out.println("d = ");
        p1 = sc.nextLine();
        BigInteger d = new BigInteger(p1);
        BigInteger e = d.modInverse(phi);
        System.out.println("Message : ");
        p1 = sc.nextLine();
        BigInteger message = new BigInteger(p1);

        // Sign the message
        BigInteger signature = message.modPow(d, n);

        // Public and Private Keys
        BigInteger publicKey = n.multiply(e);
        BigInteger privateKey = d;

        // Print the results
        System.out.println("Message: " + message);
        System.out.println("Signature: " + signature);
        System.out.println("Public Key: (" + n + ", " + e + ")");
        System.out.println("Private Key: (" + d + ")");

        // Verify the signature
        BigInteger verified = signature.modPow(e, n);
        System.out.println("Signed: " + signature);
        System.out.println("Verify Signature: " + verified);
        System.out.println("Verification Result: " + verified.equals(message));
    }
}
