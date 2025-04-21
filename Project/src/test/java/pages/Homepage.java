package pages;
import utils.Reporter;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import uistore.HomepageLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Homepage {
    public ExtentReports extent;
    public ExtentTest test;
    public WebDriverHelper helper;
    public Homepage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test = test;
    }
    public void clickbirthday(){
        helper.clickElement(HomepageLocators.birthday);
        LoggerHandler.info("click birthday");
        Reporter.attachScreenshotToReport("fnp", test, "fnp_t");
    }

    public void clicks(){
        helper.clickElement(HomepageLocators.search);
    }
    public void enterdata(){
        try {
            
            String name=ExcelReader.readdata(System.getProperty("user.dir") +"/testdata/fnp.xlsx", "Sheet1", 0, 0);
            helper.enterText(HomepageLocators.search,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void testCase1(){
        clickbirthday();
        try {
            Thread.sleep(15000);
            clicks();
            enterdata();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
