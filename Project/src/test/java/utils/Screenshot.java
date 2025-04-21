package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Screenshot extends Base{
    public static TakesScreenshot ss;
    
    public static void getScreenshot(String filename){
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        ss = (TakesScreenshot)driver;
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);

        File screenshotsDirectory = new File(System.getProperty("user.dir")+"/screenshots");
        if(!screenshotsDirectory.exists()){
            screenshotsDirectory.mkdirs();
        }

        File destinationFile = new File(screenshotsDirectory, name);
        try {
            Files.copy(sourceFile, destinationFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
