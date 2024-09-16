package decorator;

public class Main {
    public static void main(String[] args) {
        IPrinter printer = new BasicPrinter();
        printer.print("Hello, World!");

        IPrinter printer2 = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        printer2.print("Hello, World!");
    }
}