package com.example;

import javafx.scene.image.Image;

public class RoadTile extends Tile {

    @Override
    public String getType() {
        return "Road";
    }
        @Override
    public Image getImage(){
        return new Image("file:road.jpeg");
    }
    
}