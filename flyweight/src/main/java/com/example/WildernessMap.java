package com.example;

import java.util.Random;


public class WildernessMap extends Maps {
        @Override
    public String createTile() {
        Random random = new Random();
        Integer numbInteger = random.nextInt(3) + 1;
        Tile tile = null;
        switch (numbInteger) {
            case 1:
                tile = new WaterTile();
                break;
            case 2:
                tile = new ForestTile();
                break;        
            case 3:
                tile = new SwampTile();
                break;
        }
        return tile.getType();
    }}