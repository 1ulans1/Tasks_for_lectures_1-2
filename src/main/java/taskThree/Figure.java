package taskThree;

import org.jetbrains.annotations.NotNull;

public interface Figure extends Comparable<Figure> {
    double volume();

    @Override
    default int compareTo(@NotNull Figure o) {
        return Double.compare(volume(), o.volume());
    }
}
