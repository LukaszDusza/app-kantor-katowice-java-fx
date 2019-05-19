package kantor.office;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import static kantor.office.Constans.*;

public class CurrencyConverter {

    public static BigDecimal convert(Currency from, Currency to) {
        String value;
        try {
            URL url = new URL(
                    CURRENCY_SERVICE
                            + from.getName()
                            + NODE
                            + to.getName()
                            + INFO_TYPE
                            + API_KEY);

             BufferedReader reader = new BufferedReader(
                            new InputStreamReader(
                                    url.openStream()));
            String lines = reader.readLine();
            System.out.println(lines);
            if (lines.length() > 0) {
                int startIndex = lines.indexOf(":") + 1;
                int endIndex = lines.indexOf("}");
                value = lines.substring(startIndex, endIndex);
                return new BigDecimal(value);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR with URL");
        }
        return new BigDecimal(0);
    }
}
