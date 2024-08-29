package abstract_factory.TextField;

public class TextFieldA extends TextField {
    @Override
public String display(String text) {
String textField = "╒═══════════════════╕\n" + //
"   "+text+"    \n" + //
"╘═══════════════════╛\n" + //
"";
return textField;
}
}