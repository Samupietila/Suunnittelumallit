package abstract_factory.UIFactory;
import abstract_factory.Button.*;
import abstract_factory.CheckBox.*;
import abstract_factory.TextField.*;

public class AFactory extends UIFactory {
    @Override
    public String createButton(String text) {
        String button = new ButtonA().display(text);
        return button;
    }
    @Override
    public String createCheckBox(String text) {
        String checkBox = new CheckBoxA().display(text);
        return checkBox;
    }
    @Override
    public String createTextField(String text) {
        String textField = new TextFieldA().display(text);
        return textField;
    }
    
}
