package binarysearchtest.findfirstandlastoccurrencetest;

import binarysearch.findfirstandlastoccurrence.FirstAndLastOccurrence;
import org.junit.Assert;
import org.junit.Test;

public class FirstAndLastOccurrenceTest {
    int[] arr = {1,2,2,2,2,3,4,4};
    int target = 2;
    @Test
    public void test() {
        Assert.assertEquals(1, FirstAndLastOccurrence.findFirstOccurrence(arr, target));
        Assert.assertEquals(4, FirstAndLastOccurrence.findLastOccurrence(arr, target));
    }
}
