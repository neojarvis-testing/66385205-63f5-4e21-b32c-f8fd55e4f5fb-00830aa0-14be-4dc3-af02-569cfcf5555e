package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AnniversaryPageLocators;
import uistore.FooterAndVerificationLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class FooterAndVerificationActions {

    WebDriverHelper helper;
    ExtentTest extentTest;
    ExtentReports extentReport;
    WebDriver driver;

    public FooterAndVerificationActions(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }
    public void clickOnNoThanks(){
        helper.waitForElementToBeVisible(AnniversaryPageLocators.noThanks,10);
        helper.clickElement(AnniversaryPageLocators.noThanks);
    }


    public void scrollToFooter() {
        try {
            helper.scrollBy();
            LoggerHandler.info("scrolled upto footer");
            extentTest.log(Status.PASS, "scrolled upto footer");
        } catch (Exception e) {
            LoggerHandler.error("Failed scrolling");
            extentTest.log(Status.FAIL, "failed page scrolling");
        }
    }

    public void VerifyDecorationLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.FNPBusiness,10);
            helper.clickElement(FooterAndVerificationLocators.FNPBusiness);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 0,2));
            LoggerHandler.info(" Page is verified");
            extentTest.log(Status.PASS, " Page is verified");
            helper.navigateBack();

        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
        }
    }

    public void corporateServiceLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.corporateService,10);
            helper.clickElement(FooterAndVerificationLocators.corporateService);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 1,2));
            LoggerHandler.info("Corporate Page is verified");
            extentTest.log(Status.PASS, "Corporate Page is verified");
            helper.navigateBack();

        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
        }
    }

    public void affiliateProgrameLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.affiliatePrograme,10);
            helper.clickElement(FooterAndVerificationLocators.affiliatePrograme);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 2,2));
            LoggerHandler.info("Affiliate Programe Page is verified");
            extentTest.log(Status.PASS, "Affiliate Programe is verified");
            helper.navigateBack();

        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
        }
    }

    public void retailStoresLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.retailStores,10);
            helper.clickElement(FooterAndVerificationLocators.retailStores);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 3,2));
            LoggerHandler.info("Retail Stores Page is verified");
            extentTest.log(Status.PASS, "Retail Stores Page is verified");
            helper.navigateBack();

        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
        }
    }

    public void franchiseLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.franchies,10);
            helper.clickElement(FooterAndVerificationLocators.franchies);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 4,2));
            LoggerHandler.info("Franchise Page is verified");
            extentTest.log(Status.PASS, "Retail Stores Page is verified");
            helper.navigateBack();

        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
        }
    }

    public void quotesNWishesLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.QuotesNWishesLink,10);
            helper.clickElement(FooterAndVerificationLocators.QuotesNWishesLink);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 5,2));
            LoggerHandler.info("Quotes N Wishes Page is verified");
            extentTest.log(Status.PASS, "Quotes N Wishes Page is verified");
            helper.navigateBack();

        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
        }
    }

    public void blogLink() {
        try {
            helper.scrollBy();
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.blog, 10);
            helper.clickElement(FooterAndVerificationLocators.blog);
            Assertion.verifyUrl("https://www.fnp.com/blog/");
            LoggerHandler.info("Blog Page is verified");
            extentTest.log(Status.PASS, "Retail Stores Page is verified");
            helper.navigateBack();

        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
        }
    }

    public void footerAndVerificationMethods() {
        try {
            clickOnNoThanks();
            scrollToFooter();
            VerifyDecorationLink();
            corporateServiceLink();
            affiliateProgrameLink();
            retailStoresLink();
            franchiseLink();
            quotesNWishesLink();
            blogLink();
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification for FooterAndVerification");
        }

    }
}
