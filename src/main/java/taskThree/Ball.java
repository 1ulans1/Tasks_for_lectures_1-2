package taskThree;

public class Ball implements Figure {
    private final int radius;

    public Ball(Integer radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("Arguments must be positive");

        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.valueOf(volume());
    }

    @Override
    public double volume() {

        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
