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
import pages.FooterPageActions;
import pages.LifestylePageActions;
import pages.Pen;
import pages.PersonalisedPageActions;
import pages.Plants;
import utils.Base;
import utils.LoggerHandler;

public class TestRunner extends Base{

    ExtentReports extentReport;
    ExtentTest extenttest;
@BeforeClass
public void start(){
        extentReport = utils.Reporter.generateReport("fnp");
        extenttest=extentReport.createTest("fnp_test");
        
}
@BeforeMethod
    public void launch() throws IOException{
        openBrowser();
    }
    @Test
    public void pen_testcase() throws IOException, InterruptedException{
        Pen penActions=new Pen(extenttest);
        penActions.pen(); 
    }
    @Test
    public void plant_testcase() throws IOException{
        Plants plantActions=new Plants(extenttest);
        plantActions.plant();    
    }
    @Test
    public void cake_testcase() throws IOException{
        Cake cakeActions=new Cake(extenttest);
        cakeActions.cake();
    }

    @Test
    public void birthdayCakesProductVerification(){
        BirthdayCakesActions birthdayCakesActionsObject= new BirthdayCakesActions(extenttest);
        birthdayCakesActionsObject.BirthdayCakes();

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

    @Test
        public void footerAndVerification(){
            FooterAndVerificationActions footerAndVerificationActionsObject = new FooterAndVerificationActions(extenttest); 
            footerAndVerificationActionsObject.FooterAndVerificationMethods(); 

        }
    @Test
    public void combo_testcase() throws InterruptedException, IOException{
        Combos comboAction=new Combos(extenttest);
        comboAction.clickBangalore();
    }
    @Test
    public void lifeStyleAction(){
        LifestylePageActions lifeStyle=new LifestylePageActions(extenttest);
        lifeStyle.lifestyleRingsMethod();
    }
    @Test
    public void personalisedAction(){
        PersonalisedPageActions PersonalisedAction=new PersonalisedPageActions(extenttest);
        PersonalisedAction.personalisedGiftsMethod();
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