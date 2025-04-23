package pages;
 
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
 
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
import utils.Screenshot;
import utils.WebDriverHelper;


public class FooterAndVerificationActions {
 
    WebDriverHelper helper;
    ExtentTest extentTest;
    ExtentReports extentReport;
    WebDriver driver;
 
     /* 
     * Constructor Name: FooterAndVerificationActions
     * Author Name: Deeksha
     * Description: FooterAndVerificationActions Constructor
     */
    public FooterAndVerificationActions(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    /*
     * Method Name: clickOnNoThanks
     * Author Name: Deeksha
     * Description: This method clicks on the Pop up.
     * Return Type: void
     * Parameter List: NA
     */
    public void clickOnNoThanks(){
        try {
            helper.waitForElementToBeVisible(AnniversaryPageLocators.noThanks, 10);
            helper.clickElement(AnniversaryPageLocators.noThanks);
             Screenshot.captureScreenShot("nothanks");
            Reporter.attachScreenshot("nothanks", extentTest, "nothanks");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on element");
            extentTest.log(Status.FAIL, "failed to click on element");
            Screenshot.captureScreenShot("failed nothanks");
            Reporter.attachScreenshot("failed nothanks", extentTest, " failed nothanks");
        }
    }
 
     /*
     * Method Name: scrollToFooter
     * Author Name: Deeksha
     * Description: This method used to scroll.
     * Return Type: void
     * Parameter List: NA
     */
    public void scrollToFooter() {
        try {
            helper.scrollBy();
            LoggerHandler.info("scrolled upto footer");
            extentTest.log(Status.PASS, "scrolled upto footer");
            Screenshot.captureScreenShot("scrolled");
            Reporter.attachScreenshot("scrolled", extentTest, "scrolled");
        } catch (Exception e) {
            LoggerHandler.error("Failed scrolling");
            extentTest.log(Status.FAIL, "failed page scrolling");
            Screenshot.captureScreenShot("failed scrolled");
            Reporter.attachScreenshot(" failed scrolled", extentTest, "failed scrolled");
        }
    }
 
    /*
     * Method Name: verifyDecorationLink
     * Author Name: Deeksha
     * Description: This method used to verify it correct link is opened.
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyDecorationLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.FNPBusiness,10);
            helper.clickElement(FooterAndVerificationLocators.FNPBusiness);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 0,2));
            LoggerHandler.info(" Page is verified");
            extentTest.log(Status.PASS, " Page is verified");
            helper.navigateBack();
            Screenshot.captureScreenShot("verified");
            Reporter.attachScreenshot("verified", extentTest, "verified");
 
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Screenshot.captureScreenShot("failed verification");
            Reporter.attachScreenshot("failed verification", extentTest, "failed verification");
        }
    }
 
    /*
     * Method Name: corporateServiceLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void corporateServiceLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.corporateService,10);
            helper.clickElement(FooterAndVerificationLocators.corporateService);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 1,2));
            LoggerHandler.info("Corporate Page is verified");
            extentTest.log(Status.PASS, "Corporate Page is verified");
            helper.navigateBack();
            Screenshot.captureScreenShot("Corporate");
            Reporter.attachScreenshot("Corporate", extentTest, "Corporate");
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Screenshot.captureScreenShot("failed Corporate");
            Reporter.attachScreenshot(" failed Corporate", extentTest, "failed Corporate");
        }
    }
 

    /*
     * Method Name: affiliateProgrameLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void affiliateProgrameLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.affiliatePrograme,10);
            helper.clickElement(FooterAndVerificationLocators.affiliatePrograme);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 2,2));
            LoggerHandler.info("Affiliate Programe Page is verified");
            extentTest.log(Status.PASS, "Affiliate Programe is verified");
            helper.navigateBack();
            Screenshot.captureScreenShot("Affiliate");
            Reporter.attachScreenshot("Affiliate", extentTest, "Affiliate");
 
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Screenshot.captureScreenShot("failed Affiliate");
            Reporter.attachScreenshot("failed Affiliate", extentTest, "failed Affiliate");
        }
    }
 

    /*
     * Method Name: retailStoresLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void retailStoresLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.retailStores,10);
            helper.clickElement(FooterAndVerificationLocators.retailStores);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 3,2));
            LoggerHandler.info("Retail Stores Page is verified");
            extentTest.log(Status.PASS, "Retail Stores Page is verified");
            helper.navigateBack();
            Screenshot.captureScreenShot("Retail Stores");
            Reporter.attachScreenshot("Retail Stores", extentTest, "Retail Stores");
 
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Screenshot.captureScreenShot("failed Retail Stores");
            Reporter.attachScreenshot("failed Retail Stores", extentTest, "failed Retail Stores");
        }
    }
 
    /*
     * Method Name: franchiseLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void franchiseLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.franchies,10);
            helper.clickElement(FooterAndVerificationLocators.franchies);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 4,2));
            LoggerHandler.info("Franchise Page is verified");
            extentTest.log(Status.PASS, "Retail Stores Page is verified");
            helper.navigateBack();
            Screenshot.captureScreenShot("Franchise");
            Reporter.attachScreenshot("Franchise", extentTest, "Franchise");
 
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Screenshot.captureScreenShot("failed Franchise");
            Reporter.attachScreenshot("failed Franchise", extentTest, "failed Franchise");
        }
    }

    /*
     * Method Name: quotesNWishesLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void quotesNWishesLink() {
        try {
            helper.scrollBy();
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.QuotesNWishesLink,10);
            helper.clickElement(FooterAndVerificationLocators.QuotesNWishesLink);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 5,2));
            LoggerHandler.info("Quotes N Wishes Page is verified");
            extentTest.log(Status.PASS, "Quotes N Wishes Page is verified");
            helper.navigateBack();
            Screenshot.captureScreenShot("QuotesNWishesLink");
            Reporter.attachScreenshot("QuotesNWishesLink", extentTest, "QuotesNWishesLink");
 
        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Screenshot.captureScreenShot("Failed QuotesNWishesLink");
            Reporter.attachScreenshot("Failed QuotesNWishesLink", extentTest, " Failed QuotesNWishesLink");
        }
    }

    /*
     * Method Name: blogLink
     * Author Name: Deeksha
     * Description: This method used to verify correct link is opening or not.
     * Return Type: void
     * Parameter List: NA
     */
    public void blogLink() {
        try {
            helper.scrollBy();
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            helper.waitForElementToBeVisible(FooterAndVerificationLocators.blog, 10);
            helper.clickElement(FooterAndVerificationLocators.blog);
            Assertion.verifyUrl(ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 6,2));
            Assertion.verifyUrl("https://www.fnp.com/blog/");
            LoggerHandler.info("Blog Page is verified");
            extentTest.log(Status.PASS, "Blog Page is verified");
            helper.navigateBack();
            Screenshot.captureScreenShot("Blog");
            Reporter.attachScreenshot("Blog", extentTest, "Blog");

        } catch (Exception e) {
            LoggerHandler.error("Failed page verification");
            extentTest.log(Status.FAIL, "failed page verification");
            Screenshot.captureScreenShot("failed Blog");
            Reporter.attachScreenshot("failed Blog", extentTest, "failed Blog");
        }
    }

    /*
     * Method Name: footerAndVerificationMethods
     * Author Name: Deeksha
     * Description: This method calls all the methods present in this page.
     * Return Type: void
     * Parameter List: NA
     */
    public void footerAndVerificationMethods() {
        try {
            clickOnNoThanks();
            scrollToFooter();
            verifyDecorationLink();
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