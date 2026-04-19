package org.automation.models.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "id",
        "operation",
        "status",
        "descriptor",
        "amount",
        "currency",
        "created_at",
        "updated_at",
        "marketing_amount",
        "marketing_currency",
        "card",
        "card_token",
        "scheme_transaction_id"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionsModel {

    @JsonProperty("id")
    private String id;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("status")
    private String status;
    @JsonProperty("descriptor")
    private String descriptor;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("marketing_amount")
    private Integer marketingAmount;
    @JsonProperty("marketing_currency")
    private String marketingCurrency;
    @JsonProperty("card")
    private CardModel card;
    @JsonProperty("card_token")
    private CardTokenModel cardToken;
    @JsonProperty("scheme_transaction_id")
    private String schemeTransactionId;
}
