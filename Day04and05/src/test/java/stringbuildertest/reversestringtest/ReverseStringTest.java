package stringbuildertest.reversestringtest;

import org.junit.Assert;
import org.junit.Test;
import stringbuilder.reverseastring.ReverseString;

public class ReverseStringTest {


    @Test
    public void reverseStringTest(){
        Assert.assertEquals("mo",ReverseString.reverseString("om"));
    }

}
