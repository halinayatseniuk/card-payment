package org.automation.utilities;

import lombok.experimental.UtilityClass;
import org.automation.enums.Currency;

@UtilityClass
public class Converter {

    public String convertLongAmountToStringWithCurrency(long amount, Currency currency) {
        String val = String.valueOf(amount);
        int len = val.length();

        if (len > 2) {
            var valueBeforePoint = val.substring(0, val.length() - 2);
            var valueAfterPoint = val.substring(val.length() - 2);
            return valueBeforePoint + "," + valueAfterPoint + currency;
        }
        return String.valueOf(amount);
    }


    public static void main(String[] args) {
        convertLongAmountToStringWithCurrency(1, Currency.EUR);
        convertLongAmountToStringWithCurrency(10, Currency.EUR);
        convertLongAmountToStringWithCurrency(100, Currency.EUR);
        convertLongAmountToStringWithCurrency(1000, Currency.EUR);
        convertLongAmountToStringWithCurrency(10000, Currency.EUR);
    }
}
