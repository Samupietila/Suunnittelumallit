package com.example;

import javafx.scene.image.Image;

abstract class Maps {
    public abstract String createTile();
    private static final int GRID_WIDTH = 8;
    private static final int GRID_HEIGHT = 5;
    private Image[][] tiles;
    public void display() {
        tiles = new Image[GRID_HEIGHT][GRID_WIDTH];
        for (int i = 0; i < GRID_HEIGHT; i++) {
            for (int j = 0; j < GRID_WIDTH; j++) {
                tiles[i][j] = TileGraphicFactory.getTileImage(createTile());
            }
        }
    };
    public Image[][] getTiles() {
        return tiles;
    }
}