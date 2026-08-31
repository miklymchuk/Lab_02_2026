package com.mycompany.mavenproject2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {  
        var root = new BorderPane();
        var game = new Label("Random Game");
        var wait = new Label("Waiting...");
        
        var scene = new Scene(root, 250, 300);
        stage.setScene(scene);
        stage.setTitle("Java Games");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}