package binarysearchtest.rotationpointinsortedarraytest;

import binarysearch.rotationpointinsortedarray.FindRotationPoint;
import org.junit.Assert;
import org.junit.Test;

public class FindRotationPointTest {

    int[] arr = {4, 5, 6, 7, 0, 1, 2};
    int rotationIndex = FindRotationPoint.findRotationPoint(arr);
    @Test
    public void findRotationPointTest() {
        Assert.assertEquals(4, rotationIndex);
    }
}
