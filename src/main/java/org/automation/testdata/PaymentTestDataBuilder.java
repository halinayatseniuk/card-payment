package org.automation.testdata;

import org.automation.enums.*;
import org.automation.models.payment.*;

import java.time.LocalDateTime;
import java.util.List;

public class PaymentTestDataBuilder {

    public static PaymentRequestModel generatePaymentRequest() {
        return PaymentRequestModel.builder()
                .order(randomOrderData())
                .pageCustomization(defaultPageCustomization())
                .build();
    }

    public static PaymentOrderModel randomOrderData() {
        return PaymentOrderModel.builder()
                .orderId(FakerGenerator.randomOrderId())
                .amount(FakerGenerator.randomAmount(10000, 50000))
                .currency(FakerGenerator.randomObjectFromEnum(Currency.class).name())
                .futureUsage(FutureUsageModel.builder().paymentType(PaymentType.ONETIME.getType()).build())
                .orderDescription(FakerGenerator.randomString(20))
                .orderItems(FakerGenerator.randomString(20))
                .orderDate(LocalDateTime.now().toString())
                .orderNumber(FakerGenerator.randomInteger())
                .settleInterval(FakerGenerator.randomInteger())
                .authorizationType(AuthorizationType.FINAL.getType())
                .force3ds(false)
                .googlePayAllowedAuthMethods(List.of(GPayAuthMethod.PAN_ONLY))
                .customerDateOfBirth(FakerGenerator.randomBirthday().toString())
                .customerEmail(FakerGenerator.randomEmail())
                .customerFirstName(FakerGenerator.randomString(8))
                .customerLastName(FakerGenerator.randomString(8))
                .customerPhone(FakerGenerator.randomPhoneNumber())
                .billingAddress(defaultUSABillingAddress())
                .trafficSource(TrafficSource.FACEBOOK.getSource())
                .transactionSource(null)
                .purchaseCountry("USA")
                .geoCountry("USA")
                .geoCity("New York")
                .language("en")
                .website(FakerGenerator.randomString(10))
                .orderMetadata(randomOrderMetadata())
                .successUrl("https://merchant.example/success")
                .failUrl("https://merchant.example/fail")
                .build();
    }

    public static OrderMetadataModel randomOrderMetadata() {
        return OrderMetadataModel.builder()
                .couponCode(FakerGenerator.randomString(5))
                .partnerId(FakerGenerator.randomString(10))
                .build();
    }

    public static BillingAddressModel defaultUSABillingAddress() {
        return BillingAddressModel.builder()
                .country("USA")
                .state("NY")
                .city("New York")
                .zip("10001")
                .address("123 Main St")
                .build();
    }

    public static PageCustomizationModel defaultPageCustomization() {
        return PageCustomizationModel.builder()
                .publicName("Public Name")
                .orderTitle("Order Title")
                .orderDescription("Premium package")
                .paymentMethods(List.of(PaymentMethod.PAYPAL.getMethod()))
                .buttonFontColor("#FFFFFF")
                .buttonColor("#00816A")
                .fontName("Open Sans")
                .isCardholderVisible(true)
                .termsUrl("https://merchant.example/terms")
                .backUrl("https://merchant.example/back")
                .build();
    }
}
