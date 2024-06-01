package mypack;

import java.util.Scanner;

public class Program {
    public static String maHoa(String banRo, int key) {
        StringBuilder chuoiDaMaHoa = new StringBuilder();
        for (int i = 0; i < banRo.length(); i++) {
            char kyTu = banRo.charAt(i);
            if (Character.isLetter(kyTu)) {
                char kyTuDaMaHoa = (char) (((kyTu - 'A' + key) % 26) + 'A');
                chuoiDaMaHoa.append(kyTuDaMaHoa);
            } else {
                chuoiDaMaHoa.append(kyTu);
            }
        }
        return chuoiDaMaHoa.toString();
    }

    public static String giaiMa(String chuoiDaMaHoa, int key) {
        return maHoa(chuoiDaMaHoa, 26 - key);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập bản rõ: ");
    	String banRo = sc.nextLine();
    	System.out.println("Nhập key: ");
    	int key = sc.nextInt();

        String chuoiDaMaHoa = maHoa(banRo, key);
        System.out.println("Bản rõ: " + banRo);
        System.out.println("Key: " + key);
        System.out.println("Chuỗi đã mã hóa: " + chuoiDaMaHoa);

        String chuoiGiaiMa = giaiMa(chuoiDaMaHoa, key);
        System.out.println("Bản mã: " + chuoiDaMaHoa);
        System.out.println("Key: " + key);
        System.out.println("Chuỗi đã giải mã: " + chuoiGiaiMa);
    }
}

