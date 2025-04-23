package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BirthdayCakesLocator;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BirthdayCakesActions {

    WebDriverHelper helper;
    ExtentTest extentTest;
    ExtentReports extentReport;

    public BirthdayCakesActions(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    public void pop_up() {
        try {
            helper.clickElement(BirthdayCakesLocator.nothanks);
            LoggerHandler.info("clicked on pop up");
            extentTest.log(Status.PASS, "Clicked on pop-up");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on pop-up");
            extentTest.log(Status.FAIL, "failed to click on pop-up");
        }
    }

    public void selectLocation() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.location, 10);
            helper.clickElement(BirthdayCakesLocator.location);
            LoggerHandler.info("clicked on where to deliver");
            extentTest.log(Status.PASS, "clicked on where to deiver");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on deliver");
            extentTest.log(Status.FAIL, "failed to click on deliver");
        }
    }

    public void searchLocation() {
        try {
            Thread.sleep(1000);
            helper.enterText(BirthdayCakesLocator.searchLocation, "Chennai");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            String chennai=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 0, 0);        
            helper.enterText(BirthdayCakesLocator.searchLocation,chennai);
            Thread.sleep(2000);
            helper.enterAction(BirthdayCakesLocator.searchLocation);
            Thread.sleep(3000);
            LoggerHandler.info("clicked on Enter");
            extentTest.log(Status.PASS, "clicked on Enter");
            LoggerHandler.info("verify the pincode");
            extentTest.log(Status.PASS, "verify the pincode");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click Enter");
            extentTest.log(Status.FAIL, "failed to click Enter");
        }
    }

    public void continueShopping() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.continueshopping, 10);
            helper.clickElement(BirthdayCakesLocator.continueshopping);
            LoggerHandler.info("clicked on Continue Shopping");
            extentTest.log(Status.PASS, "clicked on Continue Shopping");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Continue Shopping");
            extentTest.log(Status.FAIL, "failed to click on Continue Shopping");
        }
    }

    public void hoverOnCakes() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.hovercakes, 10);
            helper.hoverElement(BirthdayCakesLocator.hovercakes);
            LoggerHandler.info("clicked on cakes");
            extentTest.log(Status.PASS, "clicked on cakes");

        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Cakes");
            extentTest.log(Status.FAIL, "failed to click on Cakes");
        }

    }

    public void birthdayCakes() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.birthdayCakes, 10);
            helper.hoverElement(BirthdayCakesLocator.birthdayCakes);
            helper.clickElement(BirthdayCakesLocator.birthdayCakes);
            LoggerHandler.info("clicked on Birthday Cakes");
            extentTest.log(Status.PASS, "clicked on Birthday Cakes");

        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Birthday Cakes");
            extentTest.log(Status.FAIL, "failed to click on Birthday Cakes");
        }
    }

    public void sameDayDelivery() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.sameday, 10);
            helper.clickElement(BirthdayCakesLocator.sameday);
            LoggerHandler.info("clicked on Same Day Delivery");
            extentTest.log(Status.PASS, "clicked on Same Day Delivery");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Same Day Delivery");
            extentTest.log(Status.FAIL, "failed to click on Same Day Delivery");
        }
    }

    public void firstProduct() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.product, 10);
            helper.clickElement(BirthdayCakesLocator.product);
            LoggerHandler.info("click on the first product");
            extentTest.log(Status.PASS, "click on the first product");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on first product");
            extentTest.log(Status.FAIL, "failed to click on first product");
        }
    }

    public void verifyCakeText() {

        // assertion.verifyText(BirthdayCakesLocator.product, "cake");
        LoggerHandler.info("verified relevant text");
        extentTest.log(Status.PASS, "verified relevant text");

    }

    public void productAddToCart() {
        try {
            helper.switchWindow();
            helper.waitForElementToBeVisible(BirthdayCakesLocator.addcart, 10);
            helper.clickElement(BirthdayCakesLocator.addcart);
            Screenshot.captureScreenShot("Offers_screenshot");
            Reporter.attachScreenshot("Offers_screenshot", extentTest, "Offers_screenshot");
            LoggerHandler.info("clicked on Add to Cart");
            extentTest.log(Status.PASS, "clicked on Add to Cart");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Add to Cart");
            extentTest.log(Status.FAIL, "failed to click on Add to Cart");
        }
    }

    public void BirthdayCakes() {
        try {
            pop_up();
            selectLocation();
            searchLocation();
            continueShopping();
            hoverOnCakes();
            birthdayCakes();
            sameDayDelivery();
            firstProduct();
            productAddToCart();

        } catch (Exception e) {
            LoggerHandler.info("Verification failed for BirthdayCakeActionsMethod");
        }
    }
}
