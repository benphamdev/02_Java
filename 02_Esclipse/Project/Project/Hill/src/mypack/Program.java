package mypack;
import java.util.Scanner;
public class Program {

	private static int[][] getKeyMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key matrix:");
        String key = sc.nextLine();
        double sq = Math.sqrt(key.length());
        int[][] keyMatrix = new int[(int)sq][(int)sq];
        int k = 0;
        for (int i = 0; i < sq; i++) {
            for (int j = 0; j < sq; j++) {
                keyMatrix[i][j] = (key.charAt(k)) % 65;
                k++;
            }
        }
        return keyMatrix;
    }

    //method to encrypt the message
    static void encrypt(int[][] keyMatrix, String message) {
        int[] cipherMatrix = new int[3];
        String CipherText = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 3; k++) {
                    cipherMatrix[i] += keyMatrix[i][k] * ((message.charAt(k)) % 65);
                }
                cipherMatrix[i] = cipherMatrix[i] % 26;
            }
        }
        for (int i = 0; i < 3; i++) {
            CipherText += (char) (cipherMatrix[i] + 65);
        }
        System.out.println("Ciphertext: " + CipherText);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập bản rõ: ");
	        String banRo = sc.next();
	        int[][] keyMatrix = getKeyMatrix();
	        encrypt(keyMatrix, banRo);
	}

}
