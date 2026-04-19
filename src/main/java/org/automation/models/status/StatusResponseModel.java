package org.automation.models.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@JsonPropertyOrder({
        "order",
        "payment_adviser",
        "redirect_url",
        "transactions",
        "three_ds",
        "routing"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StatusResponseModel {

    @JsonProperty("order")
    private StatusOrderModel order;
    @JsonProperty("payment_adviser")
    private PaymentAdviserModel paymentAdviser;
    @JsonProperty("redirect_url")
    private String redirectUrl;
    @JsonProperty("transactions")
    private Map<String, TransactionsModel> transactions;
    @JsonProperty("three_ds")
    private ThreeDsModel threeDs;
    @JsonProperty("routing")
    private RoutingModel routing;
}
