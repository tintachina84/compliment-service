package com.tintachina.experimental.compliment.adapter.out;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Table;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Table(name = "compliment")
public class ComplimentEntity {
    
    private Long complimentSeq;
    private String senderId;
    private String senderName;
    private String receiverId;
    private String receiverName;
    private BigInteger complimentPoint;
    private BigInteger rewardPoint;
    private String complimentMessage;
    private String state;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
