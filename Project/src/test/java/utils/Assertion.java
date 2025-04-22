package utils;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
 
public class Assertion {
    WebDriver driver;
 
    public Assertion(WebDriver driver) {
        this.driver = driver;
    }
 
    public void verifyTitle(String value) {
        try {
            String element = driver.getTitle();
            Boolean check = element.contains(value);
            Assert.assertTrue(check);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void verifyUrl(String value) {
        try {
            String element = driver.getCurrentUrl();
            Boolean check = element.contains(value);
            Assert.assertTrue(check);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void verifyText(By locator, String value) {
        try {
            WebElement element = driver.findElement(locator);
            String text = element.getText();
            Boolean check = text.contains(value);
            Assert.assertTrue(check);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void verifyLogo(By locator) {
        try {
            String element = driver.findElement(locator).getDomAttribute("src");
            Boolean check = element.isEmpty();
            Assert.assertTrue(check);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}