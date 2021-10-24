package tests;

import org.junit.Assert;
import org.junit.Test;


public class SqrtTests extends BaseTest {

    @Test
    public void SqrtTest() {
        double result = calculator.sqrt(4);
        Assert.assertEquals("Invalid result of sub operation for long values:", result, 2, 0);
    }
}
