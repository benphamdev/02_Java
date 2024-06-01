package Main;

import java.util.ArrayList;

public class EllipticCurve {
    public static void main(String[] args) {
        ArrayList<Point> points = findPointsOnCurve();
        
        System.out.println("Các điểm trên đường cong Elliptic:");
        for (Point point : points) {
            System.out.println("(" + point.x + ", " + point.y + ")");
        }
    }

    public static ArrayList<Point> findPointsOnCurve() {
        ArrayList<Point> points = new ArrayList<>();

        for (int x = 0; x < 11; x++) {
            int z = (int) (Math.pow(x, 3) + x + 6) % 11;

            if (isQuadraticResidue(z, 11)) {
                for (int y = 0; y < 11; y++) {
                    if ((y * y) % 11 == z) {
                        points.add(new Point(x, y));
                    }
                }
            }
        }
        return points;
    }

    public static boolean isQuadraticResidue(int num, int p) {
        for (int x = 1; x < p; x++) {
            if ((x * x) % p == num) {
                return true;
            }
        }
        return false;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
