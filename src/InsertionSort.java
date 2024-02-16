import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void performInsertionSort(Random random) {
        Integer[] data = generateRandomArray(10, random);

        System.out.println("Data set before insertion sorting:");
        System.out.println(Arrays.toString(data));
        System.out.println();

        insertionSort(data);

        System.out.println("Data set after insertion sorting:");
        System.out.println(Arrays.toString(data));
        System.out.println();
    }

    public static Integer[] generateRandomArray(int size, Random random) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generating random integers between 0 and 99.
        }
        return array;
    }

    public static <T extends Comparable<T>> void insertionSort(T[] data) {
        for (int index = 1; index < data.length; index++) {
            T key = data[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }

            data[position] = key;
        }
    }
}

