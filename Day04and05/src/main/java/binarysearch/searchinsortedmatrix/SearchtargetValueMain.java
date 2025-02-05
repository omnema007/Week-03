package binarysearch.searchinsortedmatrix;

public class SearchtargetValueMain {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 3;
        System.out.println("Target found: " + SearchTargetValue.searchInMatrix(matrix, target));
    }
}
