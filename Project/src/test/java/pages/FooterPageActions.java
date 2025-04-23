package pages;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.FooterLocators;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class FooterPageActions {
    public ExtentReports extentReport;
    public ExtentTest extentTest;
    public WebDriverHelper helper;
    public Assertion assertion;

    public FooterPageActions(ExtentTest extentTest) {
        helper = new WebDriverHelper(Base.driver);
        this.extentTest = extentTest;
    }

    public void clickOnNoThanks() {
        helper.waitForElementToBeVisible(FooterLocators.noThanks, 10);
        helper.clickElement(FooterLocators.noThanks);
    }

    public void verifyTermsAndConditions() {
        try {
            helper.scroll(FooterLocators.termsAndConditions);
            LoggerHandler.info("Scrolled to Terms and Conditions");
            extentTest.log(Status.PASS, "Scrolled to Terms and Conditions");
            helper.clickElement(FooterLocators.termsAndConditions);
            LoggerHandler.info("Clicked on Terms and Conditions");
            extentTest.log(Status.PASS, "Clicked on Terms and Conditions");
            String termsAndConditionsURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 1,0);

            assertion.verifyUrl(termsAndConditionsURL);
            LoggerHandler.info("Terms and Conditions url is correct");
            extentTest.log(Status.PASS, "Terms and Conditions url is correct");
            helper.navigateBack();
        } catch (Exception e) {
            LoggerHandler.info("Terms and Conditions url is incorrect");
            extentTest.log(Status.FAIL, "Terms and Conditions url is incorrect");
        }
    }

    public void verifyPrivacyPolicy() {
        try {
            helper.scroll(FooterLocators.privacyPolicy);
            LoggerHandler.info("Scrolled to Privacy Policy");
            extentTest.log(Status.PASS, "Scrolled to Privacy Policy");
            helper.clickElement(FooterLocators.privacyPolicy);
            LoggerHandler.info("Clicked on Privacy Policy");
            extentTest.log(Status.PASS, "Clicked on Privacy Policy");
            String privacyPolicyURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 2,0);

            assertion.verifyUrl(privacyPolicyURL);
            LoggerHandler.info("Privacy Policy url is correct");
            extentTest.log(Status.FAIL, "Privacy Policy url is correct");
            helper.navigateBack();
        } catch (Exception e) {
            LoggerHandler.info("Privacy Policy url is incorrect");
            extentTest.log(Status.FAIL, "Privacy Policy url is incorrect");
        }
    }

    public void verifyTermsOfUse() {
        try {
            helper.scroll(FooterLocators.termsOfUse);
            LoggerHandler.info("Scrolled to Terms of Use");
            extentTest.log(Status.PASS, "Scrolled to Terms of Use");
            helper.clickElement(FooterLocators.termsOfUse);
            LoggerHandler.info("Clicked on Terms of Use");
            extentTest.log(Status.PASS, "Clicked on Terms of Use");
            String termsOfUseURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1",3,0);

            assertion.verifyUrl(termsOfUseURL);
            LoggerHandler.info("Terms of Use url is correct");
            extentTest.log(Status.PASS, "Terms of Use url is correct");
            helper.navigateBack();
        } catch (Exception e) {
            LoggerHandler.info("Terms of Use url is incorrect");
            extentTest.log(Status.FAIL, "Terms of Use url is incorrect");
        }
    }

    public void verifyDisclaimer() {
        try {
            helper.scroll(FooterLocators.disclaimer);
            LoggerHandler.info("Scrolled to Disclaimer");
            extentTest.log(Status.PASS, "Scrolled to Disclaimer");
            helper.clickElement(FooterLocators.disclaimer);
            LoggerHandler.info("Clicked on Disclaimer");
            extentTest.log(Status.PASS, "Clicked on Disclaimer");
            String disclaimerURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1",4,0);

            assertion.verifyUrl(disclaimerURL);
            LoggerHandler.info("Disclaimer url is correct");
            extentTest.log(Status.PASS, "Disclaimer url is correct");
            helper.navigateBack();
        } catch (Exception e) {
            LoggerHandler.info("Disclaimer url is incorrect");
            extentTest.log(Status.FAIL, "Disclaimer url is incorrect");
        }
    }

    public void verifyAboutUs() {
        try {
            helper.scroll(FooterLocators.aboutUs);
            LoggerHandler.info("Scrolled to About Us");
            extentTest.log(Status.PASS, "Scrolled to About Us");
            helper.clickElement(FooterLocators.aboutUs);
            LoggerHandler.info("Clicked on About Us");
            extentTest.log(Status.PASS, "Clicked on About Us");
            String aboutUsURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 5,0);

            assertion.verifyUrl(aboutUsURL);
            LoggerHandler.info("About Us url is correct");
            extentTest.log(Status.PASS, "About Us url is correct");
            helper.navigateBack();
        } catch (Exception e) {
            LoggerHandler.info("About Us url is incorrect");
            extentTest.log(Status.FAIL, "About Us url is incorrect");
        }
    }

    public void verifyFNPTeam() {
        try {
            helper.scroll(FooterLocators.fnpTeam);
            LoggerHandler.info("Scrolled to FNP Team");
            extentTest.log(Status.PASS, "Scrolled to FNP Team");
            helper.clickElement(FooterLocators.fnpTeam);
            LoggerHandler.info("Clicked on FNP Team");
            extentTest.log(Status.PASS, "Clicked on FNP Team");
            String disclaimerURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1",6,0);

            assertion.verifyUrl(disclaimerURL);
            LoggerHandler.info("Disclaimer url is correct");
            extentTest.log(Status.PASS, "Disclaimer url is correct");
            helper.navigateBack();
        } catch (Exception e) {
            LoggerHandler.info("Disclaimer url is incorrect");
            extentTest.log(Status.FAIL, "Disclaimer url is incorrect");
        }
    }

    public void verifyCareers() {
        try {
            helper.scroll(FooterLocators.careers);
            LoggerHandler.info("Scrolled to Careers");
            extentTest.log(Status.PASS, "Scrolled to Careers");
            helper.clickElement(FooterLocators.careers);
            LoggerHandler.info("Clicked on Careers");
            extentTest.log(Status.PASS, "Clicked on Careers");
            String careersURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 7, 0);

            assertion.verifyUrl(careersURL);
            LoggerHandler.info("Careers url is correct");
            extentTest.log(Status.PASS, "Careers url is correct");
            helper.navigateBack();
        } catch (Exception e) {
            LoggerHandler.info("Careers url is incorrect");
            extentTest.log(Status.FAIL, "Disclaimer url is incorrect");
        }
    }

    public void verifyTestimonials() {
        try {
            helper.scroll(FooterLocators.testimonial);
            LoggerHandler.info("Scrolled to Testimonials");
            extentTest.log(Status.PASS, "Scrolled to Testimonials");
            helper.clickElement(FooterLocators.testimonial);
            LoggerHandler.info("Clicked on Testimonials");
            extentTest.log(Status.PASS, "Clicked on Testimonials");
            String testimonialsURL = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx","Sheet1", 8,0);
            assertion.verifyUrl(testimonialsURL);
            LoggerHandler.info("Testimonials url is correct");
            extentTest.log(Status.PASS, "Testimonials url is correct");
            helper.navigateBack();
            helper.scroll(FooterLocators.policyInfo);
            String text = ExcelReader.readdata(System.getProperty("user.dir") + "/testdata/fnp.xlsx", "Sheet1", 9, 0);
            Assertion.verifyText(FooterLocators.policyInfo, text);
            LoggerHandler.info("Policy info is verified");
            extentTest.log(Status.PASS, "Policy info is verified");
            Screenshot.captureScreenShot("Footer");
        } catch (Exception e) {
            LoggerHandler.info("Testimonials url is incorrect");
            extentTest.log(Status.FAIL, "Testimonials url is incorrect");
            LoggerHandler.info("Policy info couldn't verified");
            extentTest.log(Status.FAIL, "Policy info couldn't verified");
        }
    }

    public void testFooter() {
        clickOnNoThanks();
        verifyTermsAndConditions();
        verifyPrivacyPolicy();
        verifyTermsOfUse();
        verifyDisclaimer();
        verifyAboutUs();
        verifyFNPTeam();
        verifyCareers();
        verifyTestimonials();
    }
}