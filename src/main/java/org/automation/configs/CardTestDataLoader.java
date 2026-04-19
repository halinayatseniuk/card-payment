package org.automation.configs;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CardTestDataLoader {

    public static CardInfoHolder readValidCardDataFromFile() {
        return FileLoader.loadPropertyFromFile("validCardData.json");
    }
}
