package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.LifestylePageLocators;
import uistore.PenLocators;
import uistore.PersonalisedPageLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PersonalisedPageActions {
    ExtentReports extentReport;
    ExtentTest extentTest;
    WebDriverHelper helper;
    Assertion assertion;

    /*
     * Constructor Name: PersonalisedPageActions
     * Author Name: Suhana
     * Description: PersonalisedPageActions Constructor.
     */

    public PersonalisedPageActions(ExtentTest extentTest){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    /*
     * Method Name: clickOnNoThanks
     * Author Name: Suhana
     * Description: This method clicks on the Pop up.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickNoThanks(){
        try {
            helper.waitForElementToBeVisible(PenLocators.noThanks,10);
            helper.clickElement(PenLocators.noThanks);
            LoggerHandler.info("Clicked on No Thanks button");
            extentTest.log(Status.PASS, "Clicked on No Thanks button");
            Screenshot.captureScreenShot("No Thanks pop up Success");
            Reporter.attachScreenshot("pop up", extentTest, "pop up");
        } catch (Exception e) {
            Screenshot.captureScreenShot("No Thanks pop up failed");    
            Reporter.attachScreenshot("pop up", extentTest, "pop up");
            LoggerHandler.error("Could not click on No Thanks button");
            extentTest.log(Status.FAIL, "Could not click on No Thanks button");
        }
    }

    /*
     * Method Name: clickOnWhereToDeliver
     * Author Name: Suhana
     * Description: This method clicks on Where to Deliver.
     * Return Type: void
     * Parameter List: NA
     */


    public void clickOnWhereToDeliver(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.whereToDeliver,10);
            helper.clickElement(PersonalisedPageLocators.whereToDeliver);
            LoggerHandler.info("Clicked on Where to deliver?");
            extentTest.log(Status.PASS, "Clicked on Where to deliver?");
            Screenshot.captureScreenShot("Clicked Where to Deliver Success");    
            Reporter.attachScreenshot("Clicked Where to Deliver", extentTest, "Clicked Where to Deliver");
        } catch (Exception e) {
            LoggerHandler.error("Could not click on Where to deliver?");
            extentTest.log(Status.FAIL, "Could not click on Where to deliver?");
            Screenshot.captureScreenShot("Clicked Where to Deliver failed");    
            Reporter.attachScreenshot("Clicked Where to Deliver", extentTest, "Clicked Where to Deliver");
        }
    }

    /*
     * Method Name: enterKeyword
     * Author Name: Suhana
     * Description: This method enters the location.
     * Return Type: void
     * Parameter List: NA
     */

    public void enterKeyword(){
        try {
            String area_name = ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/fnp.xlsx", "Sheet1", 2, 1);
            helper.enterText(PersonalisedPageLocators.enterBar, area_name);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            helper.enterAction(PersonalisedPageLocators.enterBar);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));            
            LoggerHandler.info("Entered Bangalore");
            extentTest.log(Status.PASS, "Entered Bangalore");
            extentTest.log(Status.PASS, "Verified pincode of Bangalore");
            Screenshot.captureScreenShot("Entered Location name Success");    
            Reporter.attachScreenshot("Entered Location name", extentTest, "Entered Location name");
        } catch (Exception e) {
            LoggerHandler.error("Could not enter Bangalore");
            extentTest.log(Status.FAIL, "Could not enter Bangalore");
            Screenshot.captureScreenShot("Entered Location name failed");    
            Reporter.attachScreenshot("Entered Location name", extentTest, "Entered Location name");
        }
    }

    /*
     * Method Name: clickOnContinueShopping
     * Author Name: Suhana
     * Description: This method clicks on Continue Shopping button.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnContinueShopping(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.continueShopping, 10);
            helper.clickElement(PersonalisedPageLocators.continueShopping);
            LoggerHandler.info("Clicked on Continue Shopping");
            extentTest.log(Status.PASS, "Clicked on Continue Shopping button");
            Screenshot.captureScreenShot("Continue Shopping button Success");    
            Reporter.attachScreenshot("Continue Shopping button", extentTest, "Continue Shopping button");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Continue Shopping button");
            extentTest.log(Status.FAIL, "Could not click Continue Shopping button");
            Screenshot.captureScreenShot("Continue Shopping button failed");    
            Reporter.attachScreenshot("Continue Shopping button", extentTest, "Continue Shopping button");
        }
    }

    /*
     * Method Name: hoverOnPersonalised
     * Author Name: Suhana
     * Description: This method hovers on Personlised.
     * Return Type: void
     * Parameter List: NA
     */

    public void hoverOnPersonalised(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.personalised, 10);
            helper.hoverElement(PersonalisedPageLocators.personalised);
            LoggerHandler.info("Hovered on Magical Mugs");
            extentTest.log(Status.PASS, "Hovered on Magical Mugs");
            Screenshot.captureScreenShot("Hover Personalised Success");    
            Reporter.attachScreenshot("Hover Personalised", extentTest, "Hover Personalised");
        } catch (Exception e) {
            LoggerHandler.error("Could not hover on Magical Mugs");
            extentTest.log(Status.FAIL, "Could not hover on Magical Mugs");
            Screenshot.captureScreenShot("Hover Personalised failed");    
            Reporter.attachScreenshot("Hover Personalised", extentTest, "Hover Personalised");
        }
    }

    /*
     * Method Name: clickMugs
     * Author Name: Suhana
     * Description: This method clicks on Mugs.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickMugs(){
        try {
            helper.clickElement(PersonalisedPageLocators.mugs);
            helper.clickElement(PersonalisedPageLocators.magicalMugs);
            LoggerHandler.info("Clicked on Mugs");
            extentTest.log(Status.PASS, "Clicked on Mugs");
            Screenshot.captureScreenShot("Clicked Mugs Success");    
            Reporter.attachScreenshot("Clicked Mugs", extentTest, "Clicked Mugs");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Mugs");
            extentTest.log(Status.FAIL, "Could not click Mugs");
            Screenshot.captureScreenShot("Clicked Mugs failed");    
            Reporter.attachScreenshot("Clicked Mugs", extentTest, "Clicked Mugs");
        }
    }

    /*
     * Method Name: clickmagicalMugs
     * Author Name: Suhana
     * Description: This method clicks on Magical Mugs.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickmagicalMugs(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.magicalMugs, 10);
            helper.clickElement(PersonalisedPageLocators.magicalMugs);
            LoggerHandler.info("Clicked on Magical Mugs");
            extentTest.log(Status.PASS, "Clicked on Magical Mugs");
            Screenshot.captureScreenShot("Clicked Magical Mugs Success");    
            Reporter.attachScreenshot("Clicked Magical Mugs", extentTest, "Clicked Magical Mugs");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Magical Mugs");
            extentTest.log(Status.FAIL, "Could not click Magical Mugs");
            Screenshot.captureScreenShot("Clicked Magical Mugs failed");    
            Reporter.attachScreenshot("Clicked Magical Mugs", extentTest, "Clicked Magical Mugs");
        }
    }

    /*
     * Method Name: clickOnFirstProduct
     * Author Name: Suhana
     * Description: This method clicks on the first product.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.firstProduct, 10);
            helper.clickElement(PersonalisedPageLocators.firstProduct);
            LoggerHandler.info("Clicked on First Product");
            extentTest.log(Status.PASS, "Clicked on First Product");
            Screenshot.captureScreenShot("Clicked first mug Success");    
            Reporter.attachScreenshot("Clicked first mug", extentTest, "Clicked first mug");
        } catch (Exception e) {
            LoggerHandler.error("Could not click First Product");
            extentTest.log(Status.FAIL, "Could not click First Product");
            Screenshot.captureScreenShot("Clicked first mug failed");    
            Reporter.attachScreenshot("Clicked first mug", extentTest, "Clicked first mug");
        }
    }

    /*
     * Method Name: tabSwitch
     * Author Name: Suhana
     * Description: This method switches to a new tab.
     * Return Type: void
     * Parameter List: NA
     */

    public void tabSwitch(){
        try {
            helper.switchWindow();
            LoggerHandler.info("Verified new page text");
            extentTest.log(Status.PASS, "Verified new page text");
            Screenshot.captureScreenShot("new page text Success");    
            Reporter.attachScreenshot("new page text", extentTest, "new page text");
        } catch (Exception e) {
            LoggerHandler.error("Could not verify the new page text");
            extentTest.log(Status.FAIL, "Could not verify the new page text");
            Screenshot.captureScreenShot("new page text failed");    
            Reporter.attachScreenshot("new page text", extentTest, "new page text");
        }
    }

    /*
     * Method Name: clickOnCart
     * Author Name: Suhana
     * Description: This method clicks on Add to Cart button.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnCart(){
        try {
            
            helper.waitForElementToBeVisible(PersonalisedPageLocators.addToCart, 10);
            helper.clickElement(PersonalisedPageLocators.addToCart);
            Screenshot.captureScreenShot("Available");
            Reporter.attachScreenshot("available", extentTest, "available");
            LoggerHandler.info("Clicked on Add To Cart");
            extentTest.log(Status.PASS, "Clicked on Add To Cart");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Add To Cart");
            extentTest.log(Status.FAIL, "Could not click Add To Cart");
            Screenshot.captureScreenShot("Available failed");
            Reporter.attachScreenshot("available", extentTest, "available");
        }
    }

    /*
     * Method Name: personalisedGiftsMethod
     * Author Name: Suhana
     * Description: This method is to cluster all the methods.
     * Return Type: void
     * Parameter List: NA
     */

    public void personalisedGiftsMethod(){
        clickNoThanks();
        clickOnWhereToDeliver();
        enterKeyword();
        clickOnContinueShopping();
        hoverOnPersonalised();
        clickMugs();
        clickmagicalMugs();
        clickOnFirstProduct();
        tabSwitch();
        clickOnCart();
    }
}
