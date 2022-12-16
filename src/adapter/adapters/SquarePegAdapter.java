package adapter.adapters;

import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }


    @Override
    public double getRadius() {
        double result;

        // The adapter mimic the radius of a round peg.
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));

        return result;
    }
}
