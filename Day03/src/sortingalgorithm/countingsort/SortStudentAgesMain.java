package sortingalgorithm.countingsort;
import java.util.Arrays;

public class SortStudentAgesMain {
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 14, 10, 18, 17, 13, 12, 11, 16, 14};

        System.out.println("Before Sorting: " + Arrays.toString(studentAges));
        SortStudentAges.countingSort(studentAges);
        System.out.println("After Sorting: " + Arrays.toString(studentAges));
    }
}
