package kantor.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import kantor.model.ExchangeModel;
import kantor.office.Currency;
import kantor.office.ExchangeOffice;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Date;

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
        ExchangeModel model = new ExchangeModel();
        model.setCurrencyFrom(Currency.valueOf(currencyMenuButtonFrom.getText()));
        model.setCurrencyTo(Currency.valueOf(currencyMenuButtonTo.getText()));
        model.setValue(new BigDecimal(valueField.getText()));
        model.setDate(datePicker.getValue());
        sendParametersToExchangeOffice(model);
    }

    private void sendParametersToExchangeOffice(ExchangeModel model) {
        ExchangeOffice ex = new ExchangeOffice(1000);
        BigDecimal result = ex.exchange(model.getValue(),
                        model.getCurrencyFrom(),
                        model.getCurrencyTo());

        exchangeResultField.setText(numberFormat(result));
    }

    private String numberFormat(BigDecimal result) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

}
