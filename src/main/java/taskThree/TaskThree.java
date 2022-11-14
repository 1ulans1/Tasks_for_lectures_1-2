package taskThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>(Arrays.asList(
                new FigureBall(10),
                new FigureCylinder(15, 10),
                new FigureTriangle(10, 10, 10, 15)));
        Collections.sort(figures);
        System.out.println(figures);
    }
}
