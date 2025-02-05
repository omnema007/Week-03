package binarysearch.searchinsortedmatrix;

public class SearchTargetValue {
    public static boolean searchInMatrix(int[][] arr, int target) {
        int rows = arr.length;
        int col = arr[0].length;

        int left = 0, right = rows * col - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            int midElement = arr[mid / col][mid % col];

            if (midElement == target) {
                return true;
            }
            else if (midElement < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return false;
    }
}
