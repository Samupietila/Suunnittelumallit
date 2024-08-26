package factory_method;

abstract class Map {
    public abstract String createTile();
    public void display() {
        System.out.println("—————————————————————");
        System.out.println("| " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | ");
        System.out.println("—————————————————————");
        System.out.println("| " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | ");
        System.out.println("—————————————————————");
        System.out.println("| " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | ");
        System.out.println("—————————————————————");
        System.out.println("| " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | ");
        System.out.println("—————————————————————");
        System.out.println("| " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | " + createTile() + " | ");
        System.out.println("—————————————————————");
    };
}
