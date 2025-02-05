package stringbuffertest.concatenatestringstest;

import org.junit.Assert;
import org.junit.Test;
import stringbuffer.concatenatestrings.ConcatenateStrings;

public class ConcatenateStringsTest {
    @Test
    public void concatenateStrings() {
       String[] words = {"Hello", " ", "Java"};
        Assert.assertEquals("Hello Java", ConcatenateStrings.concatenateStrings(words));
    }
}
