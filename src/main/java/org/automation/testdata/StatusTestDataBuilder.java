package org.automation.testdata;

import org.automation.models.status.StatusOrderModel;

public class StatusTestDataBuilder {

    public static StatusOrderModel generateStatusRequest(String orderId) {
        return StatusOrderModel.builder()
                .orderId(orderId)
                .build();
    }
}
