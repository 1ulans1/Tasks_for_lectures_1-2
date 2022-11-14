import org.junit.jupiter.api.Test;
import taskThree.Ball;
import taskThree.Cube;
import taskThree.Cylinder;
import taskThree.Figure;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    public void validTest() {

        Figure[] figures = new Figure[]{
                new Ball(10),
                new Cylinder(15, 10),
                new Cube(10)
        };

        Double[] actual = Arrays.stream(figures)
                .map(Figure::volume)
                .toArray(Double[]::new);
        Double[] extended = new Double[]{4188.79, 4712.38, 1000.};


        for (int i = 0; i < actual.length; i++) {
            assertEquals(extended[i], actual[i], 0.01);
        }
    }

    @Test
    public void invalidTest() {

        //Ball
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Ball(-5)
        );

        String expectedMessage = "Arguments must be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        //Cube
        exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Cube(-5)
        );

        expectedMessage = "Arguments must be positive";
        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        //Cylinder
        exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Cylinder(-5, -3)
        );

        expectedMessage = "Arguments must be positive";
        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}