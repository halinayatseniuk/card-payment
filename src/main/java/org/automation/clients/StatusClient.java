package org.automation.clients;

import org.automation.models.status.StatusOrderModel;
import org.automation.models.status.StatusResponseModel;

public class StatusClient {

    private static final String BASE_URL = "https://pay.solidgate.com/api/v1";
    private static final String STATUS_ENDPOINT = BASE_URL + "/status";

    private final ApiClient apiClient;

    public StatusClient() {
        this.apiClient = new ApiClient(BASE_URL);
    }

    public StatusResponseModel getStatus(StatusOrderModel orderRequest, int statusCode) {
        return apiClient.post(STATUS_ENDPOINT, orderRequest)
                .then()
                .statusCode(statusCode)
                .extract()
                .response()
                .as(StatusResponseModel.class);
    }
}
