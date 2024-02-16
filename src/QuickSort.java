import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void performQuickSort(Random random) {
        Integer[] data = generateRandomArray(10, random);

        System.out.println("Data set before quick sort:");
        displayArray(data);
        System.out.println();

        quickSort(data, 0, data.length - 1);

        System.out.println("Data set after quick sort:");
        displayArray(data);
        System.out.println();
    }

    public static Integer[] generateRandomArray(int size, Random random) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) - 50; // Generating random integers between -50 and 49.
        }
        return array;
    }

    public static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
        if (min < max) {
            int partitionIndex = partition(data, min, max);
            quickSort(data, min, partitionIndex - 1);
            quickSort(data, partitionIndex + 1, max);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] data, int min, int max) {
        T pivot = data[max];
        int i = (min - 1);

        for (int j = min; j < max; j++) {
            if (data[j].compareTo(pivot) <= 0) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, max);
        return i + 1;
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    private static <T> void displayArray(T[] array) {
        for (T value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
