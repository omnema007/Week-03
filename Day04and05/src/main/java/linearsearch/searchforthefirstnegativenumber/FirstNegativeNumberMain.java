package linearsearch.searchforthefirstnegativenumber;

public class FirstNegativeNumberMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, 5, 6};
        System.out.println("First negative number found at index " + FirstNegativeNumber.findFirstNegativeNumber(arr));
    }
}
