package creational_patterns.singleton;

public class Logger { // The singleton
    private static Logger instance;

    // Private constructor to prevent instantiation from outside
    private Logger() {
    }

    // Get the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Other methods and properties of the Singleton class
    public void showMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }
}

