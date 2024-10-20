public class InfoLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void logMessage(int level, String message) 
    {
        if (level == INFO) {
            System.out.println("Info: " + message);
        }
        if (nextLogger != null) //Логгирует информационные сообщения или передает дальше
        {
            nextLogger.logMessage(level, message);
        }
    }
}
