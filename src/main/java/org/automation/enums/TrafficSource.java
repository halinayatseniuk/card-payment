package org.automation.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TrafficSource {

    FACEBOOK("facebook");

    private final String source;
}
