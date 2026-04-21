package org.automation.models.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "bin",
        "brand",
        "number",
        "card_holder",
        "bank",
        "country",
        "card_exp_month",
        "card_exp_year",
        "card_type",
        "card_token",
        "card_id"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardModel {

    @JsonProperty("bin")
    private String bin;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("number")
    private String number;
    @JsonProperty("card_holder")
    private String cardHolder;
    @JsonProperty("bank")
    private String bank;
    @JsonProperty("country")
    private String country;
    @JsonProperty("card_exp_month")
    private String cardExpMonth;
    @JsonProperty("card_exp_year")
    private Integer cardExpYear;
    @JsonProperty("card_type")
    private String cardType;
    @JsonProperty("card_token")
    private CardTokenModel cardToken;
    @JsonProperty("card_id")
    private String cardId;
}
