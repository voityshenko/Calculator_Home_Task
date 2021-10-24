package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgTests extends BaseTest {

    @Test(dataProvider = "ValuesForCtgTest")
    public void CtgTest(double a, double expectedValue) {
        Assert.assertEquals(calculator.ctg(a), expectedValue, "Invalid result of ctg :");
    }

    @DataProvider(name = "ValuesForCtgTest")
    public Object[][] valueForCtg() {
        return new Object[][]{
                {90, 1},
                {50, 1},
                {60, 1}
        };
    }
}
