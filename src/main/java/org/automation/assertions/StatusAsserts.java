package org.automation.assertions;

import org.assertj.core.api.SoftAssertions;
import org.automation.models.payment.PaymentOrderModel;
import org.automation.models.status.StatusOrderModel;

public class StatusAsserts {

    private final SoftAssertions softAssertions;

    public StatusAsserts(SoftAssertions softAssertions) {
        this.softAssertions = softAssertions;
    }

    public void verifyStatusOrderBasicValues(StatusOrderModel actualOrder, PaymentOrderModel expectedOrder) {
        softAssertions.assertThat(actualOrder.getAmount())
                .as("Order amount doesn't match")
                .isEqualTo(expectedOrder.getAmount());
        softAssertions.assertThat(actualOrder.getCurrency())
                .as("Order currency doesn't match")
                .isEqualTo(expectedOrder.getCurrency());
        softAssertions.assertAll();
    }
}
