package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utils.Assertion;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class FooterPageActions {
    public ExtentReports extentReport;
    public ExtentTest extentTest;
    public WebDriverHelper helper;
    public Assertion assertion;

    public FooterPageActions(ExtentTest extentTest){
        this.extentTest = extentTest;
    }

    public void verifyTermsAndConditions(){
        try{
            String termsAndConditionsURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx/", "Sheet1", 2, 0);
            assertion.verifyUrl(termsAndConditionsURL);
            LoggerHandler.info("Terms and Conditions url is correct");
            extentTest.log(Status.PASS, "Terms and Conditions url is correct");
            helper.navigateBack();
        }
        catch(Exception e){
            LoggerHandler.info("Terms and Conditions url is incorrect");
            extentTest.log(Status.FAIL, "Terms and Conditions url is incorrect");
        }
    }

    public void verifyPrivacyPolicy(){
        try{
            String privacyPolicyURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx/", "Sheet1", 3, 0);
            assertion.verifyUrl(privacyPolicyURL);
            LoggerHandler.info("Privacy Policy url is correct");
            extentTest.log(Status.FAIL, "Privacy Policy url is correct");
            helper.navigateBack();
        }
        catch(Exception e){
            LoggerHandler.info("Privacy Policy url is incorrect");
            extentTest.log(Status.FAIL, "Privacy Policy url is incorrect");
        }
    }

    public void verifyTermsOfUse(){
        try{
            String termsOfUseURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx/", "Sheet1", 4, 0);
            assertion.verifyUrl(termsOfUseURL);
            LoggerHandler.info("Terms of Use url is correct");
            extentTest.log(Status.PASS, "Terms of Use url is correct");
            helper.navigateBack();
        }
        catch(Exception e){
            LoggerHandler.info("Terms of Use url is incorrect");
            extentTest.log(Status.FAIL, "Terms of Use url is incorrect");
        }
    }

    public void verifyDisclaimer(){
        try{
            String disclaimerURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx/", "Sheet1", 5, 0);
            assertion.verifyUrl(disclaimerURL);
            LoggerHandler.info("Disclaimer url is correct");
            extentTest.log(Status.PASS, "Disclaimer url is correct");
            helper.navigateBack();
        }
        catch(Exception e){
            LoggerHandler.info("Disclaimer url is incorrect");
            extentTest.log(Status.FAIL, "Disclaimer url is incorrect");
        }
    }

    public void verifyAboutUs(){
        try{
            String aboutUsURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx/", "Sheet1", 6, 0);
            assertion.verifyUrl(aboutUsURL);
            LoggerHandler.info("About Us url is correct");
            extentTest.log(Status.PASS, "About Us url is correct");
            helper.navigateBack();
        }
        catch(Exception e){
            LoggerHandler.info("About Us url is incorrect");
            extentTest.log(Status.FAIL, "About Us url is incorrect");
        }
    }

    public void verifyFNPTeam(){
        try{
            String disclaimerURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx/", "Sheet1", 5, 0);
            assertion.verifyUrl(disclaimerURL);
            LoggerHandler.info("Disclaimer url is correct");
            extentTest.log(Status.PASS, "Disclaimer url is correct");
            helper.navigateBack();
        }
        catch(Exception e){
            LoggerHandler.info("Disclaimer url is incorrect");
            extentTest.log(Status.FAIL, "Disclaimer url is incorrect");
        }
    }
}
