package com.tintachina.experimental.compliment.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Compliment {
    
    private final ComplimentId complimentId;
    private final Point point;

    @Value
    public static class ComplimentId {
        private Long value;
    }
    
}
