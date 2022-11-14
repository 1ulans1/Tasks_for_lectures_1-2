package taskThree;

public class FigureBall implements Figure {
    private final int radius;

    public FigureBall(Integer radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.valueOf(area());
    }

    @Override
    public double area() {

        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
