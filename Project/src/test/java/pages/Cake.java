package pages;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CakeLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Cake {
        public static WebDriverHelper helper;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    public static Assertion obj;
    
    public Cake(ExtentTest extentTest){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;
    }
    public void clickNoThanks(){
        helper.waitForElementToBeVisible(CakeLocators.noThanks,10);
        helper.clickElement(CakeLocators.noThanks);
    }
    public void clickDeliver(){
        try{
            helper.clickElement(CakeLocators.deliver);
            LoggerHandler.info("click Deliver");
            extentTest.log(Status.PASS,"click Deliver");
        }catch(Exception e){
            LoggerHandler.error("Not click Deliver");
            extentTest.log(Status.FAIL,"Not click Deliver");
        }
    }
    public void clickArea(){
        try{
            helper.clickElement(CakeLocators.area);
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
        helper.enterText(CakeLocators.area,area_name);
        LoggerHandler.info("Entered Delhi");
        extentTest.log(Status.PASS,"Entered Delhi");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        helper.enterAction(CakeLocators.area);
        Thread.sleep(2000);
        }catch(Exception e){
            LoggerHandler.error("Not entered location");
            extentTest.log(Status.FAIL,"Not entered location");
        }
    }

    public void clickContinueShopping(){
        try{
            helper.waitForElementToBeVisible(CakeLocators.continueshopping,10);
            helper.clickElement(CakeLocators.continueshopping);
            Thread.sleep(2000);
            LoggerHandler.info("Click continue shopping");
            extentTest.log(Status.PASS,"Click continue shopping");
        }catch(Exception e){
            LoggerHandler.error("Not click continue shopping");
            extentTest.log(Status.FAIL,"Not click continue shopping");
        }
    }

    public void clickSearch(){
        try{
            helper.waitForElementToBeVisible(CakeLocators.search,10);
            helper.clickElement(CakeLocators.search);
            LoggerHandler.info("Click search");
            extentTest.log(Status.PASS,"Click csearch");
        }catch(Exception e){
            LoggerHandler.error("Not click search");
            extentTest.log(Status.FAIL,"Not click search");
        }
    }
    public void typeSearch() throws IOException{
        try{
            String name=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 3, 1);
            helper.enterText(CakeLocators.search,name);
            helper.enterAction(CakeLocators.search);
            LoggerHandler.info("Entered Cake");
            extentTest.log(Status.PASS,"Entered Cake");
        }catch(Exception e){
            LoggerHandler.error("Not Entered Delhi");
            extentTest.log(Status.FAIL,"Not Entered Cake");
        }
    }
    public void clickFlavour(){
        try{
            helper.waitForElementToBeVisible(CakeLocators.flavour,10);
            helper.clickElement(CakeLocators.flavour);
            LoggerHandler.info("click flavour");
            extentTest.log(Status.PASS,"click flavour");
        }catch(Exception e){
            LoggerHandler.error("Not clicked flavour");
            extentTest.log(Status.FAIL,"Not clicked flavour");
        }
    }
    public void clickChocolates(){
        try{
            helper.waitForElementToBeVisible(CakeLocators.chocoloate, 10);
            helper.clickElement(CakeLocators.chocoloate);
            LoggerHandler.info("click chocolate");
            extentTest.log(Status.PASS,"click chocolate");
        }catch(Exception e){
            LoggerHandler.error("Not clicked chocolate");
            extentTest.log(Status.FAIL,"Not clicked chocolate");
        }
    }
    public void clickFirstProduct(){
        try{
            helper.waitForElementToBeVisible(CakeLocators.first_product,10);
            helper.clickElement(CakeLocators.first_product);
            LoggerHandler.info("click on first product");
            extentTest.log(Status.PASS,"click on first product");
        }catch(Exception e){
            LoggerHandler.error("Not click on first product");
            extentTest.log(Status.FAIL,"Not click on first product");
        }
    }
    public void clickBuyNow(){
        try{
            helper.switchWindow();
            helper.waitForElementToBeVisible(CakeLocators.buynow,10);
            helper.clickElement(CakeLocators.buynow);
            LoggerHandler.info("click on buynow");
            extentTest.log(Status.PASS,"click on buynow");
        }catch(Exception e){
            LoggerHandler.error("Not click on buy now");
            extentTest.log(Status.FAIL,"Not click on buy now");
        }
    }

    public void cake() throws IOException{
        clickNoThanks();
        clickDeliver();
        clickArea();
        enterArea();
        clickContinueShopping();
        clickSearch();
        typeSearch();
        clickFlavour();
        clickChocolates();
        clickFirstProduct();
        clickBuyNow();
    }
}
