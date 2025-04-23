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
            Screenshot.captureScreenShot("PopUp Success");
            Reporter.attachScreenshot("pop up", extentTest, "pop up");  
        } catch (Exception e) {
            Screenshot.captureScreenShot("PopUp failed");    
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
            Screenshot.captureScreenShot("Clicked Location Success");    
            Reporter.attachScreenshot("Clicked Location", extentTest, "Clicked Location");

        } catch (Exception e) {
            Screenshot.captureScreenShot("Clicked Location failed");    
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
            String area_name = ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/fnp.xlsx","Sheet1",6,1);
            helper.enterText(LifestylePageLocators.searchBar, area_name);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Thread.sleep(2000);
            helper.enterAction(LifestylePageLocators.searchBar);
            Thread.sleep(2000);
            helper.enterAction(LifestylePageLocators.searchBar);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));            
            LoggerHandler.info("verify the pincode");
            extentTest.log(Status.PASS, "verify the pincode");
            Screenshot.captureScreenShot("Entered Location Success");    
            Reporter.attachScreenshot("Entered Location", extentTest, "Entered Location");
        } catch (Exception e) {
            LoggerHandler.error("Could not verify the pincode");
            extentTest.log(Status.FAIL, "Could not verify the pincode");
            Screenshot.captureScreenShot("Entered Location failed");    
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
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));            
            LoggerHandler.info("Clicked on Continue Shopping Button");
            extentTest.log(Status.PASS, "Clicked on Continue Shopping Button");
            Screenshot.captureScreenShot("Continue Shopping Success");    
            Reporter.attachScreenshot("Continue Shopping", extentTest, "Continue Shopping");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click Continue Shopping Button");
            extentTest.log(Status.FAIL, "Could not click Continue Shopping Button");
            Screenshot.captureScreenShot("Continue Shopping failed");    
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
            Screenshot.captureScreenShot("Hover Lifestyle Success");    
            Reporter.attachScreenshot("Hover Lifestyle", extentTest, "Hover Lifestyle");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not hover on Lifestyle");
            extentTest.log(Status.FAIL, "Could not hover on Lifestyle");
            Screenshot.captureScreenShot("Hover Lifestyle failed");    
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
            Screenshot.captureScreenShot("Clicked Jewellery Success");    
            Reporter.attachScreenshot("Clicked Jewellery", extentTest, "Clicked Jewellery");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Jewellery");
            extentTest.log(Status.FAIL, "Could not click Jewellery");
            Screenshot.captureScreenShot("Clicked Jewellery failed");    
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
            Screenshot.captureScreenShot("Clicked Rings Success");    
            Reporter.attachScreenshot("Clicked Rings", extentTest, "Clicked Rings");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Rings");
            extentTest.log(Status.FAIL, "Could not click Rings");
            Screenshot.captureScreenShot("Clicked Rings failed");    
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
            Screenshot.captureScreenShot("Clicked first ring Success");    
            Reporter.attachScreenshot("Clicked first ring", extentTest, "Clicked first ring");
        } catch (Exception e) {
            LoggerHandler.error("Could not click First Ring");
            extentTest.log(Status.FAIL, "Could not click First Ring");
            Screenshot.captureScreenShot("Clicked first ring failed");    
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
            Screenshot.captureScreenShot("Verified the text Success");    
            Reporter.attachScreenshot("Verified the text", extentTest, "Verified the text");
        } catch (Exception e) {
            LoggerHandler.error("Could not verify the text");
            extentTest.log(Status.FAIL, "Could not verify the text");
            Screenshot.captureScreenShot("Verified the text failed");    
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
            Screenshot.captureScreenShot("Reviews");
            Reporter.attachScreenshot("Reviews", extentTest, "Reviews");
            LoggerHandler.info("Clicked on Add To Cart Button");
            extentTest.log(Status.PASS, "Clicked on Add To Cart Button");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click Add To Cart Button");
            extentTest.log(Status.FAIL, "Could not click Add To Cart Button");
            Screenshot.captureScreenShot("Reviews failed");
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
