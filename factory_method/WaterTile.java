package factory_method;

public class WaterTile extends Tile {
    @Override
    public String getCharacter() {
        return "W";
    }
    @Override
    public String getType() {
        return "Water";
    }  
}
