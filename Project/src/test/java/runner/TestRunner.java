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

import pages.LifestylePageActions;
import pages.PersonalisedPageActions;
import utils.Base;
import utils.LoggerHandler;

public class TestRunner extends Base{
    ExtentReports extentReport;
    ExtentTest extentTest;
    @BeforeClass
    public void start(){
        extentReport = utils.Reporter.generateReport("prakash");
            
    }
    @BeforeMethod
    public void launch() {
        openBrowser();
        driver.navigate().refresh();
    }



    @Test(enabled = true)
    public void personalisedGifts(){
        try {
            extentTest = extentReport.createTest("testcase_5");
            PersonalisedPageActions personalisedpageactionsObject = new PersonalisedPageActions(extentTest);

            personalisedpageactionsObject.personalisedGiftsMethod();
            
        } catch (Exception e) {
            LoggerHandler.info("Verification failed in runner");
        }
    }

    @Test(enabled = true)
    public void lifestyleRings(){
        try {
            extentTest = extentReport.createTest("testcase_10");
            LifestylePageActions lifestylepageactionsObject = new LifestylePageActions(extentTest);
            lifestylepageactionsObject.lifestyleRingsMethod();
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
