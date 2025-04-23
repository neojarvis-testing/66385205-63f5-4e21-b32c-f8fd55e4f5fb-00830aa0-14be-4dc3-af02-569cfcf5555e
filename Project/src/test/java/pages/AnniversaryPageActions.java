package pages;


import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AnniversaryPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class AnniversaryPageActions {
    public ExtentReports extentReport;
    public ExtentTest extentTest;
    public WebDriverHelper helper;
    public Assertion assertion;

    public AnniversaryPageActions(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    public void clickOnNoThanks(){
        helper.waitForElementToBeVisible(AnniversaryPageLocators.noThanks,10);
        helper.clickElement(AnniversaryPageLocators.noThanks);
        Reporter.attachScreenshot("FNP", extentTest, "FNP Screenshot");
    }

    public void clickOnWhereToDeliver() {
        try {
            helper.clickElement(AnniversaryPageLocators.whereToDeliver);
            LoggerHandler.info("Clicked where to deliver");
            extentTest.log(Status.PASS, "Clicked on where to deliver");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click where to deliver");
            extentTest.log(Status.FAIL, "Couldn't click on where to deliver");
        }
    }

    public void inputCity() {
        try {
            helper.enterText(AnniversaryPageLocators.inputLocation, "Chennai");
            Thread.sleep(2000);
            helper.enterAction(AnniversaryPageLocators.inputLocation);
            Screenshot.captureScreenShot("FNP");
            Thread.sleep(2000);
            LoggerHandler.info("Entered city");
            extentTest.log(Status.PASS, "Entered city");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't entered city");
            extentTest.log(Status.FAIL, "Couldn't entered city");
        }
    }

    public void clickOnContinueShopping() {
        try {
            helper.waitForElementToBeVisible(AnniversaryPageLocators.continueShopping, 10);
            helper.clickElement(AnniversaryPageLocators.continueShopping);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            LoggerHandler.info("Clicked on Continue Shopping");
            extentTest.log(Status.PASS, "Clicked on Continue Shopping");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on Continue Shopping");
            extentTest.log(Status.FAIL, "Couldn't click on Continue Shopping");
        }
    }

    public void hoverOnAnniversary() {
        try {
            helper.waitForElementToBeVisible(AnniversaryPageLocators.anniversary, 10);
            helper.hoverElement(AnniversaryPageLocators.anniversary);
            LoggerHandler.info("Hovered on anniversary");
            extentTest.log(Status.PASS, "Hovered on anniversary");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't hovered on anniversary");
            extentTest.log(Status.FAIL, "Couldn't hovered on anniversary");
        }
    }

    public void clickOnFlowers() {
        try {
            helper.clickElement(AnniversaryPageLocators.flowers);           
            LoggerHandler.info("Clicked on flowers");
            extentTest.log(Status.PASS, "Clicked on flowers");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on flowers");
            extentTest.log(Status.FAIL, "Couldn't click on flowers");
        }
    }

    public void clickOnRoses() {
        try {
            helper.clickElement(AnniversaryPageLocators.roses);
            LoggerHandler.info("Clicked on roses");
            extentTest.log(Status.PASS, "Clicked on roses");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on roses");
            extentTest.log(Status.FAIL, "Couldn't click on roses");
        }
    }

    public void clickOnFirstProduct() {
        try {
            helper.clickElement(AnniversaryPageLocators.firstProd);
            LoggerHandler.info("click on the first product");
            extentTest.log(Status.PASS, "click on the first product");
            helper.switchWindow();
            LoggerHandler.info("Window switched");
            extentTest.log(Status.PASS, "Window switched");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on the first product");
            extentTest.log(Status.FAIL, "Couldn't click on the first product");
            LoggerHandler.info("Couldn't switch window");
            extentTest.log(Status.FAIL, "Couldn't switch window");
        }
    }

    public void clickOnBuyNow() {
        try {
            helper.clickElement(AnniversaryPageLocators.buyNow);
            LoggerHandler.info("Clicked on Buy Now");
            extentTest.log(Status.PASS, "Clicked on Buy Now");
        } catch (Exception e) {
            LoggerHandler.info("Couldn't click on Buy Now");
            extentTest.log(Status.FAIL, "Couldn't click on Buy Now");
        }
    }

    public void verifyHome() {
        assertion.verifyText(AnniversaryPageLocators.home, "Home");
        Screenshot.captureScreenShot("first product");
        Reporter.attachScreenshot("first_product", extentTest, "This is the first product");
    }

    public void testAnniversary() {
        clickOnNoThanks();
        clickOnWhereToDeliver();
        inputCity();
        clickOnContinueShopping();
        hoverOnAnniversary();
        clickOnFlowers();
        clickOnRoses();
        clickOnFirstProduct();
        clickOnBuyNow();
        verifyHome();
    }
}
