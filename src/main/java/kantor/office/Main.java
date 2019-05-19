package kantor.office;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ExchangeOffice ex = new ExchangeOffice(1000);
        ex.exchange(new BigDecimal(230), Currency.PLN, Currency.EUR);
        ex.showFunds();
        ex.exchange(new BigDecimal(0.20), Currency.PLN, Currency.COP);
        ex.showFunds();
    }
}
