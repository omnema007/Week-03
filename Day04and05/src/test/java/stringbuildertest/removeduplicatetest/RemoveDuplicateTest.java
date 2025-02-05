package stringbuildertest.removeduplicatetest;

import org.junit.Assert;
import org.junit.Test;
import stringbuilder.removeduplicatesfromstring.RemoveDuplicates;

public class RemoveDuplicateTest {
    @Test
    public void removeDuplicateTest() {
        Assert.assertEquals("helo", RemoveDuplicates.removeDuplicates("hello"));
    }
}
