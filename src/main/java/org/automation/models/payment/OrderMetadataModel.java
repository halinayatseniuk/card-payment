package org.automation.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({
        "coupon_code",
        "partner_id"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderMetadataModel {

    @JsonProperty("coupon_code")
    private String couponCode;
    @JsonProperty("partner_id")
    private String partnerId;
}
