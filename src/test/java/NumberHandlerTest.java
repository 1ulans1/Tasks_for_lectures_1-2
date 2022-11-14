import org.junit.jupiter.api.Test;
import taskOne.NumberHandler;

import static org.junit.jupiter.api.Assertions.*;

class NumberHandlerTest {
    @Test
    public void validTest() {
        Integer[] array = new Integer[]{-34, -18, -35, 34, -4, 20, 5, 22, 41, -44, 0, 45};

        Integer[] extended = new Integer[]{45, 41, 34, 22, 20, 5, 0};
        Integer[] actual = new NumberHandler(array).sortPositive();

        assertArrayEquals(extended, actual);
    }

    @Test
    public void emptyArrayTest() {
        Integer[] array = new Integer[]{};

        Integer[] extended = new Integer[]{};
        Integer[] actual = new NumberHandler(array).sortPositive();

        assertArrayEquals(extended, actual);
    }
}
