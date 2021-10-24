package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDoubleValuesTests extends BaseTest {

    @Test(dataProvider = "ValuesForMultTest")
    public void MultipleTest(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of multiply operation:");
    }

    @DataProvider(name = "ValuesForMultTest")
    public Object[][] valueForMultiple() {
        return new Object[][]{
                {128.5, 2, 257},
                {0, 0, 0},
                {1, 0, 0},
                {-5, -7, 35},
                {-10, 5, -50}
        };
    }
}
