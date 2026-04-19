package org.automation.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "url",
        "guid",
        "id"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentResponseModel {

    @JsonProperty("url")
    private String url;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("id")
    private String id;
}
