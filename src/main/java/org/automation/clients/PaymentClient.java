package org.automation.clients;

import org.automation.models.payment.PaymentRequestModel;
import org.automation.models.payment.PaymentResponseModel;

public class PaymentClient {

    private static final String BASE_URL = "https://payment-page.solidgate.com/api/v1";
    private static final String STATUS_ENDPOINT = BASE_URL + "/init";

    private final ApiClient apiClient;

    public PaymentClient() {
        this.apiClient = new ApiClient(BASE_URL);
    }

    public PaymentResponseModel createPayment(PaymentRequestModel paymentRequest, int statusCode) {
        return apiClient.post(STATUS_ENDPOINT, paymentRequest)
                .then()
                .extract()
                .response()
                .as(PaymentResponseModel.class);
    }
}
