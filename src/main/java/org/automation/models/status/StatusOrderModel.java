package org.automation.models.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "order_id",
        "amount",
        "currency",
        "mid",
        "descriptor",
        "fraudulent",
        "marketing_amount",
        "marketing_currency",
        "processing_amount",
        "processing_currency",
        "status",
        "refunded_amount",
        "authorized_amount",
        "order_description",
        "customer_email",
        "auth_code",
        "ip_address",
        "payment_method",
        "psp_order_id"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StatusOrderModel {

    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("mid")
    private String mid;
    @JsonProperty("descriptor")
    private String descriptor;
    @JsonProperty("fraudulent")
    private Boolean fraudulent;
    @JsonProperty("marketing_amount")
    private Integer marketingAmount;
    @JsonProperty("marketing_currency")
    private String marketingCurrency;
    @JsonProperty("processing_amount")
    private Integer processingAmount;
    @JsonProperty("processing_currency")
    private String processingCurrency;
    @JsonProperty("status")
    private String status;
    @JsonProperty("refunded_amount")
    private Integer refundedAmount;
    @JsonProperty("authorized_amount")
    private Integer authorizedAmount;
    @JsonProperty("order_description")
    private String orderDescription;
    @JsonProperty("customer_email")
    private String customerEmail;
    @JsonProperty("auth_code")
    private String authCode;
    @JsonProperty("ip_address")
    private String ipAddress;
    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("psp_order_id")
    private String pspOrderId;
}
