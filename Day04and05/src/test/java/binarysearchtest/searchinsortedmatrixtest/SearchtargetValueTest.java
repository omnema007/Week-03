package binarysearchtest.searchinsortedmatrixtest;

import binarysearch.searchinsortedmatrix.SearchTargetValue;
import org.junit.Assert;
import org.junit.Test;

public class SearchtargetValueTest {

    int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11}};
    int target = 5;
    boolean test = SearchTargetValue.searchInMatrix(arr, target);
    @Test
    public void searchInMatrixTest() {
        Assert.assertEquals(true, test);
    }
}
