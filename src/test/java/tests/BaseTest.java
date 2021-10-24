package tests;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void SetUp() {
        calculator = new Calculator();
    }

    @Before
    public void initialize() {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    @After
    public void tearDownForJunit() {
        calculator = null;
    }
}
