package abstract_factory.Button;

public class ButtonA extends Button {
    @Override
    public String display(String text ) {
        String button =    "╔════════════════╗\n" + //
                           " ★ " + text +" ★ \n" + //
                           "╚════════════════╝\n" + //
                "";
        return button;
    }
}
