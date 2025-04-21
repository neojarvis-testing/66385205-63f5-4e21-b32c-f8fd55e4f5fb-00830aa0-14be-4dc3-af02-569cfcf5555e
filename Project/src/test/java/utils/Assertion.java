package utils;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Assertion {
    public static void assertEquals(String expected, String actual, ExtentTest test){
        try{
            Assert.assertEquals(expected, actual);
            LoggerHandler.info("Verified: "+actual);
            test.log(Status.INFO,"Verified: "+expected);
        }catch(Exception e){
            LoggerHandler.error("Assertion failed: "+e.getMessage());
            test.log(Status.WARNING,"Assertion failed: "+e.getMessage());
        }
    }
    public static void assertTrue(boolean condition, String msg, ExtentTest test){
        try{
            Assert.assertTrue(condition, msg);
            LoggerHandler.info("Verified: "+msg);
            test.log(Status.INFO,"Verified: "+msg);
        }catch(Exception e){
            LoggerHandler.error("Assertion failed: "+e.getMessage());
            test.log(Status.WARNING,"Assertion failed: "+e.getMessage());
        }
    }
}
