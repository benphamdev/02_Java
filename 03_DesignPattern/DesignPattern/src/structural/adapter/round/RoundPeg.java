package structural.adapter.round;

/**
 * RoundPeg class.
 * This class is created to be compatible with RoundHole.
 */
public class RoundPeg {
    private int radius;

    public RoundPeg() {}

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
