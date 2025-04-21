package utils;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
import com.google.common.io.Files;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
 
public class Reporter extends Base{
    public static TakesScreenshot ts;
    private static Properties prop;
    private static ExtentReports reports;
 
    public static void loadProperty() {
            String filepath = System.getProperty("user.dir") + "/config/config.properties";
            try (FileInputStream file = new FileInputStream(filepath)) {
                prop = new Properties();
                prop.load(file);
            } catch (IOException e) {
                System.out.println("Error loading the file: " + e.getLocalizedMessage());
            }
        }
   
        public static ExtentReports generateExtentReports(String report) {
            if (reports == null) {
                reports = new ExtentReports();
                loadProperty();
 
            String reportPath = System.getProperty("user.dir") + "/reports/";
            reportPath += report + ".html";
 
            File extentReportFile = new File(reportPath);
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
 
            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setReportName("Test Summary");
            sparkReporter.config().setDocumentTitle("Testing Results");
            sparkReporter.config().setTimeStampFormat("yyyy.MM.dd.HH.mm.ss");
 
            reports.attachReporter(sparkReporter);
 
            reports.setSystemInfo("URL", prop.getProperty("url"));
            reports.setSystemInfo("Browser Name", prop.getProperty("browser"));
        }
        return reports;
    }
 
    public static String captureScreenshot(String fileName) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = fileName + timestamp + ".png";
 
        String destinationPath = "./" + name;
 
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
 
        File screenshotsDirectory = new File(System.getProperty("user.dir") + "/reports");
 
        if (!screenshotsDirectory.exists()) {
            screenshotsDirectory.mkdirs();
        }
 
        File target = new File(screenshotsDirectory, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destinationPath;
    }
 
    public static void attachScreenshotToReport(String fileName, ExtentTest test, String description) {
        try {
            test.log(Status.INFO, description,
                    MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot(fileName)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}