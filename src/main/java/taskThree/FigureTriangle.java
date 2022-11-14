package taskThree;

public class FigureTriangle implements Figure {

    public FigureTriangle(int baseSideOne, int baseSideTwo, int baseSideThree, int height) {
        this.baseSideOne = baseSideOne;
        this.baseSideTwo = baseSideTwo;
        this.baseSideThree = baseSideThree;
        this.height = height;
    }

    private final int baseSideOne;
    private final int baseSideTwo;
    private final int baseSideThree;
    private final int height;

    @Override
    public double area() {
        int s = baseSideOne * baseSideTwo * baseSideThree;
        return (1.0 / 3) * s * height;
    }
}





