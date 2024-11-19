package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Game extends Application {

    private Maps map;
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Map Creator");

        Label label = new Label("Enter the type of map you want to create (1=Citymap, 2=Wildernessmap): ");
        TextField textField = new TextField();
        Button createButton = new Button("Create Map");
        Label resultLabel = new Label();

        createButton.setOnAction(e -> {
            String mapType = textField.getText();
            switch (mapType) {
                case "1":
                    map = new CityMap();
                    resultLabel.setText("CityMap created");
                    map.display();
                    break;
                case "2":
                    map = new WildernessMap();
                    resultLabel.setText("WildernessMap created");
                    map.display();
                    break;
                default:
                    resultLabel.setText("Invalid map type");
                    break;
            }
            showMapScene();
        });

        VBox vbox = new VBox(10, label, textField, createButton, resultLabel);
        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showMapScene() {
        GridPane mapGrid = new GridPane();
        drawMap(mapGrid);

        Button backButton = new Button("Back");
        backButton.setOnAction(e -> primaryStage.setScene(createMainScene()));

        VBox vbox = new VBox(10, mapGrid, backButton);
        Scene mapScene = new Scene(vbox, 600, 400);

        primaryStage.setScene(mapScene);
    }

    private Scene createMainScene() {
        Label label = new Label("Enter the type of map you want to create (1=Citymap, 2=Wildernessmap): ");
        TextField textField = new TextField();
        Button createButton = new Button("Create Map");
        Label resultLabel = new Label();

        createButton.setOnAction(e -> {
            String mapType = textField.getText();
            switch (mapType) {
                case "1":
                    map = new CityMap();
                    resultLabel.setText("CityMap created");
                    map.display();
                    break;
                case "2":
                    map = new WildernessMap();
                    resultLabel.setText("WildernessMap created");
                    map.display();
                    break;
                default:
                    resultLabel.setText("Invalid map type");
                    break;
            }
            showMapScene();
        });

        VBox vbox = new VBox(10, label, textField, createButton, resultLabel);
        return new Scene(vbox, 400, 200);
    }

    private void drawMap(GridPane mapGrid) {
        mapGrid.getChildren().clear();
        if (map != null) {
            Image[][] tiles = map.getTiles();
            for (int i = 0; i < tiles.length; i++) {
                for (int j = 0; j < tiles[i].length; j++) {
                    Image tileImage = tiles[i][j];
                    if (tileImage != null) {
                        ImageView imageView = new ImageView(tileImage);
                        imageView.setFitWidth(50);
                        imageView.setFitHeight(50);
                        mapGrid.add(imageView, j, i);
                    } else {
                        System.out.println("Tile image is null at position (" + i + ", " + j + ")");
                    }
                }
            }
        } else {
            System.out.println("Map is null");
        }
    }
}