import java.util.Arrays;

public class NumberSorting {
    public static void main(String[] args) {
        // Create an array of Integer objects with numbers from 10 to 1
        Integer[] numbers = new Integer[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        // Sorting the array in ascending order using Arrays.sort()
        Arrays.sort(numbers);

        // Displaying the sorted numbers
        System.out.println("Sorted Numbers (Ascending Order):");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println(); // New line for better readability

        // Sorting the array in descending order using a custom comparator
        Arrays.sort(numbers, (a, b) -> b.compareTo(a));

        // Displaying the sorted numbers in descending order
        System.out.println("Sorted Numbers (Descending Order):");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}