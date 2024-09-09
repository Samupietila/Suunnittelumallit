package Singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Hello, log.txt!");
        logger.setFileName("new_log.txt");
        logger.log("Hello, new_log.txt!");
        logger.close();
    }
    
}
