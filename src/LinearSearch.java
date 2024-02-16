import java.util.Arrays;

public class LinearSearch {

    public static <T extends Comparable<T>> boolean search(T[] data, int min, int max, T target) {
        int index = min;
        boolean found = false;

        while (!found && index <= max) {
            found = data[index].equals(target);
            index++;
        }

        return found;
    }
}



