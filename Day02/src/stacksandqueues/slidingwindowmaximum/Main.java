package stacksandqueues.slidingwindowmaximum;

public class Main {
    public static void main(String[] args) {
        SlidingWindowMaximum obj = new SlidingWindowMaximum();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = obj.maxSlidingWindow(arr, k);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
