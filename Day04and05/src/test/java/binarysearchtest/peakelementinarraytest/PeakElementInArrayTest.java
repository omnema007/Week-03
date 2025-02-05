package binarysearchtest.peakelementinarraytest;

import binarysearch.peakelementinarray.PeakElementInArray;
import org.junit.Assert;
import org.junit.Test;

public class PeakElementInArrayTest {

    int[] arr = {4, 5, 6, 7, 1, 2, 3};
    int peakElement = PeakElementInArray.findPeakElement(arr);
    @Test
    public void findPeakElementTest() {
        Assert.assertEquals(7, peakElement);
    }
}
