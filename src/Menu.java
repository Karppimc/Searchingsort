import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // List of values from 0 to 9
        Arrays.sort(values); // Sort the array for binary search.

        boolean quit = false;

        while (!quit) {
            System.out.println("Menu of Searching and Sorting Testbed.");
            System.out.println();
            System.out.println("1) Linear searching");
            System.out.println("2) Binary searching");
            System.out.println("3) O(n^2) type of sorting");
            System.out.println("4) O(n * log(n)) type of sorting");
            System.out.println();
            System.out.println("q/Q) Quit");
            System.out.println();
            System.out.print("Your choice: ");

            String choice = scanner.nextLine();
            System.out.println();

            switch (choice.toLowerCase()) {
                case "1":
                    System.out.print("In the list are values ");
                    for (int i = 0; i < values.length; i++) {
                        if (i != values.length - 1) {
                            System.out.print(values[i] + ", ");
                        } else {
                            System.out.print(values[i]);
                        }
                    }
                    System.out.print("; which value would you like to search with linear search? ");
                    int targetLinear = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println();
                    if (LinearSearch.search(values, 0, values.length - 1, targetLinear)) {
                        System.out.println("Found");
                        System.out.println();
                    } else {
                        System.out.println("Not found");
                        System.out.println();
                    }
                    break;
                case "2":
                    System.out.print("In the list are values ");
                    for (int i = 0; i < values.length; i++) {
                        if (i != values.length - 1) {
                            System.out.print(values[i] + ", ");
                        } else {
                            System.out.print(values[i]);
                        }
                    }
                    System.out.print("; which value would you like to search with binary search? ");
                    int targetBinary = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println();
                    if (BinarySearch.search(values, 0, values.length - 1, targetBinary)) {
                        System.out.println("Found");
                        System.out.println();
                    } else {
                        System.out.println("Not found");
                        System.out.println();
                    }
                    break;
                case "3":
                    InsertionSort.performInsertionSort(new Random());
                    break;
                case "4":
                    QuickSort.performQuickSort(new Random());
                    break;
                case "q":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                    break;
            }
        }
    }
}


