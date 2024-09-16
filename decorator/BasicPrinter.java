package decorator;

public class BasicPrinter implements IPrinter {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}