package linearsearch.searchforthefirstnegativenumber;

public class FirstNegativeNumber {
    public static int findFirstNegativeNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }

        return -1;
    }
}
