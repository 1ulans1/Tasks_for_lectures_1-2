package taskThree;

public class Cube implements Figure {

    private final int side;

    public Cube(int side) {
        if (side <= 0)
            throw new IllegalArgumentException("Arguments must be positive");

        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
