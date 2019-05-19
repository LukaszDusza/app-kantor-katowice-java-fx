package kantor.model;


import kantor.office.Currency;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExchangeModel {

    private Currency currencyFrom;
    private Currency currencyTo;
    private BigDecimal value;
    private LocalDate date;

    public Currency getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(Currency currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(Currency currencyTo) {
        this.currencyTo = currencyTo;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExchangeModel{" +
                "currencyFrom=" + currencyFrom +
                ", currencyTo=" + currencyTo +
                ", value=" + value +
                ", date=" + date +
                '}';
    }
}
