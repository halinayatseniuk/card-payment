package org.automation.configs;

import lombok.experimental.UtilityClass;

import java.io.InputStream;
import java.util.Objects;

import static org.automation.configs.JsonConfig.MAPPER;

@UtilityClass
public class FileLoader {

    private static final ClassLoader context = Thread.currentThread().getContextClassLoader();

    public static CardInfoHolder loadPropertyFromFile(String fileName) {
        InputStream inputStream = context.getResourceAsStream(fileName);

        if (Objects.isNull(inputStream)) {
            throw new RuntimeException(String.format("File %s not found", fileName));
        }

        CardInfoHolder cardInfoHolder;
        try {
            cardInfoHolder = MAPPER.readValue(inputStream, CardInfoHolder.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load card values", e);
        }
        return cardInfoHolder;
    }
}
