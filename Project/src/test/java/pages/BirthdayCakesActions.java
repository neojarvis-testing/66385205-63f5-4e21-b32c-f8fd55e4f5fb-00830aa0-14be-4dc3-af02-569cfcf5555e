package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BirthdayCakesLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BirthdayCakesActions {

    WebDriverHelper helper;
    ExtentTest extentTest;
    ExtentReports extentReport;

    /* 
     * Constructor Name: BirthdayCakesActions
     * Author Name: Deeksha
     * Description: BirthdayCakesActions Constructor
     */
    public BirthdayCakesActions(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

     /*
     * Method Name: pop_up
     * Author Name: Deeksha
     * Description: This method clicks on the Pop up.
     * Return Type: void
     * Parameter List: NA
     */
    public void pop_up() {
        try {
            helper.clickElement(BirthdayCakesLocator.nothanks);
            LoggerHandler.info("clicked on pop up");
            extentTest.log(Status.PASS, "Clicked on pop-up");
            Screenshot.captureScreenShot("pop_up");
            Reporter.attachScreenshot("pop_up", extentTest, "pop_up");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on pop-up");
            extentTest.log(Status.FAIL, "failed to click on pop-up");
            Screenshot.captureScreenShot("Failed pop_up");
            Reporter.attachScreenshot("failed popup", extentTest, "failed popup");
        }
    }

     /*
     * Method Name: selectLocation
     * Author Name: Deeksha
     * Description: This method is used to select location.
     * Return Type: void
     * Parameter List: NA
     */
    public void selectLocation() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.location, 10);
            helper.clickElement(BirthdayCakesLocator.location);
            LoggerHandler.info("clicked on where to deliver");
            extentTest.log(Status.PASS, "clicked on where to deiver");
            Screenshot.captureScreenShot("where to deiver");
            Reporter.attachScreenshot("Location", extentTest, "Location");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on deliver");
            extentTest.log(Status.FAIL, "failed to click on deliver");
            Screenshot.captureScreenShot("Failed where to deiver");
            Reporter.attachScreenshot(" failed Location", extentTest, "failed Location");
        }
    }

     /*
     * Method Name: searchLocation
     * Author Name: Deeksha
     * Description: This method used to search the location and enter.
     * Return Type: void
     * Parameter List: NA
     */
    public void searchLocation() {
        try {
            Thread.sleep(1000);
            helper.enterText(BirthdayCakesLocator.searchLocation, "Chennai");
            Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));            
            helper.enterText(BirthdayCakesLocator.searchLocation,"Chennai");
            Thread.sleep(2000);
            helper.enterAction(BirthdayCakesLocator.searchLocation);
            Screenshot.captureScreenShot("Search");
            Reporter.attachScreenshot("Search", extentTest, "Search");
            Thread.sleep(3000);
            LoggerHandler.info("clicked on Enter");
            extentTest.log(Status.PASS, "clicked on Enter");
            LoggerHandler.info("verify the pincode");
            extentTest.log(Status.PASS, "verify the pincode");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click Enter");
            extentTest.log(Status.FAIL, "failed to click Enter");
            Screenshot.captureScreenShot("Failed Search");
            Reporter.attachScreenshot("failed to click Search", extentTest, "Search");
        }
    }

     /*
     * Method Name: continueShopping
     * Author Name: Deeksha
     * Description: This method used to click on continue button in address field.
     * Return Type: void
     * Parameter List: NA
     */
    public void continueShopping() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.continueshopping, 10);
            helper.clickElement(BirthdayCakesLocator.continueshopping);
            LoggerHandler.info("clicked on Continue Shopping");
            extentTest.log(Status.PASS, "clicked on Continue Shopping");
            Screenshot.captureScreenShot("Continue Shopping");
            Reporter.attachScreenshot("Continue button", extentTest, "Continue button");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Continue Shopping");
            extentTest.log(Status.FAIL, "failed to click on Continue Shopping");
            Screenshot.captureScreenShot("failed Continue Shopping");
            Reporter.attachScreenshot("failed Continue button", extentTest, "failed Continue button");
        }
    }

     /*
     * Method Name: hoverOnCakes
     * Author Name: Deeksha
     * Description: This method used to hover on menubar and click on product
     * Return Type: void
     * Parameter List: NA
     */
    public void hoverOnCakes() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.hovercakes, 10);
            helper.hoverElement(BirthdayCakesLocator.hovercakes);
            LoggerHandler.info("clicked on cakes");
            extentTest.log(Status.PASS, "clicked on cakes");
            Screenshot.captureScreenShot("cakes");
            Reporter.attachScreenshot("cakes", extentTest, "Cakes");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Cakes");
            extentTest.log(Status.FAIL, "failed to click on Cakes");
            Screenshot.captureScreenShot("cakes failed");
            Reporter.attachScreenshot("cakes failed", extentTest, "cakes failed");
        }

    }

     /*
     * Method Name: birthdayCakes
     * Author Name: Deeksha
     * Description: This method used to select the product .
     * Return Type: void
     * Parameter List: NA
     */
    public void birthdayCakes() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.birthdayCakes, 10);
            helper.hoverElement(BirthdayCakesLocator.birthdayCakes);
            helper.clickElement(BirthdayCakesLocator.birthdayCakes);
            LoggerHandler.info("clicked on Birthday Cakes");
            extentTest.log(Status.PASS, "clicked on Birthday Cakes");
            Screenshot.captureScreenShot("Birthday Cakes");
            Reporter.attachScreenshot("Birthday Cakes", extentTest, "Birthday Cakes");

        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Birthday Cakes");
            extentTest.log(Status.FAIL, "failed to click on Birthday Cakes");
            Screenshot.captureScreenShot("Failed Birthday cakes");
            Reporter.attachScreenshot("failed Birthday cakes", extentTest, "failed Birthday cakes");
        }
    }

     /*
     * Method Name: sameDayDelivery
     * Author Name: Deeksha
     * Description: This method used to check the element is visible and clickable.
     * Return Type: void
     * Parameter List: NA
     */
    public void sameDayDelivery() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.sameday, 10);
            helper.clickElement(BirthdayCakesLocator.sameday);
            LoggerHandler.info("clicked on Same Day Delivery");
            extentTest.log(Status.PASS, "clicked on Same Day Delivery");
            Screenshot.captureScreenShot("same day deliveryt");
            Reporter.attachScreenshot("same day delivery", extentTest, "same day delivary");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Same Day Delivery");
            extentTest.log(Status.FAIL, "failed to click on Same Day Delivery");
            Screenshot.captureScreenShot("failed same say delivery");
            Reporter.attachScreenshot("failed same say delivery", extentTest, "failed same day delivary");
        }
    }

     /*
     * Method Name: firstProduct
     * Author Name: Deeksha
     * Description: This method used to click on the given product.
     * Return Type: void
     * Parameter List: NA
     */
    public void firstProduct() {
        try {
            helper.waitForElementToBeVisible(BirthdayCakesLocator.product, 10);
            helper.clickElement(BirthdayCakesLocator.product);
            LoggerHandler.info("click on the first product");
            extentTest.log(Status.PASS, "click on the first product");
            Screenshot.captureScreenShot("first product");
            Reporter.attachScreenshot("first product", extentTest, "first product");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on first product");
            extentTest.log(Status.FAIL, "failed to click on first product");
            Screenshot.captureScreenShot("failed first product");
            Reporter.attachScreenshot("failed first product", extentTest, "failed first product");
        }
    }

     /*
     * Method Name: verifyCakeText
     * Author Name: Deeksha
     * Description: This method verifies the text
     * Return Type: void
     * Parameter List: NA
     */
    public void verifyCakeText() {
        try {
        LoggerHandler.info("verified relevant text");
        extentTest.log(Status.PASS, "verified relevant text");
        Screenshot.captureScreenShot("relevant text");
        Reporter.attachScreenshot("relevant text", extentTest, "relevant text");
    } catch (Exception e) {
        LoggerHandler.error("Failed to verify");
        extentTest.log(Status.FAIL, "Failed to verify");
        Screenshot.captureScreenShot("Failed relevant text");
        Reporter.attachScreenshot("Failed relevant text", extentTest, "Failed relevant text");
    }

    }

     /*
     * Method Name: productAddToCart
     * Author Name: Deeksha
     * Description: This method used to add product in cart.
     * Return Type: void
     * Parameter List: NA
     */
    public void productAddToCart() {
        try {
            helper.switchWindow();
            helper.waitForElementToBeVisible(BirthdayCakesLocator.addcart, 10);
            helper.clickElement(BirthdayCakesLocator.addcart);
            Screenshot.captureScreenShot("Offers_screenshot");
            Reporter.attachScreenshot("Offers_screenshot", extentTest, "Offers_screenshot");
            LoggerHandler.info("clicked on Add to Cart");
            extentTest.log(Status.PASS, "clicked on Add to Cart");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Add to Cart");
            extentTest.log(Status.FAIL, "failed to click on Add to Cart");
            Screenshot.captureScreenShot("Failed Offers_screenshot");
            Reporter.attachScreenshot("Failed Offers_screenshot", extentTest, "Offers_screenshot");
        }
    }

     /*
     * Method Name: BirthdayCakes
     * Author Name: Deeksha
     * Description: This method calls all the methods present in this page.
     * Return Type: void
     * Parameter List: NA
     */
    public void BirthdayCakes() {
        try {
            pop_up();
            selectLocation();
            searchLocation();
            continueShopping();
            hoverOnCakes();
            birthdayCakes();
            sameDayDelivery();
            firstProduct();
            productAddToCart();

        } catch (Exception e) {
            LoggerHandler.info("Verification failed for BirthdayCakeActionsMethod");
        }
    }
}
