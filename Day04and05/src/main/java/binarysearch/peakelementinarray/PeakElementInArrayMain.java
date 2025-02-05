package binarysearch.peakelementinarray;

import java.util.Scanner;

public class PeakElementInArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakElement = PeakElementInArray.findPeakElement(arr);
        System.out.println("Peak Element: " + peakElement);
    }
}
