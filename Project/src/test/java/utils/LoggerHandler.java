package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerHandler {
    private static final Logger logger=Logger.getLogger(LoggerHandler.class);
    static{
        File logs=new File("logs");
        String logFile=String.format("logs/logfile_%s.log",new
        SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
        try {
            logger.addAppender(new FileAppender(new PatternLayout("%d{ISO8601} %-5p %c-%m%n"),logFile,true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void info(String message){
        logger.info(message);
    }
    public static void debug(String message){
        logger.info(message);
    }
    public static void warn(String message){
        logger.info(message);
    }
    public static void error(String message){
        logger.info(message);
    }
    public static void fatal(String message){
        logger.info(message);
    }
    
}
