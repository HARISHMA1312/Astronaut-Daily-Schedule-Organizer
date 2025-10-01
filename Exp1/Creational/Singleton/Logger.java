package Creational.Singleton;



public class Logger {
    // Single instance
    private static Logger instance = null;

    // Private constructor
    private Logger() {}

    // Global access point with lazy initialization
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

