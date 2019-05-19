package view;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import zadanieZoo.Dog;

public class Controller {

    private String textOutput;

    @FXML
    public TextArea outputArea;

    @FXML
    public void initialize() {

        outputArea.setWrapText(true);
        Dog dog = new Dog("Scooby", 40);
        outputArea.setText(dog.introduce());

    }

    public String getTextOutput() {
        return textOutput;
    }

    @FXML
    public void setTextOutput(String textOutput) {
        this.textOutput = textOutput;
        this.outputArea.setText(textOutput);
    }
}
