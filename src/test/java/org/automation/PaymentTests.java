package org.automation;

import org.automation.configs.CardTestDataLoader;
import org.automation.models.payment.PaymentResponseModel;
import org.junit.jupiter.api.Test;

public class PaymentTests {

    @Test
    public void verifySuccessfulOrderProcessing() {
//        var orderRequest = StatusOrderModel.builder().orderId("order_example").build(); // test builder
//        var statusResponse = new StatusClient().getStatus(orderRequest, 200); // factoty
//
//        System.out.println(statusResponse.getOrder());

//        var paymentRequest = PaymentTestDataBuilder.generatePaymentRequest();
//        var orderId = paymentRequest.getOrder().getOrderId();
//        var amount = paymentRequest.getOrder().getAmount();
//        var currency = paymentRequest.getOrder().getCurrency();

//        var createdOrder = new PaymentClient().createPayment(paymentRequest, 200); // status code validation

//        System.out.println(createdOrder);

        PaymentResponseModel response = PaymentResponseModel.builder()
                .url("https://payment-page.solidgate.com/b9dcd7f5-9aac-41d8-9630-0815e4a525bc")
                .guid("53ae17ba-3b26-4caa-8259-0c3a96fbd894")
                .id("b9dcd7f5-9aac-41d8-9630-0815e4a525bc")
                .build();

        var cardValue = CardTestDataLoader.readValidCardDataFromFile();

        System.out.println(cardValue);
    }
}
