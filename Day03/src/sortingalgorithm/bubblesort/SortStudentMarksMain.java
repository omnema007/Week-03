package sortingalgorithm.bubblesort;
import java.util.Scanner;
import java.util.Arrays;

public class SortStudentMarksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Taking input for student marks
        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Sorting the marks
        SortStudentMarks.bubbleSort(marks);
        
        System.out.println("Sorted Marks: " + Arrays.toString(marks));

    }

}
