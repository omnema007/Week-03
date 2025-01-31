package sortingalgorithm.mergesort;
import java.util.Scanner;
import java.util.Arrays;

public class SortBookPricesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of books
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        // Taking input for book prices
        System.out.println("Enter the prices of the books:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        // Sorting the book prices using Merge Sort
        SortBookPrices.mergeSort(prices, 0, prices.length - 1);

        // Displaying the sorted book prices
        System.out.println("Sorted Book Prices: " + Arrays.toString(prices));

        sc.close();
    }
}
