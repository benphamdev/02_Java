package structural.adapter.square;

/**
 * SquarePeg class.
 * This class is incompatible with RoundHole.
 * So, we need to create an adapter to make it compatible.
 * Class is third-party or legacy and cannot be modified.
 */
public class SquarePeg {
    private int width;

    public SquarePeg(int width) {
        this.width = width;
        System.out.println("SquarePeg: width is " + width);
    }

    public int getWidth() {
        return width;
    }
}
