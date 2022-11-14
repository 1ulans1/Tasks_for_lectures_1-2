package taskThree;

public class FigureCylinder implements Figure {
    public FigureCylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    private final int height;
    private final int radius;

    @Override
    public double area() {

        return Math.PI * Math.pow(radius, 2) * height;
    }
}

