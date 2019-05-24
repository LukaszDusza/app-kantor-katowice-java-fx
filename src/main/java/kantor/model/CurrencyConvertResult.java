package kantor.model;

import com.sun.org.apache.regexp.internal.RE;
import kantor.helpers.Operation;

import java.math.BigDecimal;

public class CurrencyConvertResult {

    private BigDecimal result;
    private BigDecimal marginValue;
    private BigDecimal rate;
    private BigDecimal amount;

    public CurrencyConvertResult(Builder curr) {
        this.result = curr.result;
        this.marginValue = curr.marginValue;
        this.rate = curr.rate;
        this.amount = curr.amount;
    }


    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getMarginValue() {
        return marginValue;
    }

    public void setMarginValue(BigDecimal marginValue) {
        this.marginValue = marginValue;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public static class Builder {

        private BigDecimal result;
        private BigDecimal marginValue;
        private BigDecimal rate;
        private BigDecimal amount;

        public Builder() {
        }

        public Builder result(BigDecimal result) {
            this.result = result;
            return this;
        }

        public Builder marginValue(BigDecimal marginValue) {
            this.marginValue = marginValue;
            return this;
        }

        public Builder rate(BigDecimal rate) {
            this.rate = rate;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public CurrencyConvertResult build() {
            return new CurrencyConvertResult(this);
        }

    }

    @Override
    public String toString() {
        return "Parametry transakcji: \n"
                + "kwota Klienta:" + Operation.changeBigDecimalToString(amount) + "\n"
                + "inkaso marża: " + Operation.changeBigDecimalToString(marginValue)  + "\n"
                + "kurs: " + Operation.changeBigDecimalToString(rate) + "\n"
                + "DO WYPŁATY: " + Operation.changeBigDecimalToString(result);


    }
}
