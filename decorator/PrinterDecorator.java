package decorator;

public class PrinterDecorator implements IPrinter {
    private IPrinter printer;

    public PrinterDecorator(IPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        printer.print(message);
    }
    
}
