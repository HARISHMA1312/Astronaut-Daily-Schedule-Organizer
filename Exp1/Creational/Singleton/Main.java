package Creational.Singleton;


public class Main {
    public static void main(String[] args) {
        // Multiple modules requesting the logger
        Logger module1Logger = Logger.getInstance();
        Logger module2Logger = Logger.getInstance();

        module1Logger.log("Module 1 initialized");
        module2Logger.log("Module 2 processed data");

        // Check if both instances are the same
        System.out.println("Same logger instance? " + (module1Logger == module2Logger));
    }
}

