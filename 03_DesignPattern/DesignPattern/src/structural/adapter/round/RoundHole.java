package structural.adapter.round;

/**
 * RoundHole class.
 * This class is compatible with RoundPeg.
 */
public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
        System.out.println("RoundHole: max SquarePeg is " + radius * Math.sqrt(2));
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
