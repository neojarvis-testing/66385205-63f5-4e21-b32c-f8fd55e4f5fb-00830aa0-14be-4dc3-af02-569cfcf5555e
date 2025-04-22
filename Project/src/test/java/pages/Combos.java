package pages;

import java.io.IOException;

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
    public static ExtentReports extent;
    public static ExtentTest test;
    public static Assertion obj;
    public Combos(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
       // obj = new Assertion(Base.driver);
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
            test.log(Status.PASS,"hovered over combos");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't hovered over combos");
            test.log(Status.FAIL,"couldn't hovered over combos");
        }
        
    }
    public void enteringLocation() {
        try{
            helper.waitForElementToBeVisible(CombosLocators.location,10);
            helper.clickElement(CombosLocators.location);
            helper.waitForElementToBeVisible(CombosLocators.location,10);
            //helper.enterText(TestSevenLocators.location,ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/fnp.xlsx","Sheet1",2,0));
            helper.enterText(CombosLocators.location,"Bangalore");
            //Thread.sleep(3000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //helper.enterAction(TestSevenLocators.location);
            Thread.sleep(2000);
            helper.enterAction(CombosLocators.location);
        }
        catch(Exception e){
            LoggerHandler.info("couldn't hovered over combos");
            test.log(Status.FAIL,"couldn't hovered over combos");
        }

    }
    public void continueShopping(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.continueShop,10);
            helper.hoverElement(CombosLocators.continueShop);
            helper.clickElement(CombosLocators.continueShop);
            Thread.sleep(3000);
            LoggerHandler.info("clicked on continue shopping");
            test.log(Status.PASS,"clicked on continue shopping");
            // helper.waitForElementToBeVisible(TestSevenLocators.continueShop,5);
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked on continue shopping");
            test.log(Status.FAIL,"couldn't clicked on continue shopping");
        }
    }
    public void hoverCombos(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.combos,10);
            helper.hoverElement(CombosLocators.combos);
            LoggerHandler.info("hovered over combos");
            test.log(Status.PASS,"hovered over combos");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't hovered over combos");
            test.log(Status.FAIL,"couldn't hovered over combos");
        }
    }
    public void clickHampers(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.healthyhampers,10);
            helper.clickElement(CombosLocators.healthyhampers);
            LoggerHandler.info("clicked helathy hampers");
            test.log(Status.PASS,"clicked helathy hampers");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked helathy hampers");
            test.log(Status.FAIL,"couldn't clicked helathy hampers");
        }
    }
    public void clickAvailability(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.availability,10);
            helper.clickElement(CombosLocators.availability);
            LoggerHandler.info("clicked availability");
            test.log(Status.PASS,"clicked availability");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked helathy hampers");
            test.log(Status.FAIL,"couldn't clicked helathy hampers");
        }
    }
    public void clickTrue(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.trues,10);
            helper.clickElement(CombosLocators.trues);
            LoggerHandler.info("clicked true");
            test.log(Status.PASS,"clicked true");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked true");
            test.log(Status.FAIL,"couldn't clicked true");
        }
    }
    public void clickProduct(){
        try{
            helper.waitForElementToBeVisible(CombosLocators.firstProduct,10);
            helper.hoverElement(CombosLocators.firstProduct);
            helper.clickElement(CombosLocators.firstProduct);
            LoggerHandler.info("clicked firstProduct");
            test.log(Status.PASS,"clicked firstProduct");
            Screenshot.captureScreenShot("fnp");
        }
        catch(Exception e){
            LoggerHandler.info("couldn't clicked firstProduct");
            test.log(Status.FAIL,"couldn't clicked firstProduct");
        }
    }
    public void addToCart(){
        try{
            helper.switchWindow();
            helper.waitForElementToBeVisible(CombosLocators.add,10);
            helper.clickElement(CombosLocators.add);
            LoggerHandler.info("added product");
            test.log(Status.PASS,"added product");

    }
    catch(Exception e){
        LoggerHandler.info("couldn't added product");
        test.log(Status.FAIL,"couldn't added product");
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
