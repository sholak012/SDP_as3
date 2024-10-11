public interface Logger {
    int INFO = 1;
    int WARNING = 2;
    int ERROR = 3;

    void setNextLogger(Logger nextLogger);
    void logMessage(int level, String message);
}