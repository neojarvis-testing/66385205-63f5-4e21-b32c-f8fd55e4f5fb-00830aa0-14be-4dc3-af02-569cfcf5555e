package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.BirthdayCakesActions;
import pages.FooterAndVerificationActions;
import utils.Base;
import utils.LoggerHandler;

public class TestRunner extends Base{
    ExtentReports extentReport;
    ExtentTest extentTest;
    @BeforeClass
    public void start(){
        extentReport = utils.Reporter.generateReport("Prakash");
    }
    @BeforeMethod
    public void launch() throws IOException{
        openBrowser();
        driver.navigate().refresh();
    }

    @Test(enabled = true)
    public void BirthdayCakesProductVerification(){
        try {
            extentTest = extentReport.createTest("testcase_4");
            BirthdayCakesActions birthdayCakesActionsObject= new BirthdayCakesActions(extentTest);
            birthdayCakesActionsObject.BirthdayCakes();
        } catch (Exception e) {
           LoggerHandler.info("Verification failed in runner");
        }
    }
    @Test(enabled = true)
    public void FooterAndVerification(){
        try {
         extentTest = extentReport.createTest("testcase_9");
         FooterAndVerificationActions footerAndVerificationActionsObject = new FooterAndVerificationActions(extentTest); 

         footerAndVerificationActionsObject.FooterAndVerificationMethods(); 

        } catch (Exception e) {  
            LoggerHandler.info("Verification failed in runner");
        }
    }

    @AfterMethod
    public void tear(){
        driver.quit();
    }
    @AfterClass
    public void end(){
        extentReport.flush();
    }
}
