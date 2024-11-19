package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Game extends Application {

    private Maps map;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
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
        });

        VBox vbox = new VBox(10, label, textField, createButton, resultLabel);
        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}