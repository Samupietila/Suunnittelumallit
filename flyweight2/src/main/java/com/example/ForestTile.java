package com.example;

import javafx.scene.image.Image;

public class ForestTile extends Tile {
    @Override
    public String getType() {
        return "Forest";
    }
        @Override
    public Image getImage(){
        return new Image("file:forest.png");
    }
    
}