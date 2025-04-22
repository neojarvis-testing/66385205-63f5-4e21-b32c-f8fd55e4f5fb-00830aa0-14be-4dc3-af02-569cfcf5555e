package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.Cake;
import pages.Pen;
import pages.Plants;
import utils.Base;

public class TestRunner extends Base{
    ExtentReports report;
    ExtentTest extenttest;
    @BeforeClass
    public void start(){
        report = utils.Reporter.generateReport("fnp");
        extenttest=report.createTest("fnp_test");
        
    }
    @BeforeMethod
    public void launch() throws IOException{
        openBrowser();
    }
    @Test(priority = 1)
    public void pen_testcase() throws IOException, InterruptedException{
        Pen penActions=new Pen(extenttest);
        penActions.pen();    
    }
    @Test(priority = 2)
    public void plant_testcase() throws IOException{
        Plants plantActions=new Plants(extenttest);
        plantActions.plant();    
    }
    @Test(priority = 3)
    public void cake_testcase() throws IOException{
        Cake cakeActions=new Cake(extenttest);
        cakeActions.cake();
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
