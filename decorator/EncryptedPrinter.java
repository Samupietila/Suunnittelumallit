package decorator;

import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(IPrinter printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print(encrypt(message));
    }

    private String encrypt(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}