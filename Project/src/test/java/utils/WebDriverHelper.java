package utils;
 
import java.time.Duration;
import java.util.List;
import java.util.Set;
 
 
 
import java.time.Duration;
import java.util.List;
import java.util.Set;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import org.openqa.selenium.support.ui.WebDriverWait;
 
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
 
 
 
 
public class WebDriverHelper {
    private WebDriver driver;
    public WebDriverHelper(WebDriver driver){
        this.driver=driver;
    }
    public void clickElement(By locator){
        try{
            WebElement webElement = driver.findElement(locator);
            webElement.click();
        }
        catch(Exception e){
            e.printStackTrace();
        }
 
    }
    public void hoverElement(By Locator){
        try{
            WebElement webElement= driver.findElement(Locator);
            Actions action = new Actions(driver);
            action.moveToElement(webElement).perform();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void enterText(By locator,String text){
        try{
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(text);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getText(By locator){
        try{
            WebElement webElement = driver.findElement(locator);
            return webElement.getText();
        }
        catch(Exception e){
            e.printStackTrace();
            return " ";
        }
    }
    public void enterAction(By locator){
        try{
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void waitForElementToBeVisible(By locator,int timeoutInSeconds){
        try{
            new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void switchWindow(){
        String currWin = driver.getWindowHandle();
        Set<String> allWin = driver.getWindowHandles();
        for(String i:allWin){
            if(!i.equalsIgnoreCase(currWin)){
                driver.switchTo().window(i);
            }
        }
    }
    public void scroll(By locator){
        try{
            WebElement webElement= driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView(True);",webElement);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<WebElement> getElementsByXPath(String xpath){
        return driver.findElements(By.xpath(xpath));
    }
    public void scrollBy(){
        try{
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scroll(0,3000)");
        }
        catch(Exception e){
            e.printStackTrace();
        }
 
    }
 
    public void navigateBack(){
        driver.navigate().back();
    }
}