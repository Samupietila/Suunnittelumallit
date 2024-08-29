package abstract_factory.UIFactory;

public abstract class UIFactory {
    public abstract String createButton(String text);
    public abstract String createCheckBox(String text);
    public abstract String createTextField(String text);
}
