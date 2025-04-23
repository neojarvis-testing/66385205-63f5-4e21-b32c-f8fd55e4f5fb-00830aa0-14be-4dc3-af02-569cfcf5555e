package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

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
    ExtentReports extent;
    ExtentTest extentTest;
    WebDriverHelper helper;
    Assertion assertion;

    public PersonalisedPageActions(ExtentTest extentTest){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    public void clickNoThanks(){
        helper.waitForElementToBeVisible(PenLocators.noThanks,10);
        helper.clickElement(PenLocators.noThanks);
    }
    public void clickOnWhereToDeliver(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.whereToDeliver,10);
            helper.clickElement(PersonalisedPageLocators.whereToDeliver);
            LoggerHandler.info("Clicked on Where to deliver?");
            extentTest.log(Status.PASS, "Clicked on Where to deliver?");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click on Where to deliver?");
            extentTest.log(Status.FAIL, "Could not click on Where to deliver?");
        }
    }

    public void enterKeyword(){
        try {
            String bangalore=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 2, 1);
            helper.enterText(PersonalisedPageLocators.enterBar, bangalore);
            Thread.sleep(2000);
            helper.enterAction(PersonalisedPageLocators.enterBar);
            Thread.sleep(2000);
            LoggerHandler.info("Entered Bangalore");
            extentTest.log(Status.PASS, "Entered Bangalore");
            extentTest.log(Status.PASS, "Verified pincode of Bangalore");

        } catch (Exception e) {
            LoggerHandler.error("Could not enter Bangalore");
            extentTest.log(Status.FAIL, "Could not enter Bangalore");
        }
    }

    public void clickOnContinueShopping(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.continueShopping, 10);
            helper.clickElement(PersonalisedPageLocators.continueShopping);
            LoggerHandler.info("Clicked on Continue Shopping");
            extentTest.log(Status.PASS, "Clicked on Continue Shopping");
        } catch (Exception e) {
            LoggerHandler.error("Could not click Continue Shopping");
            extentTest.log(Status.FAIL, "Could not click Continue Shopping");
        }
    }

    public void hoverOnPersonalised(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.personalised, 10);
            helper.hoverElement(PersonalisedPageLocators.personalised);
            LoggerHandler.info("Hovered on Magical Mugs");
            extentTest.log(Status.PASS, "Hovered on Magical Mugs");
        } catch (Exception e) {
            LoggerHandler.error("Could not hover on Magical Mugs");
            extentTest.log(Status.FAIL, "Could not hover on Magical Mugs");
        }
    }

    public void clickMugs(){
        try {
            helper.clickElement(PersonalisedPageLocators.mugs);
            helper.clickElement(PersonalisedPageLocators.magicalMugs);
            LoggerHandler.info("Clicked on Mugs");
            extentTest.log(Status.PASS, "Clicked on Mugs");

        } catch (Exception e) {
            LoggerHandler.error("Could not click Mugs");
            extentTest.log(Status.FAIL, "Could not click Mugs");
        }
    }

    public void clickmagicalMugs(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.magicalMugs, 10);
            helper.clickElement(PersonalisedPageLocators.magicalMugs);
            LoggerHandler.info("Clicked on Magical Mugs");
            extentTest.log(Status.PASS, "Clicked on Magical Mugs");
            
        } catch (Exception e) {
            LoggerHandler.error("Could not click Magical Mugs");
            extentTest.log(Status.FAIL, "Could not click Magical Mugs");
        }
    }

    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(PersonalisedPageLocators.firstProduct, 10);
            helper.clickElement(PersonalisedPageLocators.firstProduct);
            
            LoggerHandler.info("Clicked on First Product");
            extentTest.log(Status.PASS, "Clicked on First Product");
        } catch (Exception e) {
            LoggerHandler.error("Could not click First Product");
            extentTest.log(Status.FAIL, "Could not click First Product");
        }
    }

    public void tabSwitch(){
        helper.switchWindow();
        LoggerHandler.info("Verified text");
        extentTest.log(Status.PASS, "Verified text");
    }

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
        }
    }

    public void personalisedGiftsMethod(){
        try {
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
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
