package binarysearch.findfirstandlastoccurrence;

public class FirstAndLastOccurrenceMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int first = FirstAndLastOccurrence.findFirstOccurrence(arr, target);
        int last = FirstAndLastOccurrence.findLastOccurrence(arr, target);
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
