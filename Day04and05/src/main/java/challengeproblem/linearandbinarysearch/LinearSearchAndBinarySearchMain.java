package challengeproblem.linearandbinarysearch;

public class LinearSearchAndBinarySearchMain {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;

        int missingPositive = LinearSearchAndBinarySearch.findFirstMissingPositive(nums);
        int index = LinearSearchAndBinarySearch.binarySearch(arr, target);

        System.out.println("First missing positive: " + missingPositive);
        System.out.println("Index of target: " + index);
    }
}
