package creational_patterns.singleton;

public class SingletonPatternDemo {
    public static void run() {
        // Get the singleton instance
        Logger singleton = Logger.getInstance();

        // Use the singleton instance
        singleton.showMessage();
    }
}


/*
    The Singleton pattern solves the problem of ensuring that only one instance of a class is created throughout 
    the entire application and provides a global point of access to that instance. It is useful in situations where having multiple 
    instances of a class could lead to conflicts or inconsistent behavior. By restricting the instantiation of a class to a single object, 
    the Singleton pattern guarantees that all code references the same instance, allowing for centralized control and coordination of shared
    resources or services.
*/