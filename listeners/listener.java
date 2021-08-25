package listeners;

 

import java.io.File;


 


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

 

public class listener implements ITestListener {

 

    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub
            System.out.println("Test case is finished" );
    }

 

    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test case is ready to execute" );
    }

 

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test case is failed with minimum err" );
    }

 

    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test case is failed" +arg0.getName());
    }

 

    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test case is skipped " );
    }

 

    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test case is ready for execute " );
    }

 

    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Test case is Runned Successfully" );
    }

 

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

 

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

 

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

 

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

 

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
    

 

}
