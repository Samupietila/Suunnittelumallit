package decorator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator {
    public FilePrinter(IPrinter printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("print.txt", true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error while writing to the print file: " + e.getMessage());
        }
    }
}