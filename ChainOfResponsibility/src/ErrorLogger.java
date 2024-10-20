public class ErrorLogger implements Logger {
    private Logger nextLogger;

    @Override
    public void setNextLogger(Logger nextLogger) //Установка следуищего логгер
    {
        this.nextLogger = nextLogger;
    }

    @Override
    public void logMessage(int level, String message) //Проверка lvl message
    {
        if (level == ERROR) {
            System.out.println("Error: " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}