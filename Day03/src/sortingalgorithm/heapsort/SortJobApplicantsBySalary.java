package sortingalgorithm.heapsort;
import java.util.Scanner;

public class SortJobApplicantsBySalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of applicants
        System.out.print("Enter the number of job applicants: ");
        int n = sc.nextInt();

        int[] salaries = new int[n];

        // Taking input for salary demands
        System.out.println("Enter the expected salary demands:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        HeapSort.heapSort(salaries);

        // Displaying salary demands
        System.out.println("Sorted Salary Demands: ");
        HeapSort.printArray(salaries);

    }
}
