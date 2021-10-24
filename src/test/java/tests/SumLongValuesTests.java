package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongValuesTests extends BaseTest {

    @Test(dataProvider = "ValuesForSumTest")
    public void SumTest(long a, long b, long expectedValue) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation for long values:");
    }

    @DataProvider(name = "ValuesForSumTest")
    public Object[][] valueForSum() {
        return new Object[][]{
                {128, 128, 256},
                {0, 0, 0},
                {1, -5, -4},
                {-5, -7, -12}
        };
    }
}
