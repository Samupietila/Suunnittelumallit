package Singleton;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private String fileName;
    private BufferedWriter writer;

    private Logger(String fileName) {
        this.fileName = fileName;
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            System.out.println("Error while opening the log file: " + e.getMessage());
        }
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger("log.txt");
        }
        return instance;
    }
    public void setFileName(String fileName) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Error while closing the file: " + e.getMessage());
            }
        }
        this.fileName = fileName;
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            System.out.println("Error while opening the log file: " + e.getMessage());
        }
    }

    public void log(String message) {
        try {
            writer.write("Logging: " + message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error while writing to the log file: " + e.getMessage());
        }
    }
    public void close() {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("Error while closing the file: " + e.getMessage());
            }
        }
    }
    
}
