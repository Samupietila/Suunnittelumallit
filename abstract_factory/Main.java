package abstract_factory;

import java.util.Scanner;
import abstract_factory.UIFactory.*;


public class Main {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 UIFactory uiFactory= null;
 do {
    System.out.println("Choose between Style1 and Style2, by writing 1 or 2 and pressing enter: ");
    String style = sc.nextLine();
    switch (style) {
        case "1":
        uiFactory = new AFactory();
        break;
        case "2":
        uiFactory = new BFactory();
        break;
        default:
        System.out.println("Invalid style");
        break;
    }
do {
    System.out.println("Choose between Button, CheckBox, TextField, by writing b, c, t and pressing enter: ");
    String component = sc.nextLine();
    switch (component) {
        case "b":
            System.out.println("Enter button text: ");
            String text = sc.nextLine();
            System.out.println(uiFactory.createButton(text));
            break;
        case "c":
            System.out.println("Enter checkbox text: ");
            text = sc.nextLine();
            System.out.println(uiFactory.createCheckBox(text));
            break;
        case "t":
            System.out.println("Enter textfield text: ");
            text = sc.nextLine();
            System.out.println(uiFactory.createTextField(text));
            break;
        default:
            System.out.println("Invalid component type");
            break;
    }
    System.out.println("Press q to select style/exit or any other key to continue: ");
} while (sc.hasNextLine() && !sc.nextLine().equals("q"));
 } while (sc.hasNextLine() && !sc.nextLine().equals("q"));
 sc.close();
    }
}
