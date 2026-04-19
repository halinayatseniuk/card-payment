package org.automation.pages;

import com.codeborne.selenide.Condition;
import org.automation.enums.Currency;
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

    public PaymentProcessingPage typeDefaultValidCardData() {
        $(cardNumberInput).shouldBe(Condition.visible, Duration.ofSeconds(5))
                .val("");
        $(cardExpirationDateInput).shouldBe(Condition.visible)
                .val("");
        $(cardCvvInput).shouldBe(Condition.visible)
                .val("");
        $(cardHolderInput).shouldBe(Condition.visible)
                .val("");
        return this;
    }

    public PaymentProcessingPage verifyAmountValueOnPaymentPage(long expectedAmount, Currency currency) {
        $(paymentAmountValue).shouldBe(Condition.visible, Duration.ofSeconds(5))
                .shouldHave(Condition.exactText(String.valueOf(expectedAmount)));
        $(paymentAmountValueInSubmitButton).shouldBe(Condition.visible, Duration.ofSeconds(5))
                .shouldHave(Condition.exactText(String.valueOf(expectedAmount)));
        return this;
    }
}
