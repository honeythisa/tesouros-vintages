package br.com.bookstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/br/com/bookstore/hello-view.fxml"));
        primaryStage.setTitle("My Library");
        primaryStage.setScene(new Scene(root, 1510, 890));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
