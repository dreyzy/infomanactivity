package org.example;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/main.fxml")));
        primaryStage.setTitle("Student App");

        primaryStage.setScene(new Scene(root, 1375.0, 584.0));
        primaryStage.show();
    }

    org.example.DatabaseConnection db = new org.example.DatabaseConnection();
    public static void main(String[] args){
        launch(args);
    }

}