package org.automation.utilities;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@UtilityClass
public class FakerGenerator {

    public String randomEmail() {
        return "random_email" + System.currentTimeMillis() / 1000L + "@example.com";
    }

    public String randomPhoneNumber() {
        return Faker.instance().phoneNumber().phoneNumber();
    }

    public LocalDate randomBirthday() {
        return LocalDate.now().minusYears(randomInteger(25, 65));
    }

    public String randomOrderId() {
        return UUID.randomUUID().toString();
    }

    public int randomInteger() {
        return randomInteger(1, 30);
    }

    public int randomInteger(int min, int max) {
        return Faker.instance().number().numberBetween(min, max);
    }

    public long randomAmount(long min, long max) {
        return Faker.instance().number().numberBetween(min, max);
    }

    public String randomString(int length) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(new Random().nextInt(alphabet.length())));
        }
        return sb.toString();
    }

    public <T extends Enum<T>> T randomObjectFromEnum(Class<T> enumType) {
        var allValues = enumType.getEnumConstants();
        var index = new Faker().number().numberBetween(0, allValues.length);
        return Enum.valueOf(enumType, allValues[index].name());
    }
}
