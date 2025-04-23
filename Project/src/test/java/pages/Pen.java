package pages;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utils.Screenshot;
import uistore.BirthdayCakesLocator;
import uistore.PenLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
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

    /*
    * Method Name: clickNoThanks
    * Author Name: prakash
    * Description: This method click on the no thanks
    * Return Type: void
    * Parameter List: NA
    */
    public void clickNoThanks(){
        try {
            helper.waitForElementToBeVisible(PenLocators.noThanks,10);                
            helper.clickElement(PenLocators.noThanks);            
            LoggerHandler.info("clicked on pop up");
            extentTest.log(Status.PASS, "Clicked on pop-up");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on pop-up");
            extentTest.log(Status.FAIL, "failed to click on pop-up");
            Reporter.attachScreenshot("pop up", extentTest, "pop up");

        }

    }
    /*
    * Method Name: clickDeliver
    * Author Name: prakash
    * Description: This method click on the where to deliver
    * Return Type: void
    * Parameter List: NA
    */
    public void clickDeliver(){
        try{
            helper.clickElement(PenLocators.deliver);
            LoggerHandler.info("click Deliver");
            extentTest.log(Status.PASS,"click Deliver");
        }catch(Exception e){
            LoggerHandler.error("Not click Deliver");
            extentTest.log(Status.FAIL,"Not click Deliver");
            Reporter.attachScreenshot("where to deliver", extentTest, "where to deliver");
        }
    }

        /*
    * Method Name: clickArea
    * Author Name: prakash
    * Description: This method click on the click area
    * Return Type: void
    * Parameter List: NA
    */
    public void clickArea(){
        try{
            helper.clickElement(PenLocators.area);
            LoggerHandler.info("click Location");
            extentTest.log(Status.PASS,"click location");
        }catch(Exception e){
            LoggerHandler.error("Not click Location");
            extentTest.log(Status.FAIL,"Not click Location");
            Reporter.attachScreenshot("Location", extentTest, "Location");
        }
    }
    /*
    * Method Name: enterArea
    * Author Name: prakash
    * Description: This method click on the enter location
    * Return Type: void
    * Parameter List: NA
    */
    public void enterArea() throws IOException{
        try{
            String area_name=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 0, 1); 
            helper.enterText(PenLocators.area,area_name);
            LoggerHandler.info("Entered Delhi");
            extentTest.log(Status.PASS,"Entered Delhi");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            LoggerHandler.error("failed");
            extentTest.log(Status.FAIL,"failed");
        }
        helper.enterAction(PenLocators.area);
        Thread.sleep(2000);
        }catch(Exception e){
            LoggerHandler.error("Not entered location");
            extentTest.log(Status.FAIL,"Not entered location");
            Reporter.attachScreenshot("enter location", extentTest, "enter location");

        }
    }

        /*
    * Method Name: clickContinueShopping
    * Author Name: prakash
    * Description: This method click on the continue shopping
    * Return Type: void
    * Parameter List: NA
    */
    public void clickContinueShopping(){
        try{
            helper.waitForElementToBeVisible(PenLocators.continueshopping,10);
            helper.clickElement(PenLocators.continueshopping);
            Thread.sleep(2000);
            LoggerHandler.info("Click continue shopping");
            extentTest.log(Status.PASS,"Click continue shopping");
        }catch(Exception e){
            LoggerHandler.error("Not click continue shopping");
            extentTest.log(Status.FAIL,"Not click continue shopping");
            Reporter.attachScreenshot("continue shopping", extentTest, "continue shopping");
        }
    }

    /*
    * Method Name: clickSearch
    * Author Name: prakash
    * Description: This method click on the search
    * Return Type: void
    * Parameter List: NA
    */
    public void clickSearch(){
        try{
            helper.waitForElementToBeVisible(PenLocators.search,10);
            helper.clickElement(PenLocators.search);
            LoggerHandler.info("Click search");
            extentTest.log(Status.PASS,"Click csearch");
        }catch(Exception e){
            LoggerHandler.error("Not click search");
            extentTest.log(Status.FAIL,"Not click search");
            Reporter.attachScreenshot("search", extentTest, "search");
        }
    }
        /*
    * Method Name: TypeSearch
    * Author Name: prakash
    * Description: This method click on the type search
    * Return Type: void
    * Parameter List: NA
    */
    public void typeSearch() throws IOException{
        try{
            String pen=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 1, 1);
            helper.enterText(PenLocators.search,pen);
            helper.enterAction(PenLocators.search);
            LoggerHandler.info("Entered pen");
            extentTest.log(Status.PASS,"Entered pen");
        }catch(Exception e){
            LoggerHandler.error("Not Entered Delhi");
            extentTest.log(Status.FAIL,"Not Entered Delhi");
            Reporter.attachScreenshot("pen", extentTest, "pen");

        }
    }

        /*
    * Method Name: clickfirstProduct
    * Author Name: prakash
    * Description: This method click on the first product
    * Return Type: void
    * Parameter List: NA
    */
    public void clickFirstProduct(){
        try{
            helper.waitForElementToBeVisible(PenLocators.first_product,10);
            helper.clickElement(PenLocators.first_product);
            LoggerHandler.info("click on first product");
            extentTest.log(Status.PASS,"click on first product");
        }catch(Exception e){
            LoggerHandler.error("Not click on first product");
            extentTest.log(Status.FAIL,"Not click on first product");
            Reporter.attachScreenshot("first product", extentTest, "first product");
        }
    }

        /*
    * Method Name: clickCart
    * Author Name: prakash
    * Description: This method click on the no thanks
    * Return Type: void
    * Parameter List: NA
    */
    public void clickCart(){
        try{
            helper.switchWindow();
            helper.waitForElementToBeVisible(PenLocators.first_product,10);
            helper.clickElement(PenLocators.addtocart);
            LoggerHandler.info("click on add to cart");
            extentTest.log(Status.PASS,"click on add to cart");
        }catch(Exception e){
            LoggerHandler.error("Not click on add to cart");
            extentTest.log(Status.FAIL,"Not click on add to cart");
            Reporter.attachScreenshot("add to cart", extentTest, "add to cart");
        }
    }
        /*
    * Method Name: verifyPincode
    * Author Name: prakash
    * Description: This method is verify the pincode
    * Return Type: void
    * Parameter List: NA
    */
    public void verifyPinCode(){
        try{
            String pinCode = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 4, 1);
            obj.verifyText(PenLocators.pincode, pinCode);
        }catch(Exception e){
            LoggerHandler.error("Not verified");
            extentTest.log(Status.FAIL,"Not verified");
        }
    }
        /*
    * Method Name: verifyBuyNow
    * Author Name: prakash
    * Description: This method is for verifying buynow
    * Return Type: void
    * Parameter List: NA
    */
    public void verifyBuyNow(){
    try{
        obj.verifyText(PenLocators.buy,"Buy");
    }catch(Exception e){
        LoggerHandler.error("Not verified");
        extentTest.log(Status.FAIL,"Not verified");    }
    }
        /*
    * Method Name: pen
    * Author Name: prakash
    * Description: This method is for cluster the methods
    * Return Type: void
    * Parameter List: NA
    */
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
