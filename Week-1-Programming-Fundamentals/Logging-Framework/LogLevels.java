import java.util.logging.Logger;

public class LogLevels {

    private static final Logger logger =
            Logger.getLogger(LogLevels.class.getName());

    public static void main(String[] args) {

        logger.severe("SEVERE message");
        logger.warning("WARNING message");
        logger.info("INFO message");
        logger.config("CONFIG message");
        logger.fine("FINE message");
        logger.finer("FINER message");
        logger.finest("FINEST message");
    }
}