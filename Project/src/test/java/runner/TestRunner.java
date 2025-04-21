package runner;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.Homepage;
import utils.Base;

public class TestRunner extends Base{
    ExtentReports report;
    ExtentTest test;
    @BeforeClass
    public void start(){
        report = utils.Reporter.generateExtentReports("prakash");
    }
    @BeforeMethod
    public void launch() throws IOException{
        openBrowser();
        driver.navigate().refresh();
    }
    @Test
    public void test() throws IOException{
        test = report.createTest("testcase1");
        Homepage la=new Homepage(test);
        la.testCase1();
        
    }
    @AfterMethod
    public void tear(){
        driver.quit();
    }
    @AfterClass
    public void end(){
        report.flush();
    }
}
