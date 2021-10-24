package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleLongValuesTests extends BaseTest {

    @Test(dataProvider = "ValuesForMultTest")
    public void MultTest(long a, long b, long expectedValue) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of multiply operation:");
    }

    @DataProvider(name = "ValuesForMultTest")
    public Object[][] valueForSum() {
        return new Object[][]{
                {128, 2, 256},
                {0, 0, 0},
                {1, 0, 0},
                {-5, -7, 35},
                {-10, 5, -50}
        };
    }
}
