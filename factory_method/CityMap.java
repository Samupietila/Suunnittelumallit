package factory_method;
import java.util.Random;
public class CityMap extends Map {
    @Override
    public String createTile() {
        Random random = new Random();
        Integer numbInteger = random.nextInt(3) + 1;
        Tile tile = null;
        switch (numbInteger) {
            case 1:
                tile = new BuildingTile();
                break;
            case 2:
                tile = new RoadTile();
                break;        
            case 3:
                tile = new ForestTile();
                break;
        }
        return tile.getCharacter();
    }}