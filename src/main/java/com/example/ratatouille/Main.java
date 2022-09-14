package com.example.ratatouille;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;

import java.io.IOException;

public class Main extends Application {
    public static Stage s;
   //Integer.parseInt(String.valueOf(dateChosen.getValue())
    @Override
    public void start(Stage stage) throws IOException {
        s=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800 , 600);
        stage.setTitle("hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}