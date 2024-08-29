package abstract_factory.UIFactory;

import abstract_factory.Button.*;
import abstract_factory.CheckBox.*;
import abstract_factory.TextField.*;

public class BFactory extends UIFactory {
        @Override
    public String createButton(String text) {
        String button = new ButtonB().display(text);
        return button;
    }
    @Override
    public String createCheckBox(String text) {
        String checkBox = new CheckBoxB().display(text);
        return checkBox;
    }
    @Override
    public String createTextField(String text) {
        String textField = new TextFieldB().display(text);
        return textField;
    }
}
