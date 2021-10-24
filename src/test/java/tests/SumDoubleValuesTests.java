package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleValuesTests extends BaseTest {

    @Test(dataProvider = "ValuesForSumTest")
    public void SumTest(double a, double b, double expectedValue) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation for double values:");
    }

    @DataProvider(name = "ValuesForSumTest")
    public Object[][] valueForSum() {
        return new Object[][]{
                {1.5, 2, 3.5},
                {0, 0, 0},
                {1, -5.5, -4.5},
                {-5.2, -7.3, -12.5}
        };
    }
}
