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
    ExtentReports extent;
    ExtentTest extentTest;
    WebDriverHelper helper;
    Assertion assertion;

    public LifestylePageActions(ExtentTest extentTest){
        helper = new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;
    }

    public void clickOnNoThanks(){
        helper.waitForElementToBeVisible(AnniversaryPageLocators.noThanks,10);
        helper.clickElement(AnniversaryPageLocators.noThanks);
    }
    public void clickOnDeliver(){
        try {
            helper.clickElement(LifestylePageLocators.location);
            LoggerHandler.info("Clicked on Location");
            extentTest.log(Status.PASS, "Clicked on Location");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click on location");
            extentTest.log(Status.FAIL, "Could not click on location");
        }
    }

    public void enterLocation(){
        try {
            String area_name = ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/fnp.xlsx","Sheet1",6,1);
            helper.enterText(LifestylePageLocators.searchBar, area_name);
            helper.enterText(LifestylePageLocators.searchBar, "Kolkata");
            // helper.enterText(LifestylePageLocators.searchBar, ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/Excel.xlsx", "Sheet1", 1, 0));
            Thread.sleep(1000);

            helper.enterAction(LifestylePageLocators.searchBar);
            Thread.sleep(1000);            
            Thread.sleep(2000);
            helper.enterAction(LifestylePageLocators.searchBar);
            Thread.sleep(3000);
            LoggerHandler.info("Entered Kolkata");
            extentTest.log(Status.PASS, "Entered Kolkata");
            extentTest.log(Status.PASS, "Verify the pincode");
            //helper.enterText(LifestylePageLocators.pincodeKolkata, "700073");
            extentTest.log(Status.PASS, "Verified pincode of Kolkata");
        } catch (Exception e) {
            LoggerHandler.error("Could not enter Kolkata");
            extentTest.log(Status.FAIL, "Could not enter Kolkata");
        }
        
    }

    public void clickOnContinueShopping(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.continueShopping,10);
            helper.clickElement(LifestylePageLocators.continueShopping);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));            
            LoggerHandler.info("Clicked on Continue Shopping Button");
            extentTest.log(Status.PASS, "Clicked on Continue Shopping Button");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click Continue Shopping Button");
            extentTest.log(Status.FAIL, "Could not click Continue Shopping Button");
        }
    }

    public void hoverOnLifestyle(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.lifestyle, 10);
            helper.hoverElement(LifestylePageLocators.lifestyle);
            LoggerHandler.info("Hovered on Lifestyle");
            extentTest.log(Status.PASS, "Hovered on Lifestyle");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not hover on Lifestyle");
            extentTest.log(Status.FAIL, "Could not hover on Lifestyle");
        }
    }

    public void clickOnJewellery(){
        try {
            helper.clickElement(LifestylePageLocators.jewellery);
            helper.clickElement(LifestylePageLocators.rings);
            LoggerHandler.info("Clicked on Jewellery");
            extentTest.log(Status.PASS, "Clicked on Jewellery");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click Jewellery");
            extentTest.log(Status.FAIL, "Could not click Jewellery");
        }
    }

    public void clickOnRings(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.rings, 10);
            helper.clickElement(LifestylePageLocators.rings);
            LoggerHandler.info("Clicked on Rings");
            extentTest.log(Status.PASS, "Clicked on Rings");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click Rings");
            extentTest.log(Status.FAIL, "Could not click Rings");
        }

    }

    public void clickOnfirstProduct(){
        try {
            helper.waitForElementToBeVisible(LifestylePageLocators.firstProduct, 10);
            helper.clickElement(LifestylePageLocators.firstProduct);
            LoggerHandler.info("Clicked on First Ring");
            extentTest.log(Status.PASS, "Clicked on First Ring");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click First Ring");
            extentTest.log(Status.FAIL, "Could not click First Ring");
        }
    }

    public void switchTab(){
        helper.switchWindow();
        LoggerHandler.info("Verified the text");
        extentTest.log(Status.PASS, "Verified the text");
    }

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
        }
    }

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
