import java.util.logging.Logger;

public class LoggingExample {

    private static final Logger logger =
            Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {

        logger.info("Application Started");

        int a = 20;
        int b = 10;

        logger.info("Sum = " + (a + b));

        logger.info("Application Finished");
    }
}