package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SinTests extends BaseTest {

    @Test(dataProvider = "ValuesForSinTest")
    public void SinTest(double a, double expectedValue) {
        BigDecimal result = BigDecimal.valueOf(calculator.sin(a)).setScale(2, RoundingMode.HALF_EVEN);
        Assert.assertEquals(result.doubleValue(), expectedValue, "Invalid result of sinus :");
    }

    @DataProvider(name = "ValuesForSinTest")
    public Object[][] valueForSin() {
        return new Object[][]{
                {90, 0.89},
                {30, -0.99},
                {180, -0.8},
                {60, -0.3}
        };
    }
}
