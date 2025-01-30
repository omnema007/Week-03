package hashmapandhashfunctions.twosumproblem;
import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }

            numIndexMap.put(arr[i], i);
        }

        return new int[]{};
    }
}
