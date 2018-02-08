package Report;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.awt.*;
import java.util.Random;


/**
 * Created by DinhNguyen on 8/21/17.
 */
public class ListenerTest implements ITestListener {

    //@Override
    public void onFinish(ITestContext Result) {
    }

    // @Override
    public void onStart(ITestContext Result) {
    }

    // @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

    }

    // When Test case get failed, this method is called.
    //  @Override
    public void onTestFailure(ITestResult Result) {
        System.out.println("Test case FAILED: " + Result.getName());
    }

    // When Test case get Skipped, this method is called.
    // @Override
    public void onTestSkipped(ITestResult Result)
    {
        System.out.println("The name of the testcase Skipped is: "+Result.getName());
    }
    // When Test case get Started, this method is called.
    // @Override
    public void onTestStart(ITestResult Result) {
        String i = Result.getName();
            System.out.println("Run_Test_Case_Title: "+ i);
    }

    // When Test case get passed, this method is called.
    // @Override
    public void onTestSuccess(ITestResult Result) {
        System.out.println("Test_Case_Passed: "+Result.getName());
    }
}


