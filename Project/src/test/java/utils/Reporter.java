package utils;
 
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
public class Reporter {
    private static ExtentReports extent;
 
    public static ExtentReports generateReport(String reportName) {
        if (extent == null) {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String reportsDir = System.getProperty("user.dir") + "/reports";
            String reportPath = reportsDir + "/" + (reportName.isEmpty() ? "Test_Report" : reportName) + "_" + timestamp
                    + ".html";
            new File(reportsDir).mkdirs();
 
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setReportName(reportName);
            spark.config().setDocumentTitle("Automation Report");
 
            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("User", System.getProperty("user.name"));
        }
        return extent;
    }
 
    public static void addScreenshot(String filename, ExtentTest test, String description, WebDriver driver) {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String screenshotPath = System.getProperty("user.dir") + "/reports/" + filename + "_" + timestamp + ".png";
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            org.apache.commons.io.FileUtils.copyFile(src, new File(screenshotPath));
 
            test.info(description, MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            e.getMessage();
        }
    }
 
}
 