package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Base;

public class TestRunner extends Base{
    @BeforeClass
    public void start(){

    }
    @BeforeMethod
    public void launch() throws IOException{
        openBrowser();
    }
    @Test
    @AfterMethod
    public void tear(){
        driver.quit();
    }
    @AfterClass
    public void end(){

    }
}
