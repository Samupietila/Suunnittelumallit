package abstract_factory.CheckBox;

public class CheckBoxA extends CheckBox{
@Override
public String display( String text ) {
String checkBox = " ☐ ❯❯ "+text+"\n";
return checkBox;
    } 
}
