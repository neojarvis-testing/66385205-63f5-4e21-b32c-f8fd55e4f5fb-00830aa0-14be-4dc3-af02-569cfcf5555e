package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.AnniversaryPageActions;
import pages.BirthdayCakesActions;
import pages.Cake;
import pages.FooterAndVerificationActions;
import pages.FooterPageActions;
import pages.LifestylePageActions;
import pages.Pen;
import pages.Plants;
import utils.Base;
import utils.LoggerHandler;

public class TestRunner extends Base{
    ExtentReports report;
    ExtentTest extenttest;
    @BeforeClass
    public void start(){
        report = utils.Reporter.generateReport("fnp");
        extenttest=report.createTest("fnp_test");
        
    }
    @BeforeMethod
    public void launch() {
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

    @Test
    public void anniversary_testcase(){
        AnniversaryPageActions anniversaryPageActionsObject = new AnniversaryPageActions(extenttest);
        anniversaryPageActionsObject.testAnniversary();
    }
    @Test
    public void footer_testcase(){
        FooterPageActions footerPageActionsObject = new FooterPageActions(extenttest);
        footerPageActionsObject.testFooter();
    }

    @Test(enabled = true)
    public void lifestyleRings(){
        try {
            LifestylePageActions lifestylepageactionsObject = new LifestylePageActions(extenttest);
            lifestylepageactionsObject.lifestyleRingsMethod();
        } catch (Exception e) {
            LoggerHandler.info("Verification failed in runner");
        }
    }
//
    @Test(priority = 4)
    public void BirthdayCakeMethod(){
        try {
            BirthdayCakesActions birthdayCakesObject= new BirthdayCakesActions(extenttest);
            birthdayCakesObject.birthdayCakes();
        } catch (Exception e) {
            LoggerHandler.info("Verification for BirthdayCakeMethod failed in runner");
        }
    }
    @Test(priority = 9)
    public void FooterAndVerificationMethod(){
        try {
            FooterAndVerificationActions footerpageObject = new FooterAndVerificationActions(extenttest);
            footerpageObject.footerAndVerificationMethods();
        } catch (Exception e) {
            LoggerHandler.info("Verification for FooterAndVerification Page failed in runner");
        }
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
