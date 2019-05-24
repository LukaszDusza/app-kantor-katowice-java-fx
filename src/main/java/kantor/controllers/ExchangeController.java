package kantor.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import kantor.helpers.Operation;
import kantor.model.CurrencyConvertResult;
import kantor.model.ExchangeModel;
import kantor.office.Currency;
import kantor.office.ExchangeOffice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExchangeController {


    @FXML
    public MenuButton currencyMenuButtonFrom;
    @FXML
    public MenuButton currencyMenuButtonTo;
    @FXML
    public Button exchangeButton;
    @FXML
    public TextField valueField;
    @FXML
    public TextArea infoTextArea;
    @FXML
    public Text exchangeResultField;
    @FXML
    public DatePicker datePicker;

    @FXML
    public void initialize() {
        for (Currency c : Currency.values()) {
            currencyMenuButtonFrom.getItems().add(new MenuItem(c.getName()));
            currencyMenuButtonTo.getItems().add(new MenuItem(c.getName()));
        }

        currencyMenuButtonFrom.getItems().forEach(c ->
                c.setOnAction(a ->
                        currencyMenuButtonFrom.setText(c.getText()))
        );

        currencyMenuButtonTo.getItems().forEach(c ->
                c.setOnAction(a ->
                        currencyMenuButtonTo.setText(c.getText()))
        );

        datePicker.setValue(LocalDate.now());
    }

    @FXML
    public void getExchangeParameteres() {
        ExchangeModel model = new ExchangeModel
                .Builder()
                .currencyFrom(Currency.valueOf(currencyMenuButtonFrom.getText()))
                .currencyTo(Currency.valueOf(currencyMenuButtonTo.getText()))
                .value(new BigDecimal(valueField.getText()))
                .date(datePicker.getValue())
                .build();

        sendParametersToExchangeOffice(model);
    }

    private void sendParametersToExchangeOffice(ExchangeModel model) {
        ExchangeOffice ex = new ExchangeOffice(1000);
        CurrencyConvertResult result = ex.exchange(model.getValue(), model.getCurrencyFrom(), model.getCurrencyTo());
        model.setRate(Operation.changeBigDecimalToString(result.getRate()));
        model.setMarginValue(result.getMarginValue());

        exchangeResultField.setText(Operation.changeBigDecimalToString(result.getResult()));
        infoTextArea.setWrapText(true);
        infoTextArea.setEditable(false);
        infoTextArea.setText(result.toString());
    }

}
