package com.example;

import javafx.scene.image.Image;

public class SwampTile extends Tile {
    @Override
    public String getType() {
        return "Swamp";
    }
        @Override
    public Image getImage(){
        return new Image("file:swamp.jpeg");
    }
}