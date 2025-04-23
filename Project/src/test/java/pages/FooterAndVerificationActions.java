package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.FooterAndVerificationLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
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
            helper.clickElement(FooterAndVerificationLocators.FNPBusiness);
            Assertion.verifyUrl("https://www.fnp.com/decoration-services-lp");
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
            helper.clickElement(FooterAndVerificationLocators.corporateService);
            Assertion.verifyUrl("https://www.fnp.com/corporate/");
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
            helper.clickElement(FooterAndVerificationLocators.affiliatePrograme);
            Assertion.verifyUrl("https://www.fnp.com/info/affiliate-program");
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
            helper.clickElement(FooterAndVerificationLocators.retailStores);
            Assertion.verifyUrl("https://www.fnp.com/info/retail-stores");
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
            helper.clickElement(FooterAndVerificationLocators.franchies);
            Assertion.verifyUrl("https://www.fnp.com/info/franchise-programme");
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
            helper.clickElement(FooterAndVerificationLocators.QuotesNWishesLink);
            Assertion.verifyUrl("https://www.fnp.com/quotes/wishes-n-messages");
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
            helper.clickElement(FooterAndVerificationLocators.blog);
            Thread.sleep(3000);
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
