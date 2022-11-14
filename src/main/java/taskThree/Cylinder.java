package taskThree;

public class Cylinder implements Figure {
    public Cylinder(int height, int radius) {
        if (height <= 0 || radius <= 0)
            throw new IllegalArgumentException("Arguments must be positive");

        this.height = height;
        this.radius = radius;
    }

    private final int height;
    private final int radius;

    @Override
    public double volume() {

        return Math.PI * Math.pow(radius, 2) * height;
    }
}

