package factory_method;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map map = null;
        do {
            System.out.println("Enter the type of map you want to create (1=Citymap, 2=Wildernessmap): ");
            String mapType = sc.nextLine();
            switch (mapType) {
                case "1":
                    map = new CityMap();
                    map.display();
                    break;
                case "2":
                    map = new WildernessMap();
                    map.display();
                    break;
                default:
                    System.out.println("Invalid map type");
                    break;
            }
        } while (!sc.nextLine().equals("q"));
        sc.close();
    } 
}