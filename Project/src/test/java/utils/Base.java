package utils;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
 
public class Base {
 
    public static WebDriver driver;
    private static Properties prop;
 
    public void loadProperties() {
        String propertiesPath = System.getProperty("user.dir") + "/config/config.properties";
        try (FileInputStream file = new FileInputStream(propertiesPath)) {
            prop = new Properties();
            prop.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public void openBrowser() {
        loadProperties();
        String executionType = prop.getProperty("executiontype");
 
        if ("remote".equalsIgnoreCase(executionType)) {
            try {
                URL gridUrl = new URL(prop.getProperty("gridurl"));
                driver = new RemoteWebDriver(gridUrl, new ChromeOptions());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {
            driver = new ChromeDriver();
        }
        if (driver != null) {
            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
 
            WebDriverListener listener = new EventHandler();
            driver = new EventFiringDecorator<>(listener).decorate(driver);
        }
    }
}