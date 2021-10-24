package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("On test start: " + result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Success of test cases and its details are : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failure of test cases and its details are : " + result.getName());
    }


}
