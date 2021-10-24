package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTests extends BaseTest {

    @Test(dataProvider = "ValuesForIsPositiveTest")
    public void IsPositiveTest(long a, boolean expectedValue) {
        Assert.assertEquals(calculator.isPositive(a), expectedValue);
    }

    @DataProvider(name = "ValuesForIsPositiveTest")
    public Object[][] valueForPositiveTest() {
        return new Object[][]{
                {90, true},
                {50, true},
                {0, false},
                {-5, false}
        };
    }
}
