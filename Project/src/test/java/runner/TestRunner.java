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
import pages.AnniversaryPageActions;
import pages.Cake;
import pages.Combos;
import pages.FooterAndVerificationActions;
import pages.FooterPageActions;
import pages.LifestylePageActions;
import pages.Pen;
import pages.PersonalisedPageActions;
import pages.Plants;
import utils.Base;

public class TestRunner extends Base {

    ExtentReports extentReport;
    ExtentTest extentTest;
    @BeforeClass
    public void start() {
        extentReport = utils.Reporter.generateReport("fnp");
        
}

    @BeforeMethod
    public void launch() throws IOException {
        openBrowser();
    }
    @Test
    public void pen_testcase01() throws IOException, InterruptedException {
        extentTest=extentReport.createTest("pen_test");
        Pen penActionsObject = new Pen(extentTest);
        penActionsObject.pen();
    }

    @Test
    public void plant_testcase06() throws IOException {
        extentTest=extentReport.createTest("plant_test");
        Plants plantActionsObject = new Plants(extentTest);
        plantActionsObject.plant();
    }

    @Test
    public void cake_testcase02() throws IOException {
        extentTest=extentReport.createTest("cake_test");
        Cake cakeActionsObject = new Cake(extentTest);
        cakeActionsObject.cake();
    }

    @Test
    public void birthdayCakesProductVerification_testcase04() {
        extentTest=extentReport.createTest("birthday_test");
        BirthdayCakesActions birthdayCakesActionsObject = new BirthdayCakesActions(extentTest);
        birthdayCakesActionsObject.BirthdayCakes();
    }

    @Test
    public void anniversary_testcase03() {
        extentTest=extentReport.createTest("anniversary_test");
        AnniversaryPageActions anniversaryPageActionsObject = new AnniversaryPageActions(extentTest);
        anniversaryPageActionsObject.testAnniversary();
    }

    @Test
    public void footer_testcase08() {
        extentTest=extentReport.createTest("footer_test");
        FooterPageActions footerPageActionsObject = new FooterPageActions(extentTest);
        footerPageActionsObject.testFooter();
    }

    @Test
    public void footerAndVerification_testcase09() {
        extentTest=extentReport.createTest("footerverify_test");
        FooterAndVerificationActions footerAndVerificationActionsObject = new FooterAndVerificationActions(extentTest);
        footerAndVerificationActionsObject.footerAndVerificationMethods();
    }

    @Test
    public void combo_testcase07() throws InterruptedException, IOException {
        extentTest=extentReport.createTest("combos_test");
        Combos comboActionObject = new Combos(extentTest);
        comboActionObject.clickBangalore();
    }

    @Test
    public void lifeStyle_testcase10() {
        extentTest=extentReport.createTest("lifestyle_test");
        LifestylePageActions lifeStyleObject = new LifestylePageActions(extentTest);
        lifeStyleObject.lifestyleRingsMethod();
    }

    @Test
    public void personalised_testcase05() {
        extentTest=extentReport.createTest("personalised_test");
        PersonalisedPageActions PersonalisedActionObject = new PersonalisedPageActions(extentTest);
        PersonalisedActionObject.personalisedGiftsMethod();
    }
    @AfterMethod
    public void tear() {
        driver.quit();
    }

    @AfterClass
    public void end() {
        extentReport.flush();

    }
}