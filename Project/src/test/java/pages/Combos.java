package pages;

import java.io.IOException;
import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CombosLocators;

import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Combos {
    public static WebDriverHelper helper;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    public static Assertion obj;
    public Combos(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.extentTest=extentTest;
    }

    public void clickNoThanks(){
        helper.waitForElementToBeVisible(CombosLocators.noThanks,10);
        helper.clickElement(CombosLocators.noThanks);
    }

    public void clickWhere(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.where,10);
            helper.clickElement(CombosLocators.where);
            LoggerHandler.info("hovered over combos");
            extentTest.log(Status.PASS,"hovered over combos");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't hovered over combos");
            extentTest.log(Status.FAIL,"couldn't hovered over combos");
        }
        
    }

    public void enteringLocation() {
        try{
            Thread.sleep(2000);
            helper.clickElement(CombosLocators.location);
            helper.waitForElementToBeVisible(CombosLocators.location,10);
            String bangalore=ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 2, 1);
            helper.enterText(CombosLocators.location,bangalore);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            String area_name = ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/fnp.xlsx","Sheet1",2,1);
            helper.enterText(CombosLocators.location, area_name);
            Thread.sleep(2000);
            helper.enterAction(CombosLocators.location);
            Thread.sleep(2000);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        catch(Exception e){
            LoggerHandler.info("couldn't hovered over combos");
            extentTest.log(Status.FAIL,"couldn't hovered over combos");
        }
 
    }

    public void continueShopping(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.continueShop,10);
            helper.hoverElement(CombosLocators.continueShop);
            helper.clickElement(CombosLocators.continueShop);
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            LoggerHandler.info("clicked on continue shopping");
            extentTest.log(Status.PASS,"clicked on continue shopping");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked on continue shopping");
            extentTest.log(Status.FAIL,"couldn't clicked on continue shopping");
        }
    }

    public void hoverCombos(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.combos,10);
            helper.hoverElement(CombosLocators.combos);
            LoggerHandler.info("hovered over combos");
            extentTest.log(Status.PASS,"hovered over combos");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't hovered over combos");
            extentTest.log(Status.FAIL,"couldn't hovered over combos");
        }
    }

    public void clickHampers(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.healthyhampers,10);
            helper.clickElement(CombosLocators.healthyhampers);
            LoggerHandler.info("clicked helathy hampers");
            extentTest.log(Status.PASS,"clicked helathy hampers");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked helathy hampers");
            extentTest.log(Status.FAIL,"couldn't clicked helathy hampers");
        }
    }

    public void clickAvailability(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.availability,10);
            Thread.sleep(1000);
            helper.clickElement(CombosLocators.availability);
            LoggerHandler.info("clicked availability");
            extentTest.log(Status.PASS,"clicked availability");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked helathy hampers");
            extentTest.log(Status.FAIL,"couldn't clicked helathy hampers");
        }
    }

    public void clickTrue(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.trues,10);
            helper.clickElement(CombosLocators.trues);
            LoggerHandler.info("clicked true");
            extentTest.log(Status.PASS,"clicked true");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked true");
            extentTest.log(Status.FAIL,"couldn't clicked true");
        }
    }

    public void clickProduct(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.firstProduct,10);
            helper.hoverElement(CombosLocators.firstProduct);
            helper.clickElement(CombosLocators.firstProduct);
            LoggerHandler.info("clicked firstProduct");
            extentTest.log(Status.PASS,"clicked firstProduct");
            Screenshot.captureScreenShot("fnp");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked firstProduct");
            extentTest.log(Status.FAIL,"couldn't clicked firstProduct");
        }
    }

    public void addToCart(){
        try{
            helper.switchWindow();
            helper.waitForElementToBeVisible(CombosLocators.add,10);
            helper.clickElement(CombosLocators.add);
            LoggerHandler.info("added product");
            extentTest.log(Status.PASS,"added product");

    }
    catch(Exception e){
        LoggerHandler.info("couldn't added product");
        extentTest.log(Status.FAIL,"couldn't added product");
    }
    }

    public void clickBangalore() throws InterruptedException, IOException{
        clickNoThanks();
        clickWhere();
        enteringLocation();
        continueShopping();
        hoverCombos();
        clickHampers();
        clickAvailability();
        clickTrue();
        clickProduct();
        addToCart();
    }
}
