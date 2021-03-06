package kantor.office;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class ExchangeOffice {

    private Map<Currency, BigDecimal> availableFounds;

    public ExchangeOffice(double startFounds) {
        this.availableFounds = new HashMap<>();
        for (Currency c : Currency.values()) {
            this.availableFounds.put(c, new BigDecimal(startFounds));
        }
    }

    public void showFunds() {
        DecimalFormat df = new DecimalFormat("##.00");
        System.out.println("Current founds: ");
        for (Map.Entry<Currency, BigDecimal> entry : availableFounds.entrySet()) {
            System.out.print(df.format(entry.getValue()) + " " + entry.getKey().getName() + "\n");
        }
        System.out.println();
    }

    public BigDecimal exchange(BigDecimal amount, Currency from, Currency to) {
        BigDecimal available = availableFounds.get(to);
        BigDecimal needed = amount
                .multiply(new BigDecimal(0.8))
                .multiply(CurrencyConverter.convert(from, to));

        DecimalFormat df = new DecimalFormat("##.00");

        if (available.intValue() >= needed.intValue()) {
            availableFounds.put(from, availableFounds.get(from).add(amount));
            availableFounds.put(to, availableFounds.get(to).subtract(needed));


            System.out.println(
                    "Exchanging "
                    + df.format(amount) + " "
                    + from.getName()
                    + " to "
                    + df.format(needed) + " "
                    + to.getName());

        } else {
            System.out.println(
                    "Cannot exchange " + df.format(amount)
                    + " " + from.getName()
                    + " to " + df.format(needed)
                    + " " + to.getName()
                    + " insufficient founds!");
        }
        return needed;
    }


}
