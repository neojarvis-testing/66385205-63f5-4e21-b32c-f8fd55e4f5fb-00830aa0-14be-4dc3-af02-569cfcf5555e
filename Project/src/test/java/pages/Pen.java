package pages;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utils.Screenshot;
import uistore.PenLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Pen {
    public static WebDriverHelper helper;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    public static Assertion obj;
    public Pen(ExtentTest extentTest){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;
    }

    public void clickNoThanks(){
        helper.waitForElementToBeVisible(PenLocators.noThanks,10);
        helper.clickElement(PenLocators.noThanks);
    }
    public void clickDeliver(){
        try{
            helper.clickElement(PenLocators.deliver);
            LoggerHandler.info("click Deliver");
            extentTest.log(Status.PASS,"click Deliver");
        }catch(Exception e){
            LoggerHandler.error("Not click Deliver");
            extentTest.log(Status.FAIL,"Not click Deliver");
        }
    }
    public void clickArea(){
        try{
            helper.clickElement(PenLocators.area);
            LoggerHandler.info("click Location");
            extentTest.log(Status.PASS,"click location");
        }catch(Exception e){
            LoggerHandler.error("Not click Location");
            extentTest.log(Status.FAIL,"Not click Location");
        }
    }
    public void enterArea() throws IOException{
        try{
            String area_name=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 0, 1); 
            helper.enterText(PenLocators.area,area_name);
            LoggerHandler.info("Entered Delhi");
            extentTest.log(Status.PASS,"Entered Delhi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        helper.enterAction(PenLocators.area);
        Thread.sleep(2000);
        }catch(Exception e){
            LoggerHandler.error("Not entered location");
            extentTest.log(Status.FAIL,"Not entered location");
        }
    }

    public void clickContinueShopping(){
        try{
            helper.waitForElementToBeVisible(PenLocators.continueshopping,10);
            helper.clickElement(PenLocators.continueshopping);
            LoggerHandler.info("Click continue shopping");
            extentTest.log(Status.PASS,"Click continue shopping");
        }catch(Exception e){
            LoggerHandler.error("Not click continue shopping");
            extentTest.log(Status.FAIL,"Not click continue shopping");
        }
    }

    public void clickSearch(){
        try{
            helper.waitForElementToBeVisible(PenLocators.search,10);
            helper.clickElement(PenLocators.search);
            LoggerHandler.info("Click search");
            extentTest.log(Status.PASS,"Click csearch");
        }catch(Exception e){
            LoggerHandler.error("Not click search");
            extentTest.log(Status.FAIL,"Not click search");
        }
    }
    public void typeSearch() throws IOException{
        try{
            helper.enterText(PenLocators.search,"pen");
            helper.enterAction(PenLocators.search);
            LoggerHandler.info("Entered pen");
            extentTest.log(Status.PASS,"Entered pen");
        }catch(Exception e){
            LoggerHandler.error("Not Entered Delhi");
            extentTest.log(Status.FAIL,"Not Entered Delhi");
        }
    }

    public void clickFirstProduct(){
        try{
            helper.waitForElementToBeVisible(PenLocators.first_product,10);
            helper.clickElement(PenLocators.first_product);
            LoggerHandler.info("click on first product");
            extentTest.log(Status.PASS,"click on first product");
        }catch(Exception e){
            LoggerHandler.error("Not click on first product");
            extentTest.log(Status.FAIL,"Not click on first product");
        }
    }

    public void clickCart(){
        try{
            helper.switchWindow();
            helper.waitForElementToBeVisible(PenLocators.first_product,10);
            helper.clickElement(PenLocators.addtocart);
            LoggerHandler.info("click on add to cart");
            extentTest.log(Status.PASS,"click on add to cart");
            Screenshot.captureScreenShot("pen");
        }catch(Exception e){
            LoggerHandler.error("Not click on add to cart");
            extentTest.log(Status.FAIL,"Not click on add to cart");
        }
    }
    public void verifyPinCode(){
        try{
            String pinCode = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 4, 1);
            obj.verifyText(PenLocators.pincode, pinCode);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void verifyBuyNow(){
    try{
        obj.verifyText(PenLocators.buy,"Buy");
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    public void pen() throws IOException, InterruptedException{
        clickNoThanks();
        clickDeliver();
        clickArea();
        enterArea();
        clickContinueShopping();
        clickSearch();
        typeSearch();
        clickFirstProduct();
        clickCart();

 
    }
}
