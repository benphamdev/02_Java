package mypack;

import java.util.Scanner;

public class Program {
    private static final int KICH_THUOC_ALPHABET = 26;

    // Hàm tìm số nguyên nghịch đảo theo modulo
    private static int timSoNghichDao(int a, int m) {
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return -1;
    }

    // Hàm mã hóa Affine
    public static String maHoa(String message, int a, int b) {
        StringBuilder chuoiDaMaHoa = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char coSo = Character.isLowerCase(ch) ? 'a' : 'A';
                int x = ch - coSo;
                int daMaHoa = (a * x + b) % KICH_THUOC_ALPHABET;
                char kyTuMaHoa = (char) (coSo + daMaHoa);
                chuoiDaMaHoa.append(kyTuMaHoa);
            } else {
                chuoiDaMaHoa.append(ch);
            }
        }

        return chuoiDaMaHoa.toString();
    }

    // Hàm giải mã Affine
    public static String giaiMa(String chuoiDaMaHoa, int a, int b) {
        int aNghichDao = timSoNghichDao(a, KICH_THUOC_ALPHABET);
        StringBuilder chuoiGiaiMa = new StringBuilder();

        for (char ch : chuoiDaMaHoa.toCharArray()) {
            if (Character.isLetter(ch)) {
                char coSo = Character.isLowerCase(ch) ? 'a' : 'A';
                int y = ch - coSo;
                int daGiaiMa = (aNghichDao * (y - b + KICH_THUOC_ALPHABET)) % KICH_THUOC_ALPHABET;
                char kyTuGiaiMa = (char) (coSo + daGiaiMa);
                chuoiGiaiMa.append(kyTuGiaiMa);
            } else {
                chuoiGiaiMa.append(ch);
            }
        }

        return chuoiGiaiMa.toString();
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
    	System.out.println("Nhập bản rõ: ");
    	String banRo = sc.nextLine();
    	System.out.println("Nhập key1: ");
    	int key1 = sc.nextInt();
    	System.out.println("Nhập key2: ");
    	int key2 = sc.nextInt();
    
        // Mã hóa Affine
        String chuoiDaMaHoa = maHoa(banRo, key1, key2);
        System.out.println("Bản rõ: " + banRo);
        System.out.println("Chuỗi đã mã hóa: " + chuoiDaMaHoa);

        // Giải mã Affine
        System.out.println("Bản mã: " + chuoiDaMaHoa);
        String chuoiGiaiMa = giaiMa(chuoiDaMaHoa, key1, key2);
        System.out.println("Chuỗi đã giải mã: " + chuoiGiaiMa);
    }
}