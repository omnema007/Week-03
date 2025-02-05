package linearsearchtest.searchforthefirstnegativenumbertest;

import linearsearch.searchforthefirstnegativenumber.FirstNegativeNumber;
import org.junit.Assert;
import org.junit.Test;

public class FirstNegativeNumberTest {

    int[] arr = {1, 2, 3, 4, 5};
    int res = FirstNegativeNumber.findFirstNegativeNumber(arr);
    @Test
    public void findFirstNegativeNumberTest() {
         Assert.assertEquals(-1, res);
    }
}
