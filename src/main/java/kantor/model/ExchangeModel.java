package kantor.model;


import kantor.office.Currency;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExchangeModel {

    private Currency currencyFrom;
    private Currency currencyTo;
    private BigDecimal value;
    private LocalDate date;
    private String rate;
    private BigDecimal marginValue;

    public ExchangeModel(Builder ex) {
        this.currencyFrom = ex.currencyFrom;
        this.currencyTo = ex.currencyTo;
        this.value = ex.value;
        this.date = ex.date;
        this.rate = ex.rate;
        this.marginValue = ex.marginValue;
    }

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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public BigDecimal getMarginValue() {
        return marginValue;
    }

    public void setMarginValue(BigDecimal marginValue) {
        this.marginValue = marginValue;
    }

    public static class Builder {

        private Currency currencyFrom;
        private Currency currencyTo;
        private BigDecimal value;
        private LocalDate date;
        private String rate;
        private BigDecimal marginValue;

        public Builder() { }

        public Builder currencyFrom(Currency currencyFrom) {
            this.currencyFrom = currencyFrom;
            return this;
        }

        public Builder currencyTo(Currency currencyTo) {
            this.currencyTo = currencyTo;
            return this;
        }

        public Builder value(BigDecimal value) {
            this.value = value;
            return this;
        }

        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        public Builder marginValue(BigDecimal marginValue) {
            this.marginValue = marginValue;
            return this;
        }

        public ExchangeModel build() {
            return new ExchangeModel(this);
        }
    }
}


