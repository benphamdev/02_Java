package structural.adapter.adapters;

import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public int getRadius() {
        return (int) (squarePeg.getWidth() * Math.sqrt(2) / 2);
    }
}
