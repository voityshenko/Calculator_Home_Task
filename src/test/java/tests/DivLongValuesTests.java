package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DivLongValuesTests extends BaseTest {

    @Test(dataProvider = "ValuesForDivTest")
    public void DivTest(long a, long b, long expectedValue) {
        long result = calculator.div(a, b);
        assertEquals(result, expectedValue, "Invalid result of divide operation:");
    }

    @Test(groups = "negativeTest")
    public void DivNegativeTest() {
        double result = calculator.div(1.5, 0);
        assertTrue(Double.isInfinite(result), "Divide by zero gives infinity as result");
    }

    @DataProvider(name = "ValuesForDivTest")
    public Object[][] valueForDiv() {
        return new Object[][]{
                {10, 2, 5},
                {0, 1, 0},
                {-10, -3, 3},
                {-10, 5, -2}
        };
    }

}
