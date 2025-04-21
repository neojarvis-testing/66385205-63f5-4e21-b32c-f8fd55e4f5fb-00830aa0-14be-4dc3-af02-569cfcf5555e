package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Base {
    public static WebDriver driver;
    public static Properties prop = new Properties();

    private void loadProperties() throws IOException {
        try (FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/config/config.properties")) {
            prop.load(file);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void openBrowser() throws IOException {
        loadProperties();

        driver=new RemoteWebDriver(new URL(prop.getProperty("gridurl")),new ChromeOptions());
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}