package hashmapandhashfunctions.pairwithgivensum;
import java.util.*;
public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = target - num; // Check if complement exists
            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            seenNumbers.add(num); // Add current number to the set
        }

        System.out.println("No pair found.");
        return false;
    }
}
