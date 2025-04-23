package pages;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BirthdayCakesLocator;
import uistore.PenLocators;
import uistore.PlantLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Plants {
    public static WebDriverHelper helper;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    public static Assertion obj;
    public Plants(ExtentTest extentTest){
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
            extenttest.log(Status.PASS, "Clicked on pop-up");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on pop-up");
            extenttest.log(Status.FAIL, "failed to click on pop-up");
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
            helper.waitForElementToBeVisible(PlantLocators.deliver,10);
            helper.clickElement(PlantLocators.deliver);
            LoggerHandler.info("click Deliver");
            extentTest.log(Status.PASS,"click Deliver");
        }catch(Exception e){
            LoggerHandler.error("Not click Deliver");
            extentTest.log(Status.FAIL,"Not click Deliver");
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
            helper.waitForElementToBeVisible(PlantLocators.area,10);
            helper.clickElement(PlantLocators.area);
            LoggerHandler.info("click Location");
            extentTest.log(Status.PASS,"click location");
        }catch(Exception e){
            LoggerHandler.error("Not click Location");
            extentTest.log(Status.FAIL,"Not click Location");
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
            helper.waitForElementToBeVisible(PlantLocators.area,10);
            String bangalore=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 2, 1);
        helper.enterText(PlantLocators.area,bangalore);
            String area_name=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 2, 1);
            helper.enterText(PlantLocators.area,area_name);
            LoggerHandler.info("Entered Bangalore");
            extenttest.log(Status.PASS,"Entered Bangalore");
            Thread.sleep(2000);
            helper.enterAction(PlantLocators.area);
        helper.enterText(PlantLocators.area,"Bangalore");
        LoggerHandler.info("Entered Bangalore");
        extentTest.log(Status.PASS,"Entered Bangalore");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            LoggerHandler.error("failed");
            extenttest.log(Status.FAIL,"failed");
            e.printStackTrace();
        }
        helper.enterAction(PlantLocators.area);
        Thread.sleep(2000);
        }catch(Exception e){
            LoggerHandler.error("Not entered location");
            extentTest.log(Status.FAIL,"Not entered location");
            
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
            helper.waitForElementToBeVisible(PlantLocators.continueshopping,10);
            helper.clickElement(PlantLocators.continueshopping);
            LoggerHandler.info("Click continue shopping");
            extentTest.log(Status.PASS,"Click continue shopping");
            Thread.sleep(3000);
        }catch(Exception e){
            LoggerHandler.error("Not click continue shopping");
            extentTest.log(Status.FAIL,"Not click continue shopping");
        }
    }
    /*
    * Method Name: clickPlant
    * Author Name: prakash
    * Description: This method is for click the plants
    * Return Type: void
    * Parameter List: NA
    */
    public void clickPlant(){
        try{
            Thread.sleep(2000);
            helper.waitForElementToBeVisible(PlantLocators.plant,10);
            helper.clickElement(PlantLocators.plant);
            LoggerHandler.info("Click plants");
            extentTest.log(Status.PASS,"Click plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Plants");
            extentTest.log(Status.FAIL,"Not click Plants");
        }
    }
    /*
    * Method Name: clickBamboo
    * Author Name: prakash
    * Description: This method is for click Bamboo
    * Return Type: void
    * Parameter List: NA
    */
    public void clickBomboo(){
        try{
            helper.waitForElementToBeVisible(PlantLocators.luckybamboo,10);
            helper.clickElement(PlantLocators.luckybamboo);
            LoggerHandler.info("Click LuckyBamboo");
            extentTest.log(Status.PASS,"Click LuckyBamboo");
        }catch(Exception e){
            LoggerHandler.error("Not click LuckyBamboo");
            extentTest.log(Status.FAIL,"Not click LuckyBamboo");
        }
    }
    /*
    * Method Name: clickJadePlant
    * Author Name: prakash
    * Description: This method is for click jade plant
    * Return Type: void
    * Parameter List: NA
    */
    public void clickJadePlant(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.jade_plants,10);
            helper.clickElement(PlantLocators.jade_plants);
            LoggerHandler.info("Click Jade plants");
            extentTest.log(Status.PASS,"Click Jade plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Jade plants");
            extentTest.log(Status.FAIL,"Not click Jade plants");
        }
    }
        /*
    * Method Name: clickMoneyPlant
    * Author Name: prakash
    * Description: This method is for click money plant
    * Return Type: void
    * Parameter List: NA
    */
    public void clickMoneyPlant(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.money_plants,10);
            helper.clickElement(PlantLocators.money_plants);
            LoggerHandler.info("Click Money plants");
            extentTest.log(Status.PASS,"Click Money plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Money plants");
            extentTest.log(Status.FAIL,"Not click Money plants");
        }
    }
            /*
    * Method Name: clickCart
    * Author Name: prakash
    * Description: This method si to click cart
    * Return Type: void
    * Parameter List: NA
    */
    public void clickCart(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.cart,10);
            helper.clickElement(PlantLocators.cart);
            LoggerHandler.info("Click Cart");
            extentTest.log(Status.PASS,"Click Cart");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                LoggerHandler.error("failed");
                extenttest.log(Status.FAIL,"failed");            }
                e.printStackTrace();
            }
            extenttest.log(Status.PASS,"Click Cart");
            Thread.sleep(3000);
        }catch(Exception e){
            LoggerHandler.error("Not click Cart");
            extentTest.log(Status.FAIL,"Not click Cart");
        }
    }


    /*
    * Method Name: plant
    * Author Name: prakash
    * Description: This method is for cluster the methods
    * Return Type: void
    * Parameter List: NA
    */
    public void plant() throws IOException
    {
        clickNoThanks();
        clickDeliver();
        clickArea();
        enterArea();
        clickContinueShopping();
        clickPlant();
        clickBomboo();
        clickJadePlant();
        clickMoneyPlant();
        clickCart();

        

    }
}
