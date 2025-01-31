package sortingalgorithm.quicksort;
import java.util.Scanner;
import java.util.Arrays;

public class SortProductPricesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        // Taking input for product prices
        System.out.println("Enter the product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        // Sorting product prices using Quick Sort
        SortProductPrices.quickSort(prices, 0, n - 1);

        // Displaying the sorted product prices
        System.out.println("Sorted Product Prices: " + Arrays.toString(prices));

    }

}
