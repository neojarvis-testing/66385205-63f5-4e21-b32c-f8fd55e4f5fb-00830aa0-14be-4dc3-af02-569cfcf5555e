package utils;
 
import java.io.File;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class LoggerHandler {
   static {
        File logsDir = new File("logs");
        if (!logsDir.exists()) {
            logsDir.mkdirs();
        }
    }
    private static final Logger log = LogManager.getLogger(LoggerHandler.class);
    public static void trace(String msg) {
        log.trace(msg);
    }
    public static void debug(String msg) {
        log.debug(msg);
    }
    public static void info(String msg) {
        log.info(msg);
    }
    public static void warn(String msg) {
        log.warn(msg);
    }
    public static void error(String msg) {
        log.error(msg);
    }
    public static void fatal(String msg) {
        log.fatal(msg);
    }
}
 