package com.example;

import javafx.scene.image.Image;

public class BuildingTile extends Tile {
    @Override
    public String getType() {
        return "Building";
    }
    @Override
    public Image getImage(){
        return new Image("file:building.png");
    }

}
