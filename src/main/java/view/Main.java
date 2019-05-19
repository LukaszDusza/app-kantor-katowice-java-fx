package view;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(this.getClass()
                .getResource("/fxml/output.fxml"));

        AnchorPane anchorPane = loader.load();

        Scene scene = new Scene(anchorPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("output");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
