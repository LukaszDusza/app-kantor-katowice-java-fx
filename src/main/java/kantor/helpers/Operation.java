package kantor.helpers;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Operation {

    public static String changeBigDecimalToString(BigDecimal result) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }
}
