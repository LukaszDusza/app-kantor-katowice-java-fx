package kantor.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import kantor.library.Constans;

import java.io.IOException;

public class MainController {

    Stage stage = null;

    @FXML
    MenuItem newExchangeItem;

    @FXML
    MenuItem closeItem;

    @FXML
    public void initialize() {

    }

    @FXML
    public void close() {
        Platform.exit();
    }

    @FXML
    public void newExchange() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/exchange-screen.fxml"));
        try {
            StackPane stackPane = loader.load();
            Scene scene = new Scene(stackPane);
            stage = new Stage();
            stage.setTitle(Constans.APP_VERSION);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            stage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void exampleThread() {
        Platform.runLater(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("close");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            close();
        });
    }

    public void setText(String text) {
        stage.setTitle(text);
    }
}
