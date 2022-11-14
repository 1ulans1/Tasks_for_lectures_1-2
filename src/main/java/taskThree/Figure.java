package taskThree;

import org.jetbrains.annotations.NotNull;

public interface Figure extends Comparable<Figure> {
    double area();

    @Override
    default int compareTo(@NotNull Figure o) {
        return Double.compare(area(), o.area());
    }
}
