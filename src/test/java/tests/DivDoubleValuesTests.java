package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DivDoubleValuesTests extends BaseTest {

    @Test(dataProvider = "ValuesForDivTest")
    public void DivTest(double a, double b, double expectedValue) {
        double result = calculator.div(a, b);
        assertEquals(result, expectedValue, "Invalid result of divide operation:");
    }

    @Test
    public void DivNegativeTest() {
        double result = calculator.div(1.5, 0);
        assertTrue(Double.isInfinite(result), "Divide by zero gives infinity as result");
    }

    @DataProvider(name = "ValuesForDivTest")
    public Object[][] valueForDiv() {
        return new Object[][]{
                {10.6, 2, 5.3},
                {0, 1, 0},
                {-10, 5, -2}
        };
    }

}
