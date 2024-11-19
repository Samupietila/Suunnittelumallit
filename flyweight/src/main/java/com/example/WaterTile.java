package com.example;

import javafx.scene.image.Image;

public class WaterTile extends Tile {
    @Override
    public String getType() {
        return "Water";
    }  
        @Override
    public Image getImage(){
        return new Image("file:water.jpeg");
    }
}