package org.automation.pages;

import com.codeborne.selenide.Condition;
import org.automation.configs.CardInfoHolder;
import org.automation.enums.Currency;
import org.automation.utilities.Converter;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class PaymentProcessingPage {

    private final By cardNumberInput = By.cssSelector("[data-testid='cardNumber']");
    private final By cardExpirationDateInput = By.cssSelector("[data-testid='cardExpiryDate']");
    private final By cardCvvInput = By.cssSelector("[data-testid='cardCvv']");
    private final By cardHolderInput = By.cssSelector("[data-testid='cardHolder']");
    private final By paymentAmountValue = By.cssSelector("[data-testid='price_major']");
    private final By paymentAmountValueInSubmitButton = By.className("SubmitButton_rootText__TkkKK");

    public PaymentProcessingPage fillCardData(CardInfoHolder cardInfo) {
        $(cardNumberInput).shouldBe(Condition.visible, Duration.ofSeconds(5))
                .setValue(cardInfo.getCardNumber());
        $(cardExpirationDateInput).shouldBe(Condition.visible)
                .setValue(cardInfo.getExpirationDate());
        $(cardCvvInput).shouldBe(Condition.visible)
                .setValue(cardInfo.getCvv());
        $(cardHolderInput).shouldBe(Condition.visible)
                .setValue(cardInfo.getCardHolder());
        return this;
    }

    public PaymentProcessingPage verifyAmountValuesOnPaymentPage(long expectedAmount, Currency currency) {
        var convertedAmount = Converter.convertLongAmountToStringWithCurrency(expectedAmount, currency);

        $(paymentAmountValue).shouldBe(Condition.visible, Duration.ofSeconds(5))
                .shouldHave(Condition.exactText(convertedAmount));
        $(paymentAmountValueInSubmitButton).shouldBe(Condition.visible, Duration.ofSeconds(5))
                .shouldHave(Condition.exactText("Pay " + convertedAmount));
        return this;
    }
}
