package org.automation.flows;

import org.automation.configs.CardTestDataLoader;
import org.automation.models.payment.PaymentOrderModel;
import org.automation.pages.PaymentProcessingPage;

public class PaymentFlow {

    private final PaymentProcessingPage paymentPage = new PaymentProcessingPage();

    public void payWithValidCard(String url, PaymentOrderModel paymentData) {
        var validCard = CardTestDataLoader.readValidCardDataFromFile();

        paymentPage.openPage(url)
                .verifyAmountValuesOnPaymentPage(paymentData.getAmount(), paymentData.getCurrency())
                .fillCardData(validCard)
                .submit()
                .verifyPaymentSuccessful(paymentData.getSuccessUrl());
    }
}
