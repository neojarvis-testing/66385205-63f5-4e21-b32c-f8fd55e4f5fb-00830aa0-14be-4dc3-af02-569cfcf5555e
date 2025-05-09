package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AnniversaryPageLocators;
import uistore.LifestylePageLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LifestylePageActions {
    ExtentReports extentReport;
    ExtentTest extentTest;
    WebDriverHelper helper;
    Assertion assertion;

    /*
     * Constructor Name: LifestylePageActions
     * Author Name: Suhana
     * Description: LifestylePageActions Constructor.
     */

    public LifestylePageActions(ExtentTest extentTest){
        helper = new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;
    }

    /*
     * Method Name: clickOnNoThanks
     * Author Name: Suhana
     * Description: This method clicks on the Pop up.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnNoThanks(){
        try {
            helper.waitForElementToBeVisible(AnniversaryPageLocators.noThanks,10);
            helper.clickElement(AnniversaryPageLocators.noThanks);
            LoggerHandler.info("Clicked on No Thanks button");
            extentTest.log(Status.PASS, "Clicked on No Thanks button");
        } catch (Exception e) {
            Reporter.attachScreenshot("pop up", extentTest, "pop up");
            LoggerHandler.error("Could not click on No Thanks button");
            extentTest.log(Status.FAIL, "Could not click on No Thanks button");
        }
    }

    /*
     * Method Name: clickOnDeliver
     * Author Name: Suhana
     * Description: This method clicks on Where to Deliver.
     * Return Type: void
     * Parameter List: NA
     */


    public void clickOnDeliver(){
        try {
            helper.clickElement(LifestylePageLocators.location);
            LoggerHandler.info("Clicked on Location");
            extentTest.log(Status.PASS, "Clicked on Location");
        } catch (Exception e) {
            Reporter.attachScreenshot("Clicked Location", extentTest, "Clicked Location");
            LoggerHandler.error("Could not click on location");
            extentTest.log(Status.FAIL, "Could not click on location");
        }
    }

    /*
     * Method Name: enterLocation
     * Author Name: Suhana
     * Description: This method clicks on Location search bar.
     * Return Type: void
     * Parameter List: NA
     */

    public void enterLocation(){
        try {
            String kolkata=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 6, 1);
            helper.enterText(LifestylePageLocators.searchBar, kolkata);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Thread.sleep(2000);
            helper.enterAction(LifestylePageLocators.searchBar);
            Thread.sleep(2000);          
            LoggerHandler.info("verify the pincode");
            extentTest.log(Status.PASS, "verify the pincode");
        } catch (Exception e) {
            LoggerHandler.error("Could not verify the pincode");
            extentTest.log(Status.FAIL, "Could not verify the pincode");
            Reporter.attachScreenshot("Entered Location", extentTest, "Entered Location");
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
            helper.waitForElementToBeVisible(LifestylePageLocators.continueShopping,10);
            helper.clickElement(LifestylePageLocators.continueShopping);
            Thread.sleep(2000);
            LoggerHandler.info("Clicked on Continue Shopping Button");
            extentTest.log(Status.PASS, "Clicked on Continue Shopping Button");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Continue Shopping Button");
            extentTest.log(Status.FAIL, "Could not click Continue Shopping Button");
            Reporter.attachScreenshot("Continue Shopping", extentTest, "Continue Shopping");
        }
    }

    /*
     * Method Name: hoverOnLifestyle
     * Author Name: Suhana
     * Description: This method hovers on Lifestyle.
     * Return Type: void
     * Parameter List: NA
     */

    public void hoverOnLifestyle(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.lifestyle, 10);
            helper.hoverElement(LifestylePageLocators.lifestyle);
            LoggerHandler.info("Hovered on Lifestyle");
            extentTest.log(Status.PASS, "Hovered on Lifestyle");
        } catch (Exception e) {
            LoggerHandler.error("Could not hover on Lifestyle");
            extentTest.log(Status.FAIL, "Could not hover on Lifestyle");
            Reporter.attachScreenshot("Hover Lifestyle", extentTest, "Hover Lifestyle");
        }
    }

    /*
     * Method Name: clickOnJewellery
     * Author Name: Suhana
     * Description: This method clicks on Jewellery.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnJewellery(){
        try {
            helper.clickElement(LifestylePageLocators.jewellery);
            helper.clickElement(LifestylePageLocators.rings);
            LoggerHandler.info("Clicked on Jewellery");
            extentTest.log(Status.PASS, "Clicked on Jewellery");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Jewellery");
            extentTest.log(Status.FAIL, "Could not click Jewellery");
            Reporter.attachScreenshot("Clicked Jewellery", extentTest, "Clicked Jewellery");
        }
    }

    /*
     * Method Name: clickOnRings
     * Author Name: Suhana
     * Description: This method clicks on Rings.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnRings(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.rings, 10);
            helper.clickElement(LifestylePageLocators.rings);
            LoggerHandler.info("Clicked on Rings");
            extentTest.log(Status.PASS, "Clicked on Rings");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Rings");
            extentTest.log(Status.FAIL, "Could not click Rings");
            Reporter.attachScreenshot("Clicked Rings", extentTest, "Clicked Rings");
        }

    }

    /*
     * Method Name: clickOnfirstProduct
     * Author Name: Suhana
     * Description: This method clicks on the first product.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnfirstProduct(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.firstProduct, 10);
            helper.clickElement(LifestylePageLocators.firstProduct);
            LoggerHandler.info("Clicked on First Ring");
            extentTest.log(Status.PASS, "Clicked on First Ring");
        } catch (Exception e) {
            LoggerHandler.error("Could not click First Ring");
            extentTest.log(Status.FAIL, "Could not click First Ring");
            Reporter.attachScreenshot("Clicked first ring", extentTest, "Clicked first ring");
        }
    }

    /*
     * Method Name: switchTab
     * Author Name: Suhana
     * Description: This method switches to a new tab.
     * Return Type: void
     * Parameter List: NA
     */

    public void switchTab(){
        try {
            helper.switchWindow();
            LoggerHandler.info("Verified the text");
            extentTest.log(Status.PASS, "Verified the text");
        } catch (Exception e) {
            LoggerHandler.error("Could not verify the text");
            extentTest.log(Status.FAIL, "Could not verify the text");
            Reporter.attachScreenshot("Verified the text", extentTest, "Verified the text");
        }
    }

    /*
     * Method Name: clickOnAddToCart
     * Author Name: Suhana
     * Description: This method clicks on Add to Cart button.
     * Return Type: void
     * Parameter List: NA
     */

    public void clickOnAddToCart(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.addToCart, 10);
            helper.clickElement(LifestylePageLocators.addToCart);
            LoggerHandler.info("Clicked on Add To Cart Button");
            extentTest.log(Status.PASS, "Clicked on Add To Cart Button");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Add To Cart Button");
            extentTest.log(Status.FAIL, "Could not click Add To Cart Button");
            Reporter.attachScreenshot("Reviews", extentTest, "Reviews");
        }
    }

    /*
     * Method Name: lifestyleRingsMethod
     * Author Name: Suhana
     * Description: This method is to cluster all the methods.
     * Return Type: void
     * Parameter List: NA
     */

    public void lifestyleRingsMethod(){
        clickOnNoThanks();
        clickOnDeliver();
        enterLocation();
        clickOnContinueShopping();
        hoverOnLifestyle();
        clickOnJewellery();
        clickOnRings();
        clickOnfirstProduct();
        switchTab();
        clickOnAddToCart();
    }
}
