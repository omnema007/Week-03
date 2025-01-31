package sortingalgorithm.countingsort;

public class SortStudentAges {
    public static void countingSort(int[] ages) {
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;

        //Create a count array
        int[] count = new int[range];

        //Store the frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] sortedAges = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            sortedAges[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy sorted array back to original
        System.arraycopy(sortedAges, 0, ages, 0, ages.length);
    }
}
