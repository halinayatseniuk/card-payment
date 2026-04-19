package org.automation.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.automation.enums.GPayAuthMethod;

import java.util.List;

@JsonPropertyOrder({
        "order_id",
        "amount",
        "currency",
        "future_usage",
        "order_description",
        "order_items",
        "order_date",
        "order_number",
        "settle_interval",
        "authorization_type",
        "force3ds",
        "google_pay_allowed_auth_methods",
        "customer_date_of_birth",
        "customer_email",
        "customer_first_name",
        "customer_last_name",
        "customer_phone",
        "billing_address",
        "traffic_source",
        "transaction_source",
        "purchase_country",
        "geo_country",
        "geo_city",
        "language",
        "website",
        "order_metadata",
        "success_url",
        "fail_url"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentOrderModel {

    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("amount")
    private Long amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("future_usage")
    private FutureUsageModel futureUsage;
    @JsonProperty("order_description")
    private String orderDescription;
    @JsonProperty("order_items")
    private String orderItems;
    @JsonProperty("order_date")
    private String orderDate;
    @JsonProperty("order_number")
    private Integer orderNumber;
    @JsonProperty("settle_interval")
    private Integer settleInterval;
    @JsonProperty("authorization_type")
    private String authorizationType;
    @JsonProperty("force3ds")
    private Boolean force3ds;
    @JsonProperty("google_pay_allowed_auth_methods")
    private List<GPayAuthMethod> googlePayAllowedAuthMethods;
    @JsonProperty("customer_date_of_birth")
    private String customerDateOfBirth;
    @JsonProperty("customer_email")
    private String customerEmail;
    @JsonProperty("customer_first_name")
    private String customerFirstName;
    @JsonProperty("customer_last_name")
    private String customerLastName;
    @JsonProperty("customer_phone")
    private String customerPhone;
    @JsonProperty("billing_address")
    private BillingAddressModel billingAddress;
    @JsonProperty("traffic_source")
    private String trafficSource;
    @JsonProperty("transaction_source")
    private String transactionSource;
    @JsonProperty("purchase_country")
    private String purchaseCountry;
    @JsonProperty("geo_country")
    private String geoCountry;
    @JsonProperty("geo_city")
    private String geoCity;
    @JsonProperty("language")
    private String language;
    @JsonProperty("website")
    private String website;
    @JsonProperty("order_metadata")
    private OrderMetadataModel orderMetadata;
    @JsonProperty("success_url")
    private String successUrl;
    @JsonProperty("fail_url")
    private String failUrl;
}
