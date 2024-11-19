package com.example;

import java.util.Hashtable;

import javafx.scene.image.Image;

public class TileGraphicFactory {
    private static final Hashtable<String, Image> images =  new Hashtable<>();

    public static Image getTileImage(String type) {
        Image image = images.get(type);
        if (image == null) {
            switch (type) {
                case "Road":
                    image = new RoadTile().getImage();
                    break;
                case "Building":
                image = new BuildingTile().getImage();
                break;
                case "Forest":
                image = new ForestTile().getImage();
                break;
                case "Swamp":
                image = new SwampTile().getImage();
                break;
                case "Water":
                image = new WaterTile().getImage();
                break;
            }
            images.put(type, image);
        }
        return image;
    }
}
