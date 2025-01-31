package sortingalgorithm.insertionsort;
import java.util.Scanner;
import java.util.Arrays;

public class SortEmployeeIdMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking input for employee IDs
        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the employee IDs
        SortEmployeeId.insertionSort(arr);

        // Displaying result
        System.out.println("Sorted Employee IDs: " + Arrays.toString(arr));

    }

}
