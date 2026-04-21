package org.automation.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "payment_type"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FutureUsageModel {

    @JsonProperty("payment_type")
    private String paymentType;
}
