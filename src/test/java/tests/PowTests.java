package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTests extends BaseTest {

    @Test(dataProvider = "ValuesForPowTest")
    public void PowTest(double a, double b, double expectedValue) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of multiply operation:");
    }

    @DataProvider(name = "ValuesForPowTest")
    public Object[][] valueForMultiple() {
        return new Object[][]{
                {2, 2, 4},
                {2.5, 3, 15.625},
                {1, 0, 1},
                {0, 1, 0},
                {2, 1.5, 2}
        };
    }
}
