package abstract_factory.Button;

public class ButtonB extends Button {
    @Override
    public String display(String text) {
        String button =    "╭───✦ Button 2 ✦───╮\n" + //
                            "  "+ text + "\n" + //
        "╰──────────────────╯\n" + //
"";
        return button;
    }
}
