package org.automation.configs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CardInfoHolder {

    @JsonProperty("cardNumber")
    private String cardNumber;
    @JsonProperty("expirationDate")
    private String expirationDate;
    @JsonProperty("cvv")
    private String cvv;
    @JsonProperty("cardHolder")
    private String cardHolder;
}
