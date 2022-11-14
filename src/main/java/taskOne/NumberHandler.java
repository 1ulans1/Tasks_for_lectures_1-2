package taskOne;

import java.util.*;

public class NumberHandler {
    private final Integer[] array;

    public NumberHandler(Integer[] array) {
        this.array = array;
    }

    public Integer[] sortPositive() {
        return Arrays.stream(array)
                .filter(it -> it >= 0)
                .sorted((o1, o2) -> Integer.compare(o2, o1))
                .toArray(Integer[]::new);
    }
}
