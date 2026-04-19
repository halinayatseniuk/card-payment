package org.automation.utilities;

import lombok.experimental.UtilityClass;
import org.automation.enums.Currency;

@UtilityClass
public class Converter {

    public String convertLongAmountToStringWithCurrency(long amount, Currency currency) {
        String val = String.valueOf(amount);
        int len = val.length();
        String valueBeforePoint = "0";
        String valueAfterPoint;

        if (len > 2) {
            valueBeforePoint = val.substring(0, val.length() - 2);
            valueAfterPoint = val.substring(val.length() - 2);
        } else if (len == 2) {
            valueAfterPoint = val;
        } else {
            valueAfterPoint = "0" + val;
        }
        return valueBeforePoint + "," + valueAfterPoint + " " + currency;
    }
}
