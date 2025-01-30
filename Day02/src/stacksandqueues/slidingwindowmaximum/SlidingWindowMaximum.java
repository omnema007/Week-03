package stacksandqueues.slidingwindowmaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int length = arr.length;
        int[] result = new int[length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < length; i++) {

            while (deque.size() > 0 && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (deque.size() > 0 && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
    }
}
