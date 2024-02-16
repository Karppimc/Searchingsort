import java.util.Arrays;

public class BinarySearch {

    public static <T extends Comparable<T>> boolean search(T[] data, int min, int max, T target) {
        boolean found = false;
        int midpoint = (min + max) / 2;

        if (data[midpoint].compareTo(target) == 0)
            found = true;
        else if (data[midpoint].compareTo(target) > 0) {
            if (min <= midpoint - 1)
                found = search(data, min, midpoint - 1, target);
        } else if (midpoint + 1 <= max)
            found = search(data, midpoint + 1, max, target);

        return found;
    }
}

