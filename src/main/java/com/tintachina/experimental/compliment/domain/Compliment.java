package com.tintachina.experimental.compliment.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Data
public class Compliment {
    
    private final ComplimentId complimentId;
    private final Point point;

    @Value
    public static class ComplimentId {
        private Long value;
    }
    
}
