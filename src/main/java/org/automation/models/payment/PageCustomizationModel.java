package org.automation.models.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonPropertyOrder({
        "public_name",
        "order_title",
        "order_description",
        "payment_methods",
        "button_font_color",
        "button_color",
        "font_name",
        "is_cardholder_visible",
        "terms_url",
        "back_url"
})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageCustomizationModel {

    @JsonProperty("public_name")
    private String publicName;
    @JsonProperty("order_title")
    private String orderTitle;
    @JsonProperty("order_description")
    private String orderDescription;
    @JsonProperty("payment_methods")
    private List<String> paymentMethods;
    @JsonProperty("button_font_color")
    private String buttonFontColor;
    @JsonProperty("button_color")
    private String buttonColor;
    @JsonProperty("font_name")
    private String fontName;
    @JsonProperty("is_cardholder_visible")
    private Boolean isCardholderVisible;
    @JsonProperty("terms_url")
    private String termsUrl;
    @JsonProperty("back_url")
    private String backUrl;
}
