package kantor;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import kantor.library.Constans;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/main-screen.fxml"));
        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle(Constans.APP_VERSION);
        primaryStage.setResizable(false);

        primaryStage.setOnCloseRequest(e -> {
            if(Platform.isFxApplicationThread()) {
                Platform.exit();
            }
        });
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
