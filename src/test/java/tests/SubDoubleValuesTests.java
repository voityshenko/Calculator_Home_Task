package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleValuesTests extends BaseTest {

    @Test(dataProvider = "ValuesForSubTest")
    public void SubTest(double a, double b, double expectedValue) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sub operation for long values:");
    }

    @DataProvider(name = "ValuesForSubTest")
    public Object[][] valueForSub() {
        return new Object[][]{
                {2.5, 2, 0.5},
                {0, 0, 0},
                {1.5, -5, 6.5},
                {-5.5, -7, 1.5}
        };
    }
}
