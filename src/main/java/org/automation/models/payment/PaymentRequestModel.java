package org.automation.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "order",
        "page_customization"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentRequestModel {

    @JsonProperty("order")
    private PaymentOrderModel order;
    @JsonProperty("page_customization")
    private PageCustomizationModel pageCustomization;
}
