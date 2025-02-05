package linearsearchtest.searchforaspecificwordtest;

import linearsearch.searchforaspecificword.SpecificWord;
import org.junit.Assert;
import org.junit.Test;

public class SpecificWordTest {

    String[] arr = {"Hello World", "Hello Java", "How are you"};
    String target = "are";
    String res = SpecificWord.findSpecificWord(arr, target);
    @Test
    public void findSpecificWordTest() {
        Assert.assertEquals("How are you", res);
    }
}
