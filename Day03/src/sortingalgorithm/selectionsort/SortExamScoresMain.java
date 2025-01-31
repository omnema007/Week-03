package sortingalgorithm.selectionsort;
import java.util.Scanner;
import java.util.Arrays;

public class SortExamScoresMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        // Taking input
        System.out.println("Enter the exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Sorting exam scores

        SortExamScores.selectionSort(scores);

        // Displaying the sorted exam scores
        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));

        sc.close();

    }

}
