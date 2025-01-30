package hashmapandhashfunctions.findallsubarrayswithzerosum;
import java.util.*;
class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
            Map<Integer, List<Integer>> sumMap = new HashMap<>();
            int sum = 0;

            List<int[]> result = new ArrayList<>();

            sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                if (sumMap.containsKey(sum)) {
                    for (int startIdx : sumMap.get(sum)) {
                        result.add(new int[]{startIdx + 1, i});
                    }
                }

                sumMap.putIfAbsent(sum, new ArrayList<>());
                sumMap.get(sum).add(i);
            }

            // Print all found subarrays
            if (result.isEmpty()) {
                System.out.println("No subarrays with zero sum found.");
            } else {
                System.out.println("Zero sum subarrays found at indices:");
                for (int[] range : result) {
                    System.out.println("Start: " + range[0] + ", End: " + range[1]);
                }
            }
        }
    }


