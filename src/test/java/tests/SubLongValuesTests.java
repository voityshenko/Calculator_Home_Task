package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongValuesTests extends BaseTest {

    @Test(dataProvider = "ValuesForSubTest")
    public void SubTest(long a, long b, long expectedValue) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sub operation for long values:");
    }

    @DataProvider(name = "ValuesForSubTest")
    public Object[][] valueForSum() {
        return new Object[][]{
                {128, 128, 0},
                {0, 0, 0},
                {1, -5, 6},
                {-5, -7, 2}
        };
    }

}
