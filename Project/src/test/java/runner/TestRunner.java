package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.Pen;
import pages.Plants;
import utils.Base;

public class TestRunner extends Base{
    ExtentReports report;
    ExtentTest extenttest;
    @BeforeClass
    public void start(){
        report = utils.Reporter.generateExtentReport("fnp");
        extenttest=report.createTest("fnp_test");
        
    }
    @BeforeMethod
    public void launch() throws IOException{
        openBrowser();
    }
    @Test
    public void test() throws IOException, InterruptedException{
        Pen la=new Pen(extenttest);
        la.pen_testcase();    
    }
    @Test
    public void test2() throws IOException{
        Plants la=new Plants(extenttest);
        la.plant_testcase();    
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
