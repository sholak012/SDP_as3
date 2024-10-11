public class Main {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger warningLogger = new WarningLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);

        infoLogger.logMessage(Logger.INFO, "This is an info message.");
        infoLogger.logMessage(Logger.WARNING, "This is a warning message.");
        infoLogger.logMessage(Logger.ERROR, "This is an error message.");
    }
}