package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverHelper {
    public WebDriver driver;
    public WebDriverHelper(WebDriver driver){
        this.driver=driver;
    }
    public void clickE(By locator){
        WebElement ele=driver.findElement(locator);
        ele.click();
    }
    
}
