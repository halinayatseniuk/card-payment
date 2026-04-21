package org.automation;

import org.assertj.core.api.SoftAssertions;
import org.automation.assertions.StatusAsserts;
import org.automation.clients.PaymentClient;
import org.automation.clients.StatusClient;
import org.automation.flows.PaymentFlow;
import org.automation.testdata.PaymentTestDataBuilder;
import org.automation.testdata.StatusTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PaymentTests {

    @DisplayName("Create payment and validate order amount and currency")
    @Test
    public void verifySuccessfulOrderProcessing() {
        var paymentRequest = PaymentTestDataBuilder.generatePaymentRequest();
        var createdOrder = new PaymentClient().createPayment(paymentRequest);

        new PaymentFlow().payWithValidCard(createdOrder.getUrl(), paymentRequest.getOrder());

        var orderRequest = StatusTestDataBuilder.generateStatusRequest(paymentRequest.getOrder().getOrderId());
        var statusResponse = new StatusClient().getStatus(orderRequest);

        SoftAssertions softAsserts = new SoftAssertions();
        new StatusAsserts(softAsserts).verifyStatusOrderBasicValues(statusResponse.getOrder(), paymentRequest.getOrder());
        softAsserts.assertAll();
    }
}
