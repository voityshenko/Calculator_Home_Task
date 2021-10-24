package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTests extends BaseTest {

    @Test(dataProvider = "ValuesForIsNegativeTest")
    public void IsPositiveTest(long a, boolean expectedValue) {
        Assert.assertEquals(calculator.isNegative(a), expectedValue);
    }

    @DataProvider(name = "ValuesForIsNegativeTest")
    public Object[][] valueForIsNegativeTest() {
        return new Object[][]{
                {90, false},
                {50, false},
                {0, false},
                {-5, true}
        };
    }
}
