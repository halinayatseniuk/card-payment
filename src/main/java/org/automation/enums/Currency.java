package org.automation.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Currency {

    USD("USD", "$"),
    EUR("EUR", "€");

    private final String value;
    private final String currencySign;
}
