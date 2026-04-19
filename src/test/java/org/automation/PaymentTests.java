package org.automation;

import org.automation.clients.StatusClient;
import org.automation.enums.Currency;
import org.automation.models.status.StatusOrderModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentTests {

    @Test
    public void verifySuccessfulOrderProcessing() {
//        var orderRequest = StatusOrderModel.builder().orderId("order_example").build(); // test builder
//        var statusResponse = new StatusClient().getStatus(orderRequest, 200); // factoty
//
//        System.out.println(statusResponse.getOrder());

        //var paymentRequest = PaymentTestDataBuilder.generatePaymentRequest();
//        var orderId = paymentRequest.getOrder().getOrderId();
//        var amount = paymentRequest.getOrder().getAmount();
//        var currency = paymentRequest.getOrder().getCurrency();
//        var successUrl = paymentRequest.getOrder().getSuccessUrl();

//        var createdOrder = new PaymentClient().createPayment(paymentRequest, 200); // status code validation

//        System.out.println(createdOrder);

//        PaymentResponseModel response = PaymentResponseModel.builder()
//                .url("https://payment-page.solidgate.com/b9dcd7f5-9aac-41d8-9630-0815e4a525bc")
//                .guid("53ae17ba-3b26-4caa-8259-0c3a96fbd894")
//                .id("b9dcd7f5-9aac-41d8-9630-0815e4a525bc")
//                .build();
//
//        paymentRequest.getOrder().setAmount(362L);
//        paymentRequest.getOrder().setCurrency("EUR");
//
//        PaymentFlow.getInstance().payWithValidCard(response.getUrl(), paymentRequest.getOrder());
//        System.out.println("cardValue");

        // Status validation
        var orderId = "ebdc1622-abee-43a3-aaa8-1d1ac64cbf6d";
        var amount = 400L;
        var currency = Currency.EUR;

        var orderRequest = StatusOrderModel.builder().orderId(orderId).build();
        var statusResponse = new StatusClient().getStatus(orderRequest, 200);
        Assertions.assertEquals(statusResponse.getOrder().getAmount(), amount);
        Assertions.assertEquals(statusResponse.getOrder().getCurrency(), currency.getValue());

        System.out.println(statusResponse.getOrder());
    }
}
