package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentTests extends BaseTest {

    @Test(dataProvider = "ValuesForTangentTest")
    public void TangentTest(double a, double expectedValue) {
        Assert.assertEquals(calculator.tg(a), expectedValue, "Invalid result of tangent :");
    }

    @DataProvider(name = "ValuesForTangentTest")
    public Object[][] valueForTangent() {
        return new Object[][]{
                {90, 1},
                {2.5, 1},
                {1, 1},
                {60, 1}
        };
    }
}
