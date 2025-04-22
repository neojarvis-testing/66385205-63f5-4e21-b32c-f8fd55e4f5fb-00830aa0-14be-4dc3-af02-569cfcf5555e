package pages;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PenLocators;
import uistore.PlantLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Plants {
    public static WebDriverHelper helper;
    public static ExtentReports extent;
    public static ExtentTest extenttest;
    public static Assertion obj;
    public Plants(ExtentTest extenttest){
        helper=new WebDriverHelper(Base.driver);
        this.extenttest=extenttest;
        obj = new Assertion(Base.driver);
    }

    public void clickNoThanks(){
        helper.waitForElementToBeVisible(PlantLocators.noThanks,10);
        helper.clickElement(PlantLocators.noThanks);
    }
    public void clickDeliver(){
        try{
            helper.waitForElementToBeVisible(PlantLocators.deliver,10);
            helper.clickElement(PlantLocators.deliver);
            LoggerHandler.info("click Deliver");
            extenttest.pass("click Deliver");
        }catch(Exception e){
            LoggerHandler.error("Not click Deliver");
            extenttest.log(Status.FAIL,"Not click Deliver");
        }
    }
    public void clickArea(){
        try{
            helper.waitForElementToBeVisible(PlantLocators.area,10);
            helper.clickElement(PlantLocators.area);
            LoggerHandler.info("click Location");
            extenttest.pass("click location");
        }catch(Exception e){
            LoggerHandler.error("Not click Location");
            extenttest.log(Status.FAIL,"Not click Location");
        }
    }
    public void enterArea() throws IOException{
        try{
            helper.waitForElementToBeVisible(PlantLocators.area,10);
        String area_name=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 2, 0);
        helper.enterText(PlantLocators.area,area_name);
        LoggerHandler.info("Entered Bangalore");
        extenttest.pass("Entered Bangalore");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        helper.enterAction(PlantLocators.area);
        Thread.sleep(2000);
        }catch(Exception e){
            LoggerHandler.error("Not entered location");
            extenttest.log(Status.FAIL,"Not entered location");
            
        }
    }

    public void clickContinueShopping(){
        try{
            helper.waitForElementToBeVisible(PlantLocators.continueshopping,10);
            helper.clickElement(PlantLocators.continueshopping);
            LoggerHandler.info("Click continue shopping");
            extenttest.pass("Click continue shopping");
            Thread.sleep(3000);
        }catch(Exception e){
            LoggerHandler.error("Not click continue shopping");
            extenttest.log(Status.FAIL,"Not click continue shopping");
        }
    }
    // public void verifyPinCode(){
    //     try{
    //         obj.verifyText(PenLocators.pincode, "560001");
    //     }catch(Exception e){
    //         e.printStackTrace();
    //     }
    // }
    public void clickPlant(){
        try{
            Thread.sleep(2000);
            helper.waitForElementToBeVisible(PlantLocators.plant,10);
            helper.clickElement(PlantLocators.plant);
            LoggerHandler.info("Click plants");
            extenttest.pass("Click plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Plants");
            extenttest.log(Status.FAIL,"Not click Plants");
        }
    }
    public void clickBomboo(){
        try{
            helper.waitForElementToBeVisible(PlantLocators.luckybamboo,10);
            helper.clickElement(PlantLocators.luckybamboo);
            LoggerHandler.info("Click LuckyBamboo");
            extenttest.pass("Click LuckyBamboo");
        }catch(Exception e){
            LoggerHandler.error("Not click LuckyBamboo");
            extenttest.log(Status.FAIL,"Not click LuckyBamboo");
        }
    }
    public void clickJadePlant(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.jade_plants,10);
            helper.clickElement(PlantLocators.jade_plants);
            LoggerHandler.info("Click Jade plants");
            extenttest.pass("Click Jade plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Jade plants");
            extenttest.log(Status.FAIL,"Not click Jade plants");
        }
    }
    public void clickMoneyPlant(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.money_plants,10);
            helper.clickElement(PlantLocators.money_plants);
            LoggerHandler.info("Click Money plants");
            extenttest.pass("Click Money plants");
        }catch(Exception e){
            LoggerHandler.error("Not click Money plants");
            extenttest.log(Status.FAIL,"Not click Money plants");
        }
    }
    public void clickCart(){
        try{
            Base.driver.navigate().back();
            helper.waitForElementToBeVisible(PlantLocators.cart,10);
            helper.clickElement(PlantLocators.cart);
            LoggerHandler.info("Click Cart");
            extenttest.pass("Click Cart");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }catch(Exception e){
            LoggerHandler.error("Not click Cart");
            extenttest.log(Status.FAIL,"Not click Cart");
        }
    }


    
    public void plant_testcase() throws IOException
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
